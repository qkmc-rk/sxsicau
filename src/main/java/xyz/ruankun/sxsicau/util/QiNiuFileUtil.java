package xyz.ruankun.sxsicau.util;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import xyz.ruankun.sxsicau.util.constant.ImageType;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * 对象存储工具
 */
public class QiNiuFileUtil {

    private static final Logger logger = LoggerFactory.getLogger(QiNiuFileUtil.class);

    private static String accessKey;
    private static String secretKey;
    private static String dns;
    private static String dns2;

    /**
     * 加载七牛云的配置文件
     */
    static{
        Properties properties = new Properties();
        InputStream inputStream = QiNiuFileUtil.class.getClassLoader()
                .getResourceAsStream("qiniuyun.properties");
        try {
            properties.load(inputStream);
            accessKey = properties.getProperty("accessKey");
            secretKey = properties.getProperty("secretKey");
            dns = properties.getProperty("dns");
            dns2 = properties.getProperty("dns2");
        } catch (IOException e) {
            logger.error("qiniu cloud load properties[name:qiniuyun.properties] in classpath failed.");
            e.printStackTrace();
        }
    }

    /**
     *
     * 上传文件到七牛云的工具
     * @param inputStream
     * @return
     */
    public static String uploadToQiNiu(InputStream inputStream,String key){

        if(inputStream == null){
            logger.info("传入的图片二进制流不存在,忽略上传过程");
            return null;
        }
        //zone0表示华东区域，该bucket在华东
        Configuration configuration = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(configuration);
        String bucket = "public";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        //System.out.println(upToken);
        try {
            Response response = uploadManager.put(inputStream,key,upToken,null,null);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
            return getDns() + "/" + putRet.key;
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("请求时发生了错误信息");
        return null;
    }

    /**
     * qrcode需要使用https
     * @param inputStream
     * @param key
     * @return
     */
    public static String uploadToQiNiuWithHttps(InputStream inputStream,String key){

        if(inputStream == null){
            logger.info("传入的图片二进制流不存在, 忽略上传过程");
            return null;
        }
        //zone0表示华东区域，该bucket在华东
        Configuration configuration = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(configuration);
        String bucket = "public";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        //System.out.println(upToken);
        try {
            Response response = uploadManager.put(inputStream,key,upToken,null,null);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
            return getDns2() + "/" + putRet.key;
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("请求时发生了错误信息");
        return null;
    }

    public static String getDns2() {
        return dns2;
    }

    public static String getDns(){
        return dns;
    }
    /**
     * 传文件
     * @param inputStream
     * @param key
     * @return 文件路径
     */
    public static String uploadFileToQiNiu(InputStream inputStream,String key){
        return  uploadToQiNiu(inputStream,key);
    }

    /**
     *  MD5 KEY
     * @param file
     * @return
     */
    public static String uploadImageToQiNiu(MultipartFile file){
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        String tail = getTail(file.getOriginalFilename());
        return uploadToQiNiu(inputStream,MD5Util.md5(new Date().toString()) + tail);
    }

    /**
     * 获取图片时使用https
     * @param file
     * @return
     */
    public static String uploadImageToQiNiuWithHttps(MultipartFile file){
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        String tail = getTail(file.getOriginalFilename());
        return uploadToQiNiuWithHttps(inputStream,MD5Util.md5(new Date().toString()) + tail);
    }

    /**
     * 判断图片的格式，只支持jpg jpeg png gif
     * @param originalImageName
     * @return
     */
    private static ImageType getImgType(String originalImageName){
        if (originalImageName.toLowerCase().indexOf(".jpg") > 0)
            return ImageType.JPG;
        if (originalImageName.toLowerCase().indexOf(".jpeg") > 0)
            return ImageType.JPEG;
        if (originalImageName.toLowerCase().indexOf(".png") > 0)
            return ImageType.PNG;
        if (originalImageName.toLowerCase().indexOf(".gif") > 0)
            return ImageType.GIF;
        return null;
    }

    /**
     * 从其中拿到图片后缀
     * @param fileOriginName 文件名
     * @return
     */
    private static String getTail(String fileOriginName){
        ImageType type = getImgType(fileOriginName);
        String tail = null;
        switch (type){
            case GIF:
                tail = ".gif";
                break;
            case JPEG:
                tail = ".jpeg";
                break;
            case JPG:
                tail = ".jpg";
                break;
            case PNG:
                tail = ".png";
                break;
        }
        return tail;
    }
}
