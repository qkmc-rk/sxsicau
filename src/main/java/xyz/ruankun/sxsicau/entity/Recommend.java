package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_ext_recommend")
@DynamicUpdate
@DynamicInsert
public class Recommend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_ext_id")
    private Integer sxExtId;
    @Column(name = "sx_ext_rcmd_stu_id")
    private String sxExtRcmdStuId;
    @Column(name = "sx_ext_gmt_modified")
    private Date sxExtGmtModified;
    @Column(name = "sx_ext_gmt_create")
    private Date sxExtGmtCreate;
    @Column(name = "sx_ext_root_id")
    private Integer sxExtRootId;    // 管理员ID
    @Column(name = "sx_ext_rcmder_id")
    private String sxExtRcmderId;
    @Column(name = "sx_ext_is_visible")
    private Boolean sxExtIsVisible;


    public Integer getSxExtId() {
        return sxExtId;
    }

    public void setSxExtId(Integer sxExtId) {
        this.sxExtId = sxExtId;
    }

    public String getSxExtRcmdStuId() {
        return sxExtRcmdStuId;
    }

    public void setSxExtRcmdStuId(String sxExtRcmdStuId) {
        this.sxExtRcmdStuId = sxExtRcmdStuId;
    }

    public Date getSxExtGmtModified() {
        return sxExtGmtModified;
    }

    public void setSxExtGmtModified(Date sxExtGmtModified) {
        this.sxExtGmtModified = sxExtGmtModified;
    }

    public Date getSxExtGmtCreate() {
        return sxExtGmtCreate;
    }

    public void setSxExtGmtCreate(Date sxExtGmtCreate) {
        this.sxExtGmtCreate = sxExtGmtCreate;
    }

    public Integer getSxExtRootId() {
        return sxExtRootId;
    }

    public void setSxExtRootId(Integer sxExtRootId) {
        this.sxExtRootId = sxExtRootId;
    }

    public String getSxExtRcmderId() {
        return sxExtRcmderId;
    }

    public void setSxExtRcmderId(String sxExtRcmderId) {
        this.sxExtRcmderId = sxExtRcmderId;
    }

    public Boolean getSxExtIsVisible() {
        return sxExtIsVisible;
    }

    public void setSxExtIsVisible(Boolean sxExtIsVisible) {
        this.sxExtIsVisible = sxExtIsVisible;
    }
}
