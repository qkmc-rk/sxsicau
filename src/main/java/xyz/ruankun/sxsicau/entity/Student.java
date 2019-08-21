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
    private Integer sx_id;
    @Column(name = "sx_student_id")
    private String sx_student_id;
    @Column(name = "sx_student_name")
    private String sx_student_name;
    @Column(name = "sx_student_phone")
    private String sx_student_phone;
    @Column(name = "sx_student_password")
    private String sx_student_password;
    @Column(name = "sx_sex")
    private String sx_sex;
    @Column(name = "sx_nation")
    private String sx_nation;
    @Column(name = "sx_grade")
    private String sx_grade;
    @Column(name = "sx_college")
    private String sx_college;
    @Column(name = "sx_major")
    private String sx_major;
    @Column(name = "sx_clazz")
    private String sx_clazz;
    @Column(name = "sx_campus")
    private String sx_campus;
    @Column(name = "sx_picture")
    private String sx_picture;
    @Column(name = "sx_is_lock")
    private Boolean sx_is_lock;
    @Column(name = "sx_gtm_create")
    private Date sx_gtm_create;
    @Column(name = "sx_gtm_modified")
    private Date sx_gtm_modified;
    @Column(name = "sx_totor_up")
    private Integer sx_totor_up;    // 一个学生最多能选多少个导师

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

    public String getSx_student_phone() {
        return sx_student_phone;
    }

    public void setSx_student_phone(String sx_student_phone) {
        this.sx_student_phone = sx_student_phone;
    }

    public String getSx_student_password() {
        return sx_student_password;
    }

    public void setSx_student_password(String sx_student_password) {
        this.sx_student_password = sx_student_password;
    }

    public String getSx_sex() {
        return sx_sex;
    }

    public void setSx_sex(String sx_sex) {
        this.sx_sex = sx_sex;
    }

    public String getSx_nation() {
        return sx_nation;
    }

    public void setSx_nation(String sx_nation) {
        this.sx_nation = sx_nation;
    }

    public String getSx_grade() {
        return sx_grade;
    }

    public void setSx_grade(String sx_grade) {
        this.sx_grade = sx_grade;
    }

    public String getSx_college() {
        return sx_college;
    }

    public void setSx_college(String sx_college) {
        this.sx_college = sx_college;
    }

    public String getSx_major() {
        return sx_major;
    }

    public void setSx_major(String sx_major) {
        this.sx_major = sx_major;
    }

    public String getSx_clazz() {
        return sx_clazz;
    }

    public void setSx_clazz(String sx_clazz) {
        this.sx_clazz = sx_clazz;
    }

    public String getSx_campus() {
        return sx_campus;
    }

    public void setSx_campus(String sx_campus) {
        this.sx_campus = sx_campus;
    }

    public String getSx_picture() {
        return sx_picture;
    }

    public void setSx_picture(String sx_picture) {
        this.sx_picture = sx_picture;
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

    public Integer getSx_totor_up() {
        return sx_totor_up;
    }

    public void setSx_totor_up(Integer sx_totor_up) {
        this.sx_totor_up = sx_totor_up;
    }
}
