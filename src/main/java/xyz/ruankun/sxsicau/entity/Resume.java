package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_teacher_resume")
@DynamicInsert
@DynamicUpdate
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;
    @Column(name = "sx_teacher_id")
    private String sxTeacherId;
    @Column(name = "sx_picture")
    private String sxPicture;
    @Column(name = "sx_gtm_modified")
    private Date sxGtmModified;
    @Column(name = "sx_gtm_create")
    private Date sxGtmCreate;
    @Column(name = "sx_name")
    private String sxName;
    @Column(name = "sx_sex")
    private String sxSex;
    @Column(name = "sx_birth")
    private String sxBirth;
    @Column(name = "sx_type")
    private String sxType;
    @Column(name = "sx_unit")
    private String sxUnit;
    @Column(name = "sx_admin")
    private String sxAdmin;
    @Column(name = "sx_admin_phone")
    private String sxAdminPhone;
    @Column(name = "sx_tech_major")
    private String sxTechMajor;
    @Column(name = "sx_email")
    private String sxEmail;
    @Column(name = "sx_introduce")
    private String sxIntroduce;
    @Column(name = "sx_work_exp")
    private String sxWorkExp;
    @Column(name = "sx_edu_exp")
    private String sxEduExp;
    @Column(name = "sx_award")
    private String sxAward;
    @Column(name = "sx_other_status")
    private String sxOtherStatus;
    @Column(name = "sx_research_area")
    private String sxResearchArea;
    @Column(name = "sx_sci_resch_project")
    private String sxSciReschProject;
    @Column(name = "sx_paper")
    private String sxPaper;
    @Column(name = "sx_book")
    private String sxBook;
    @Column(name = "sx_students")
    private String sxStudents;
    @Column(name = "sx_is_visible")
    private Boolean sxIsVisible;

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

    public String getSxPicture() {
        return sxPicture;
    }

    public void setSxPicture(String sxPicture) {
        this.sxPicture = sxPicture;
    }

    public Date getSxGtmModified() {
        return sxGtmModified;
    }

    public void setSxGtmModified(Date sxGtmModified) {
        this.sxGtmModified = sxGtmModified;
    }

    public Date getSxGtmCreate() {
        return sxGtmCreate;
    }

    public void setSxGtmCreate(Date sxGtmCreate) {
        this.sxGtmCreate = sxGtmCreate;
    }

    public String getSxName() {
        return sxName;
    }

    public void setSxName(String sxName) {
        this.sxName = sxName;
    }

    public String getSxSex() {
        return sxSex;
    }

    public void setSxSex(String sxSex) {
        this.sxSex = sxSex;
    }

    public String getSxBirth() {
        return sxBirth;
    }

    public void setSxBirth(String sxBirth) {
        this.sxBirth = sxBirth;
    }

    public String getSxType() {
        return sxType;
    }

    public void setSxType(String sxType) {
        this.sxType = sxType;
    }

    public String getSxUnit() {
        return sxUnit;
    }

    public void setSxUnit(String sxUnit) {
        this.sxUnit = sxUnit;
    }

    public String getSxAdmin() {
        return sxAdmin;
    }

    public void setSxAdmin(String sxAdmin) {
        this.sxAdmin = sxAdmin;
    }

    public String getSxAdminPhone() {
        return sxAdminPhone;
    }

    public void setSxAdminPhone(String sxAdminPhone) {
        this.sxAdminPhone = sxAdminPhone;
    }

    public String getSxTechMajor() {
        return sxTechMajor;
    }

    public void setSxTechMajor(String sxTechMajor) {
        this.sxTechMajor = sxTechMajor;
    }

    public String getSxEmail() {
        return sxEmail;
    }

    public void setSxEmail(String sxEmail) {
        this.sxEmail = sxEmail;
    }

    public String getSxIntroduce() {
        return sxIntroduce;
    }

    public void setSxIntroduce(String sxIntroduce) {
        this.sxIntroduce = sxIntroduce;
    }

    public String getSxWorkExp() {
        return sxWorkExp;
    }

    public void setSxWorkExp(String sxWorkExp) {
        this.sxWorkExp = sxWorkExp;
    }

    public String getSxEduExp() {
        return sxEduExp;
    }

    public void setSxEduExp(String sxEduExp) {
        this.sxEduExp = sxEduExp;
    }

    public String getSxAward() {
        return sxAward;
    }

    public void setSxAward(String sxAward) {
        this.sxAward = sxAward;
    }

    public String getSxOtherStatus() {
        return sxOtherStatus;
    }

    public void setSxOtherStatus(String sxOtherStatus) {
        this.sxOtherStatus = sxOtherStatus;
    }

    public String getSxResearchArea() {
        return sxResearchArea;
    }

    public void setSxResearchArea(String sxResearchArea) {
        this.sxResearchArea = sxResearchArea;
    }

    public String getSxSciReschProject() {
        return sxSciReschProject;
    }

    public void setSxSciReschProject(String sxSciReschProject) {
        this.sxSciReschProject = sxSciReschProject;
    }

    public String getSxPaper() {
        return sxPaper;
    }

    public void setSxPaper(String sxPaper) {
        this.sxPaper = sxPaper;
    }

    public String getSxBook() {
        return sxBook;
    }

    public void setSxBook(String sxBook) {
        this.sxBook = sxBook;
    }

    public String getSxStudents() {
        return sxStudents;
    }

    public void setSxStudents(String sxStudents) {
        this.sxStudents = sxStudents;
    }

    public Boolean getSxIsVisible() {
        return sxIsVisible;
    }

    public void setSxIsVisible(Boolean sxIsVisible) {
        this.sxIsVisible = sxIsVisible;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "sxId=" + sxId +
                ", sxTeacherId='" + sxTeacherId + '\'' +
                ", sxPicture='" + sxPicture + '\'' +
                ", sxGtmModified=" + sxGtmModified +
                ", sxGtmCreate=" + sxGtmCreate +
                ", sxName='" + sxName + '\'' +
                ", sxSex='" + sxSex + '\'' +
                ", sxBirth='" + sxBirth + '\'' +
                ", sxType='" + sxType + '\'' +
                ", sxUnit='" + sxUnit + '\'' +
                ", sxAdmin='" + sxAdmin + '\'' +
                ", sxAdminPhone='" + sxAdminPhone + '\'' +
                ", sxTechMajor='" + sxTechMajor + '\'' +
                ", sxEmail='" + sxEmail + '\'' +
                ", sxIntroduce='" + sxIntroduce + '\'' +
                ", sxWorkExp='" + sxWorkExp + '\'' +
                ", sxEduExp='" + sxEduExp + '\'' +
                ", sxAward='" + sxAward + '\'' +
                ", sxOtherStatus='" + sxOtherStatus + '\'' +
                ", sxResearchArea='" + sxResearchArea + '\'' +
                ", sxSciReschProject='" + sxSciReschProject + '\'' +
                ", sxPaper='" + sxPaper + '\'' +
                ", sxBook='" + sxBook + '\'' +
                ", sxStudents='" + sxStudents + '\'' +
                ", sxIsVisible=" + sxIsVisible +
                '}';
    }
}
