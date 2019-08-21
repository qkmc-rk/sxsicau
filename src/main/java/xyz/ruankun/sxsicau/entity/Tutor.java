package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_tutor")
@DynamicInsert
@DynamicUpdate
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sx_id;
    @Column(name = "sx_student_id")
    private String sx_student_id;
    @Column(name = "sx_teacher_id")
    private String sx_teacher_id;
    @Column(name = "sx_is_confirm")
    private Boolean sx_is_confirm;
    @Column(name = "sx_is_lock")
    private Boolean sx_is_lock;
    @Column(name = "sx_gtm_create")
    private Date sx_gtm_create;
    @Column(name = "sx_gtm_modified")
    private Date sx_gtm_modified;
    @Column(name = "sx_is_visible")
    private Boolean sx_is_visible;

    public Integer getSx_id() {
        return sx_id;
    }

    public void setSx_id(Integer sx_id) {
        this.sx_id = sx_id;
    }

    public String getSx_student_id() {
        return sx_student_id;
    }

    public void setSx_student_id(String sx_student_id) {
        this.sx_student_id = sx_student_id;
    }

    public String getSx_teacher_id() {
        return sx_teacher_id;
    }

    public void setSx_teacher_id(String sx_teacher_id) {
        this.sx_teacher_id = sx_teacher_id;
    }

    public Boolean getSx_is_confirm() {
        return sx_is_confirm;
    }

    public void setSx_is_confirm(Boolean sx_is_confirm) {
        this.sx_is_confirm = sx_is_confirm;
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

    public Boolean getSx_is_visible() {
        return sx_is_visible;
    }

    public void setSx_is_visible(Boolean sx_is_visible) {
        this.sx_is_visible = sx_is_visible;
    }
}
