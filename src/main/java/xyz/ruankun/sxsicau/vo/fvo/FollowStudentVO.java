package xyz.ruankun.sxsicau.vo.fvo;

import xyz.ruankun.sxsicau.entity.Practice;
import xyz.ruankun.sxsicau.entity.Student;

import java.util.List;

/**
 * 返回学生对象给前端,去除了敏感信息
 */
public class FollowStudentVO {

    private String sxStudentId;
    private String sxStudentName;
    private String sxStudentPhone;
    private String sxSex;
    private String sxNation;
    private String sxGrade;
    private String sxCollege;
    private String sxMajor;
    private String sxClazz;
    private String sxCampus;
    private String sxPicture;

    private List<Practice> practices;

    public List<Practice> getPractices() {
        return practices;
    }

    public void setPractices(List<Practice> practices) {
        this.practices = practices;
    }

    public FollowStudentVO(Student student) {
        this.sxStudentId = student.getSxStudentId();
        this.sxStudentName = student.getSxStudentName();
        sxStudentPhone = student.getSxStudentPhone();
        sxSex = student.getSxSex();
        sxNation = student.getSxNation();
        sxGrade = student.getSxGrade();
        sxCollege = student.getSxCollege();
        sxMajor = student.getSxMajor();
        sxClazz = student.getSxClazz();
        sxCampus = student.getSxCampus();
        sxPicture = student.getSxPicture();
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
}
