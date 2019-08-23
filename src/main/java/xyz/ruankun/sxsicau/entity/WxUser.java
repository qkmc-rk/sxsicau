package xyz.ruankun.sxsicau.entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wx_user")
@DynamicInsert
@DynamicUpdate
public class WxUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "openid")
    private String openId;
    @Column(name = "wx_number")
    private String wxNumber;
    @Column(name = "is_black")
    private Boolean isBlack;
    @Column(name = "gmt_create")
    private Date gmtCreate;
    @Column(name = "gmt_modified")
    private Date gmtModified;
    @Column(name = "binding_number")
    private String bindingNumber;    // 绑定的学号或者教师号
    @Column(name = "binding_role")
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
        if (bindingRole != null && bindingRole == 0)
            this.bindingRole = STUDENT;
        else if (bindingRole == null)
            this.bindingRole = null;
        else
            this.bindingRole = TEACHER;

    }

    @Override
    public String toString() {
        return "WxUser{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", wxNumber='" + wxNumber + '\'' +
                ", isBlack=" + isBlack +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", bindingNumber='" + bindingNumber + '\'' +
                ", bindingRole=" + bindingRole +
                '}';
    }
}
