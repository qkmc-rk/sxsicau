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
    private Integer sx_id;
    @Column(name = "sx_teacher_id")
    private String sx_teacher_id;
    @Column(name = "sx_picture")
    private String sx_picture;
    @Column(name = "sx_gtm_modified")
    private Date sx_gtm_modified;
    @Column(name = "sx_gtm_create")
    private Date sx_gtm_create;
    @Column(name = "sx_name")
    private String sx_name;
    @Column(name = "sx_sex")
    private String sx_sex;
    @Column(name = "sx_birth")
    private String sx_birth;
    @Column(name = "sx_type")
    private String sx_type;
    @Column(name = "sx_unit")
    private String sx_unit;
    @Column(name = "sx_admin")
    private String sx_admin;
    @Column(name = "sx_admin_phone")
    private String sx_admin_phone;
    @Column(name = "sx_tech_major")
    private String sx_tech_major;
    @Column(name = "sx_email")
    private String sx_email;
    @Column(name = "sx_introduce")
    private String sx_introduce;
    @Column(name = "sx_work_exp")
    private String sx_work_exp;
    @Column(name = "sx_edu_exp")
    private String sx_edu_exp;
    @Column(name = "sx_award")
    private String sx_award;
    @Column(name = "sx_other_status")
    private String sx_other_status;
    @Column(name = "sx_research_area")
    private String sx_research_area;
    @Column(name = "sx_sci_resch_project")
    private String sx_sci_resch_project;
    @Column(name = "sx_paper")
    private String sx_paper;
    @Column(name = "sx_book")
    private String sx_book;
    @Column(name = "sx_students")
    private String sx_students;
    @Column(name = "sx_is_visible")
    private Boolean sx_is_visible;

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

    public String getSx_picture() {
        return sx_picture;
    }

    public void setSx_picture(String sx_picture) {
        this.sx_picture = sx_picture;
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

    public String getSx_name() {
        return sx_name;
    }

    public void setSx_name(String sx_name) {
        this.sx_name = sx_name;
    }

    public String getSx_sex() {
        return sx_sex;
    }

    public void setSx_sex(String sx_sex) {
        this.sx_sex = sx_sex;
    }

    public String getSx_birth() {
        return sx_birth;
    }

    public void setSx_birth(String sx_birth) {
        this.sx_birth = sx_birth;
    }

    public String getSx_type() {
        return sx_type;
    }

    public void setSx_type(String sx_type) {
        this.sx_type = sx_type;
    }

    public String getSx_unit() {
        return sx_unit;
    }

    public void setSx_unit(String sx_unit) {
        this.sx_unit = sx_unit;
    }

    public String getSx_admin() {
        return sx_admin;
    }

    public void setSx_admin(String sx_admin) {
        this.sx_admin = sx_admin;
    }

    public String getSx_admin_phone() {
        return sx_admin_phone;
    }

    public void setSx_admin_phone(String sx_admin_phone) {
        this.sx_admin_phone = sx_admin_phone;
    }

    public String getSx_tech_major() {
        return sx_tech_major;
    }

    public void setSx_tech_major(String sx_tech_major) {
        this.sx_tech_major = sx_tech_major;
    }

    public String getSx_email() {
        return sx_email;
    }

    public void setSx_email(String sx_email) {
        this.sx_email = sx_email;
    }

    public String getSx_introduce() {
        return sx_introduce;
    }

    public void setSx_introduce(String sx_introduce) {
        this.sx_introduce = sx_introduce;
    }

    public String getSx_work_exp() {
        return sx_work_exp;
    }

    public void setSx_work_exp(String sx_work_exp) {
        this.sx_work_exp = sx_work_exp;
    }

    public String getSx_edu_exp() {
        return sx_edu_exp;
    }

    public void setSx_edu_exp(String sx_edu_exp) {
        this.sx_edu_exp = sx_edu_exp;
    }

    public String getSx_award() {
        return sx_award;
    }

    public void setSx_award(String sx_award) {
        this.sx_award = sx_award;
    }

    public String getSx_other_status() {
        return sx_other_status;
    }

    public void setSx_other_status(String sx_other_status) {
        this.sx_other_status = sx_other_status;
    }

    public String getSx_research_area() {
        return sx_research_area;
    }

    public void setSx_research_area(String sx_research_area) {
        this.sx_research_area = sx_research_area;
    }

    public String getSx_sci_resch_project() {
        return sx_sci_resch_project;
    }

    public void setSx_sci_resch_project(String sx_sci_resch_project) {
        this.sx_sci_resch_project = sx_sci_resch_project;
    }

    public String getSx_paper() {
        return sx_paper;
    }

    public void setSx_paper(String sx_paper) {
        this.sx_paper = sx_paper;
    }

    public String getSx_book() {
        return sx_book;
    }

    public void setSx_book(String sx_book) {
        this.sx_book = sx_book;
    }

    public String getSx_students() {
        return sx_students;
    }

    public void setSx_students(String sx_students) {
        this.sx_students = sx_students;
    }

    public Boolean getSx_is_visible() {
        return sx_is_visible;
    }

    public void setSx_is_visible(Boolean sx_is_visible) {
        this.sx_is_visible = sx_is_visible;
    }
}
