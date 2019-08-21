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
    private Integer sx_id;
    @Column(name = "sx_student_id")
    private String sx_student_id;
    @Column(name = "sx_student_name")
    private String sx_student_name;
    @Column(name = "sx_major")
    private String sx_major;
    @Column(name = "sx_title")
    private String sx_title;
    @Column(name = "sx_report")
    private String sx_report;
    @Column(name = "sx_picture")
    private String sx_picture;
    @Column(name = "sx_video")
    private String sx_video;
    @Column(name = "sx_gtm_modified")
    private Date sx_gtm_modified;
    @Column(name = "sx_gtm_create")
    private Date sx_gtm_create;
    @Column(name = "sx_praise")
    private Integer sx_praise;
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

    public String getSx_student_name() {
        return sx_student_name;
    }

    public void setSx_student_name(String sx_student_name) {
        this.sx_student_name = sx_student_name;
    }

    public String getSx_major() {
        return sx_major;
    }

    public void setSx_major(String sx_major) {
        this.sx_major = sx_major;
    }

    public String getSx_title() {
        return sx_title;
    }

    public void setSx_title(String sx_title) {
        this.sx_title = sx_title;
    }

    public String getSx_report() {
        return sx_report;
    }

    public void setSx_report(String sx_report) {
        this.sx_report = sx_report;
    }

    public String getSx_picture() {
        return sx_picture;
    }

    public void setSx_picture(String sx_picture) {
        this.sx_picture = sx_picture;
    }

    public String getSx_video() {
        return sx_video;
    }

    public void setSx_video(String sx_video) {
        this.sx_video = sx_video;
    }

    public Date getSx_gtm_modified() {
        return sx_gtm_modified;
    }

    public void setSx_gtm_modified(Date sx_gtm_modified) {
        this.sx_gtm_modified = sx_gtm_modified;
    }

    public Date getSx_gtm_create() {
        return sx_gtm_create;
    }

    public void setSx_gtm_create(Date sx_gtm_create) {
        this.sx_gtm_create = sx_gtm_create;
    }

    public Integer getSx_praise() {
        return sx_praise;
    }

    public void setSx_praise(Integer sx_praise) {
        this.sx_praise = sx_praise;
    }

    public Boolean getSx_is_visible() {
        return sx_is_visible;
    }

    public void setSx_is_visible(Boolean sx_is_visible) {
        this.sx_is_visible = sx_is_visible;
    }
}
