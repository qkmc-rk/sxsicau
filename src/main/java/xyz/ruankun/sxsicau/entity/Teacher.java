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
    private Integer sx_id;
    @Column(name = "sx_teacher_id")
    private String sx_teacher_id;
    @Column(name = "sx_teacher_name")
    private String sx_teacher_name;
    @Column(name = "sx_teacher_password")
    private String sx_teacher_password;
    @Column(name = "sx_college")
    private String sx_college;
    @Column(name = "sx_nation")
    private String sx_nation;
    @Column(name = "sx_sex")
    private String sx_sex;
    @Column(name = "sx_age")
    private String sx_age;
    @Column(name = "sx_gtm_create")
    private Date sx_gtm_create;
    @Column(name = "sx_gtm_modified")
    private Date sx_gtm_modified;
    @Column(name = "sx_is_lock")
    private Boolean sx_is_lock;
    @Column(name = "sx_tutor_up")
    private Integer sx_tutor_up;    //最多能被多少学生选
    @Column(name = "sx_tutor")
    private Integer sx_tutor;   //最多可以双向选择多少个学生

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

    public String getSx_teacher_name() {
        return sx_teacher_name;
    }

    public void setSx_teacher_name(String sx_teacher_name) {
        this.sx_teacher_name = sx_teacher_name;
    }

    public String getSx_teacher_password() {
        return sx_teacher_password;
    }

    public void setSx_teacher_password(String sx_teacher_password) {
        this.sx_teacher_password = sx_teacher_password;
    }

    public String getSx_college() {
        return sx_college;
    }

    public void setSx_college(String sx_college) {
        this.sx_college = sx_college;
    }

    public String getSx_nation() {
        return sx_nation;
    }

    public void setSx_nation(String sx_nation) {
        this.sx_nation = sx_nation;
    }

    public String getSx_sex() {
        return sx_sex;
    }

    public void setSx_sex(String sx_sex) {
        this.sx_sex = sx_sex;
    }

    public String getSx_age() {
        return sx_age;
    }

    public void setSx_age(String sx_age) {
        this.sx_age = sx_age;
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

    public Boolean getSx_is_lock() {
        return sx_is_lock;
    }

    public void setSx_is_lock(Boolean sx_is_lock) {
        this.sx_is_lock = sx_is_lock;
    }

    public Integer getSx_tutor_up() {
        return sx_tutor_up;
    }

    public void setSx_tutor_up(Integer sx_tutor_up) {
        this.sx_tutor_up = sx_tutor_up;
    }

    public Integer getSx_tutor() {
        return sx_tutor;
    }

    public void setSx_tutor(Integer sx_tutor) {
        this.sx_tutor = sx_tutor;
    }
}
