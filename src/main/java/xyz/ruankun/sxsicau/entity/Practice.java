package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_practice")
@DynamicUpdate
@DynamicInsert
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;
    @Column(name = "sx_student_id")
    private String sxStudentId;
    @Column(name = "sx_student_name")
    private String sxStudentName;
    @Column(name = "sx_major")
    private String sxMajor;
    @Column(name = "sx_title")
    private String sxTitle;
    @Column(name = "sx_report")
    private String sxReport;
    @Column(name = "sx_picture")
    private String sxPicture;
    @Column(name = "sx_video")
    private String sxVideo;
    @Column(name = "sx_gtm_modified")
    private Date sxGtmModified;
    @Column(name = "sx_gtm_create")
    private Date sxGtmCreate;
    @Column(name = "sx_praise")
    private Integer sxPraise;
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

    public String getSxStudentName() {
        return sxStudentName;
    }

    public void setSxStudentName(String sxStudentName) {
        this.sxStudentName = sxStudentName;
    }

    public String getSxMajor() {
        return sxMajor;
    }

    public void setSxMajor(String sxMajor) {
        this.sxMajor = sxMajor;
    }

    public String getSxTitle() {
        return sxTitle;
    }

    public void setSxTitle(String sxTitle) {
        this.sxTitle = sxTitle;
    }

    public String getSxReport() {
        return sxReport;
    }

    public void setSxReport(String sxReport) {
        this.sxReport = sxReport;
    }

    public String getSxPicture() {
        return sxPicture;
    }

    public void setSxPicture(String sxPicture) {
        this.sxPicture = sxPicture;
    }

    public String getSxVideo() {
        return sxVideo;
    }

    public void setSxVideo(String sxVideo) {
        this.sxVideo = sxVideo;
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

    public Integer getSxPraise() {
        return sxPraise;
    }

    public void setSxPraise(Integer sxPraise) {
        this.sxPraise = sxPraise;
    }

    public Boolean getSxIsVisible() {
        return sxIsVisible;
    }

    public void setSxIsVisible(Boolean sxIsVisible) {
        this.sxIsVisible = sxIsVisible;
    }
}
