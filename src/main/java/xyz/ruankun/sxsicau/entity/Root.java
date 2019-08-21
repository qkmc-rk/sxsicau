package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_root")
@DynamicUpdate
@DynamicInsert
public class Root {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sx_id;
    @Column(name = "sx_account")
    private String sx_account;
    @Column(name = "sx_password")
    private String sx_password;
    @Column(name = "sx_is_lock")
    private Boolean sx_is_lock;
    @Column(name = "sx_gtm_create")
    private Date sx_gtm_create;
    @Column(name = "sx_gtm_modified")
    private Date sx_gtm_modified;


    public Integer getSx_id() {
        return sx_id;
    }

    public void setSx_id(Integer sx_id) {
        this.sx_id = sx_id;
    }

    public String getSx_account() {
        return sx_account;
    }

    public void setSx_account(String sx_account) {
        this.sx_account = sx_account;
    }

    public String getSx_password() {
        return sx_password;
    }

    public void setSx_password(String sx_password) {
        this.sx_password = sx_password;
    }

    public Boolean getSx_is_lock() {
        return sx_is_lock;
    }

    public void setSx_is_lock(Boolean sx_is_lock) {
        this.sx_is_lock = sx_is_lock;
    }

    public Date getSx_gtm_create() {
        return sx_gtm_create;
    }

    public void setSx_gtm_create(Date sx_gtm_create) {
        this.sx_gtm_create = sx_gtm_create;
    }

    public Date getSx_gtm_modified() {
        return sx_gtm_modified;
    }

    public void setSx_gtm_modified(Date sx_gtm_modified) {
        this.sx_gtm_modified = sx_gtm_modified;
    }
}
