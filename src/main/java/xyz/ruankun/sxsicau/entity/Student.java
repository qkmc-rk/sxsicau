package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_student")
@DynamicInsert
@DynamicUpdate
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;
    @Column(name = "sx_student_id")
    private String sxStudentId;
    @Column(name = "sx_student_name")
    private String sxStudentName;
    @Column(name = "sx_student_phone")
    private String sxStudentPhone;
    @Column(name = "sx_student_password")
    private String sxStudentPassword;
    @Column(name = "sx_sex")
    private String sxSex;
    @Column(name = "sx_nation")
    private String sxNation;
    @Column(name = "sx_grade")
    private String sxGrade;
    @Column(name = "sx_college")
    private String sxCollege;
    @Column(name = "sx_major")
    private String sxMajor;
    @Column(name = "sx_clazz")
    private String sxClazz;
    @Column(name = "sx_campus")
    private String sxCampus;
    @Column(name = "sx_picture")
    private String sxPicture;
    @Column(name = "sx_is_lock")
    private Boolean sxIsLock;
    @Column(name = "sx_gtm_create")
    private Date sxGtmCreate;
    @Column(name = "sx_gtm_modified")
    private Date sxGtmModified;
    @Column(name = "sx_totor_up")
    private Integer sxTotorUp;    // 一个学生最多能选多少个导师

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

    public String getSxStudentName() {
        return sxStudentName;
    }

    public void setSxStudentName(String sxStudentName) {
        this.sxStudentName = sxStudentName;
    }

    public String getSxStudentPhone() {
        return sxStudentPhone;
    }

    public void setSxStudentPhone(String sxStudentPhone) {
        this.sxStudentPhone = sxStudentPhone;
    }

    public String getSxStudentPassword() {
        return sxStudentPassword;
    }

    public void setSxStudentPassword(String sxStudentPassword) {
        this.sxStudentPassword = sxStudentPassword;
    }

    public String getSxSex() {
        return sxSex;
    }

    public void setSxSex(String sxSex) {
        this.sxSex = sxSex;
    }

    public String getSxNation() {
        return sxNation;
    }

    public void setSxNation(String sxNation) {
        this.sxNation = sxNation;
    }

    public String getSxGrade() {
        return sxGrade;
    }

    public void setSxGrade(String sxGrade) {
        this.sxGrade = sxGrade;
    }

    public String getSxCollege() {
        return sxCollege;
    }

    public void setSxCollege(String sxCollege) {
        this.sxCollege = sxCollege;
    }

    public String getSxMajor() {
        return sxMajor;
    }

    public void setSxMajor(String sxMajor) {
        this.sxMajor = sxMajor;
    }

    public String getSxClazz() {
        return sxClazz;
    }

    public void setSxClazz(String sxClazz) {
        this.sxClazz = sxClazz;
    }

    public String getSxCampus() {
        return sxCampus;
    }

    public void setSxCampus(String sxCampus) {
        this.sxCampus = sxCampus;
    }

    public String getSxPicture() {
        return sxPicture;
    }

    public void setSxPicture(String sxPicture) {
        this.sxPicture = sxPicture;
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

    public Integer getSxTotorUp() {
        return sxTotorUp;
    }

    public void setSxTotorUp(Integer sxTotorUp) {
        this.sxTotorUp = sxTotorUp;
    }
}
