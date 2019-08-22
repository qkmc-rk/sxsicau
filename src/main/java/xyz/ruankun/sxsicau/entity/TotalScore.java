package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "sx_total_score")
@DynamicInsert
@DynamicUpdate
public class TotalScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;
    @Column(name = "sx_teacher_id")
    private String sxTeacherId;
    @Column(name = "sx_student_id")
    private String sxStudentId;
    @Column(name = "sx_total_score")
    private BigDecimal sxTotalScore;
    @Column(name = "sx_total_remark")
    private String sxTotalRemark;
    @Column(name = "sx_gtm_create")
    private Date sxGtmCreate;
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

    public String getSxStudentId() {
        return sxStudentId;
    }

    public void setSxStudentId(String sxStudentId) {
        this.sxStudentId = sxStudentId;
    }

    public BigDecimal getSxTotalScore() {
        return sxTotalScore;
    }

    public void setSxTotalScore(BigDecimal sxTotalScore) {
        this.sxTotalScore = sxTotalScore;
    }

    public String getSxTotalRemark() {
        return sxTotalRemark;
    }

    public void setSxTotalRemark(String sxTotalRemark) {
        this.sxTotalRemark = sxTotalRemark;
    }

    public Date getSxGtmCreate() {
        return sxGtmCreate;
    }

    public void setSxGtmCreate(Date sxGtmCreate) {
        this.sxGtmCreate = sxGtmCreate;
    }

    public Date getSxGtmModified() {
        return sxGtmModified;
    }

    public void setSxGtmModified(Date sxGtmModified) {
        this.sxGtmModified = sxGtmModified;
    }
}
