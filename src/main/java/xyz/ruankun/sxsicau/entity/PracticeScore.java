package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "sx_practice_score")
@DynamicInsert
@DynamicUpdate
public class PracticeScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;

    @Column(name = "sx_teacher_id")
    private String sxTeacherId;
    @Column(name = "sx_practice_id")
    private Integer sxPracticeId;
    @Column(name = "sx_gtm_create")
    private Date sxGtmCreate;
    @Column(name = "sx_score")
    private BigDecimal sxScore;
    @Column(name = "sx_remark")
    private String sxRemark;
    @Column(name = "sx_gtm_modified")
    private Date sxGtmModified;

    public Integer getSxId() {
        return sxId;
    }

    public void setSxId(Integer sxId) {
        this.sxId = sxId;
    }

    public String getSxTeacherId() {
        return sxTeacherId;
    }

    public void setSxTeacherId(String sxTeacherId) {
        this.sxTeacherId = sxTeacherId;
    }

    public Integer getSxPracticeId() {
        return sxPracticeId;
    }

    public void setSxPracticeId(Integer sxPracticeId) {
        this.sxPracticeId = sxPracticeId;
    }

    public Date getSxGtmCreate() {
        return sxGtmCreate;
    }

    public void setSxGtmCreate(Date sxGtmCreate) {
        this.sxGtmCreate = sxGtmCreate;
    }

    public BigDecimal getSxScore() {
        return sxScore;
    }

    public void setSxScore(BigDecimal sxScore) {
        this.sxScore = sxScore;
    }

    public String getSxRemark() {
        return sxRemark;
    }

    public void setSxRemark(String sxRemark) {
        this.sxRemark = sxRemark;
    }

    public Date getSxGtmModified() {
        return sxGtmModified;
    }

    public void setSxGtmModified(Date sxGtmModified) {
        this.sxGtmModified = sxGtmModified;
    }
}
