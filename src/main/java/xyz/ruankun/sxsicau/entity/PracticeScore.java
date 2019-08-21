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
    private Integer sx_id;

    @Column(name = "sx_teacher_id")
    private String sx_teacher_id;
    @Column(name = "sx_practice_id")
    private Integer sx_practice_id;
    @Column(name = "sx_gtm_create")
    private Date sx_gtm_create;
    @Column(name = "sx_score")
    private BigDecimal sx_score;
    @Column(name = "sx_remark")
    private String sx_remark;
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

    public Integer getSx_practice_id() {
        return sx_practice_id;
    }

    public void setSx_practice_id(Integer sx_practice_id) {
        this.sx_practice_id = sx_practice_id;
    }

    public Date getSx_gtm_create() {
        return sx_gtm_create;
    }

    public void setSx_gtm_create(Date sx_gtm_create) {
        this.sx_gtm_create = sx_gtm_create;
    }

    public BigDecimal getSx_score() {
        return sx_score;
    }

    public void setSx_score(BigDecimal sx_score) {
        this.sx_score = sx_score;
    }

    public String getSx_remark() {
        return sx_remark;
    }

    public void setSx_remark(String sx_remark) {
        this.sx_remark = sx_remark;
    }

    public Date getSx_gtm_modified() {
        return sx_gtm_modified;
    }

    public void setSx_gtm_modified(Date sx_gtm_modified) {
        this.sx_gtm_modified = sx_gtm_modified;
    }
}
