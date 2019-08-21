package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.WxToken;

import java.util.List;

public interface WxTokenRepository extends JpaRepository<WxToken, Integer> {

    /**
     * 通过用户的ID去找用户的session
     * session存在数据库中的
     * 好神奇是不是
     * @param userId
     * @return
     */
    List<WxToken> findAllByUserId(Integer userId);

    WxToken findById(int wxTokenId);

    /**
     * 通过token号码拿到token信息
     * @param token
     * @return
     */
    WxToken findByToken(String token);
}
