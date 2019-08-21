package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_ext_follow")
@DynamicInsert
@DynamicUpdate
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_ext_id")
    private Integer sxExtId;
    @Column(name = "sx_ext_student_id")
    private String sxExtStudentId;
    @Column(name = "sx_ext_followee_id")    // 跟随的人
    private String sxExtFolloweeId;
    @Column(name = "sx_ext_gmt_create")
    private Date sxExtGmtCreate;
    @Column(name = "sx_ext_gmt_modified")
    private Date sxExtGmtModified;
    @Column(name = "sx_ext_is_following")
    private Boolean sxExtIsFollowing;

    public Integer getSxExtId() {
        return sxExtId;
    }

    public void setSxExtId(Integer sxExtId) {
        this.sxExtId = sxExtId;
    }

    public String getSxExtStudentId() {
        return sxExtStudentId;
    }

    public void setSxExtStudentId(String sxExtStudentId) {
        this.sxExtStudentId = sxExtStudentId;
    }

    public String getSxExtFolloweeId() {
        return sxExtFolloweeId;
    }

    public void setSxExtFolloweeId(String sxExtFolloweeId) {
        this.sxExtFolloweeId = sxExtFolloweeId;
    }

    public Date getSxExtGmtCreate() {
        return sxExtGmtCreate;
    }

    public void setSxExtGmtCreate(Date sxExtGmtCreate) {
        this.sxExtGmtCreate = sxExtGmtCreate;
    }

    public Date getSxExtGmtModified() {
        return sxExtGmtModified;
    }

    public void setSxExtGmtModified(Date sxExtGmtModified) {
        this.sxExtGmtModified = sxExtGmtModified;
    }

    public Boolean getSxExtIsFollowing() {
        return sxExtIsFollowing;
    }

    public void setSxExtIsFollowing(Boolean sxExtIsFollowing) {
        this.sxExtIsFollowing = sxExtIsFollowing;
    }
}
