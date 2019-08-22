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
    private Integer sxId;
    @Column(name = "sx_student_id")
    private String sxStudentId;
    @Column(name = "sx_teacher_id")
    private String sxTeacherId;
    @Column(name = "sx_is_confirm")
    private Boolean sxIsConfirm;
    @Column(name = "sx_is_lock")
    private Boolean sxIsLock;
    @Column(name = "sx_gtm_create")
    private Date sxGtmCreate;
    @Column(name = "sx_gtm_modified")
    private Date sxGtmModified;
    @Column(name = "sx_is_visible")
    private Boolean sxIsVisible;

    public Integer getSxId() {
        return sxId;
    }

    public void setSxId(Integer sxId) {
        this.sxId = sxId;
    }

    public String getSxStudentId() {
        return sxStudentId;
    }

    public void setSxStudentId(String sxStudentId) {
        this.sxStudentId = sxStudentId;
    }

    public String getSxTeacherId() {
        return sxTeacherId;
    }

    public void setSxTeacherId(String sxTeacherId) {
        this.sxTeacherId = sxTeacherId;
    }

    public Boolean getSxIsConfirm() {
        return sxIsConfirm;
    }

    public void setSxIsConfirm(Boolean sxIsConfirm) {
        this.sxIsConfirm = sxIsConfirm;
    }

    public Boolean getSxIsLock() {
        return sxIsLock;
    }

    public void setSxIsLock(Boolean sxIsLock) {
        this.sxIsLock = sxIsLock;
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

    public Boolean getSxIsVisible() {
        return sxIsVisible;
    }

    public void setSxIsVisible(Boolean sxIsVisible) {
        this.sxIsVisible = sxIsVisible;
    }
}
