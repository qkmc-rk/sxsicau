package xyz.ruankun.sxsicau.util;

/**
 * 这是一个bean，将返回的信息转换为bean
 * 错误情况 RESULT = {"result":1014,"errmsg":"package format error, template params error","ext":""}
 * 正确情况 RESULT = {"result":0,"errmsg":"OK","ext":"","sid":"26:19081221441923987","fee":2}
 */
public class SMSResult {

    private Integer result;

    private String errmsg;

    private String ext;

    //这个参数只有成功时(result==0 && errmsg = "OK" 时才有)
    private String sid;

    //这个参数只有成功时(result==0 && errmsg = "OK" 时才有)
    private Integer fee;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "SMSResult{" +
                "result=" + result +
                ", errmsg='" + errmsg + '\'' +
                ", ext='" + ext + '\'' +
                ", sid='" + sid + '\'' +
                ", fee=" + fee +
                '}';
    }
}
