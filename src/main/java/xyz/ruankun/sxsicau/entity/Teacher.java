package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_teacher")
@DynamicInsert
@DynamicUpdate
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;
    @Column(name = "sx_teacher_id")
    private String sxTeacherId;
    @Column(name = "sx_teacher_name")
    private String sxTeacherName;
    @Column(name = "sx_teacher_password")
    private String sxTeacherPassword;
    @Column(name = "sx_college")
    private String sxCollege;
    @Column(name = "sx_nation")
    private String sxNation;
    @Column(name = "sx_sex")
    private String sxSex;
    @Column(name = "sx_age")
    private String sxAge;
    @Column(name = "sx_gtm_create")
    private Date sxGtmCreate;
    @Column(name = "sx_gtm_modified")
    private Date sxGtmModified;
    @Column(name = "sx_is_lock")
    private Boolean sxIsLock;
    @Column(name = "sx_tutor_up")
    private Integer sxTutorUp;    //最多能被多少学生选
    @Column(name = "sx_tutor")
    private Integer sxTutor;   //最多可以双向选择多少个学生

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

    public String getSxTeacherName() {
        return sxTeacherName;
    }

    public void setSxTeacherName(String sxTeacherName) {
        this.sxTeacherName = sxTeacherName;
    }

    public String getSxTeacherPassword() {
        return sxTeacherPassword;
    }

    public void setSxTeacherPassword(String sxTeacherPassword) {
        this.sxTeacherPassword = sxTeacherPassword;
    }

    public String getSxCollege() {
        return sxCollege;
    }

    public void setSxCollege(String sxCollege) {
        this.sxCollege = sxCollege;
    }

    public String getSxNation() {
        return sxNation;
    }

    public void setSxNation(String sxNation) {
        this.sxNation = sxNation;
    }

    public String getSxSex() {
        return sxSex;
    }

    public void setSxSex(String sxSex) {
        this.sxSex = sxSex;
    }

    public String getSxAge() {
        return sxAge;
    }

    public void setSxAge(String sxAge) {
        this.sxAge = sxAge;
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

    public Boolean getSxIsLock() {
        return sxIsLock;
    }

    public void setSxIsLock(Boolean sxIsLock) {
        this.sxIsLock = sxIsLock;
    }

    public Integer getSxTutorUp() {
        return sxTutorUp;
    }

    public void setSxTutorUp(Integer sxTutorUp) {
        this.sxTutorUp = sxTutorUp;
    }

    public Integer getSxTutor() {
        return sxTutor;
    }

    public void setSxTutor(Integer sxTutor) {
        this.sxTutor = sxTutor;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "sxId=" + sxId +
                ", sxTeacherId='" + sxTeacherId + '\'' +
                ", sxTeacherName='" + sxTeacherName + '\'' +
                ", sxTeacherPassword='" + sxTeacherPassword + '\'' +
                ", sxCollege='" + sxCollege + '\'' +
                ", sxNation='" + sxNation + '\'' +
                ", sxSex='" + sxSex + '\'' +
                ", sxAge='" + sxAge + '\'' +
                ", sxGtmCreate=" + sxGtmCreate +
                ", sxGtmModified=" + sxGtmModified +
                ", sxIsLock=" + sxIsLock +
                ", sxTutorUp=" + sxTutorUp +
                ", sxTutor=" + sxTutor +
                '}';
    }
}
