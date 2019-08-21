package xyz.ruankun.sxsicau.entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Table(name = "wx_user")
@DynamicInsert
@DynamicUpdate
public class WxUser {

    private Integer id;

    private String openId;

    private String wxNumber;

    private Boolean isBlack;

    private Date gmtCreate;

    private Date gmtModified;

    private String bindingNumber;    // 绑定的学号或者教师号

    private Integer bindingRole;    // 0-学生 1-教师

    /**
     * 要么绑定成教师，要么绑定成学生
     */
    @Transient
    public static Integer STUDENT = 0;
    @Transient
    public static Integer TEACHER = 1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    public Boolean getBlack() {
        return isBlack;
    }

    public void setBlack(Boolean black) {
        isBlack = black;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getBindingNumber() {
        return bindingNumber;
    }

    public void setBindingNumber(String bindingNumber) {
        this.bindingNumber = bindingNumber;
    }

    public Integer getBindingRole() {
        return bindingRole;
    }

    /**
     * 小小修饰一下，只能绑定老师或者学生，无其他可绑定身份
     * @param bindingRole
     */
    public void setBindingRole(Integer bindingRole) {
        if (bindingRole == 0)
            this.bindingRole = STUDENT;
        else
            this.bindingRole = TEACHER;

    }

}
