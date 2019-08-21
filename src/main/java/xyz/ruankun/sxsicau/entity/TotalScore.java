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
    private Integer sx_id;
    @Column(name = "sx_teacher_id")
    private String sx_teacher_id;
    @Column(name = "sx_student_id")
    private String sx_student_id;
    @Column(name = "sx_total_score")
    private BigDecimal sx_total_score;
    @Column(name = "sx_total_remark")
    private String sx_total_remark;
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

    public String getSx_teacher_id() {
        return sx_teacher_id;
    }

    public void setSx_teacher_id(String sx_teacher_id) {
        this.sx_teacher_id = sx_teacher_id;
    }

    public String getSx_student_id() {
        return sx_student_id;
    }

    public void setSx_student_id(String sx_student_id) {
        this.sx_student_id = sx_student_id;
    }

    public BigDecimal getSx_total_score() {
        return sx_total_score;
    }

    public void setSx_total_score(BigDecimal sx_total_score) {
        this.sx_total_score = sx_total_score;
    }

    public String getSx_total_remark() {
        return sx_total_remark;
    }

    public void setSx_total_remark(String sx_total_remark) {
        this.sx_total_remark = sx_total_remark;
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
