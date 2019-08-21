package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.WxUser;

/**
 * 随便声明一些自己喜欢的方法吧
 */
public interface WxUserRepository extends JpaRepository<WxUser, Integer> {

    /**
     *  通过openid查找数据库存在的小程序用户
     * @param openid
     * @return
     */
    WxUser findByOpenId(String openid);

    WxUser findById(int userId);
}
