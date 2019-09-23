package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_index_banner")
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;
    @Column(name = "sx_imgsrc")
    private String sxImgSrc;
    @Column(name = "sx_news_id")
    private Integer sxNewsId;
    @Column(name = "sx_gmt_create")
    private Date sxGmtCreate;
    @Column(name = "sx_gmt_modified")
    private Date sxGmtModified;
    @Column(name = "sx_is_visible")
    private Boolean sxIsVisible;

    public Integer getSxId() {
        return sxId;
    }

    public void setSxId(Integer sxId) {
        this.sxId = sxId;
    }

    public String getSxImgSrc() {
        return sxImgSrc;
    }

    public void setSxImgSrc(String sxImgSrc) {
        this.sxImgSrc = sxImgSrc;
    }

    public Integer getSxNewsId() {
        return sxNewsId;
    }

    public void setSxNewsId(Integer sxNewsId) {
        this.sxNewsId = sxNewsId;
    }

    public Date getSxGmtCreate() {
        return sxGmtCreate;
    }

    public void setSxGmtCreate(Date sxGmtCreate) {
        this.sxGmtCreate = sxGmtCreate;
    }

    public Date getSxGmtModified() {
        return sxGmtModified;
    }

    public void setSxGmtModified(Date sxGmtModified) {
        this.sxGmtModified = sxGmtModified;
    }

    public Boolean getSxIsVisible() {
        return sxIsVisible;
    }

    public void setSxIsVisible(Boolean sxIsVisible) {
        this.sxIsVisible = sxIsVisible;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "sxId=" + sxId +
                ", sxImgSrc='" + sxImgSrc + '\'' +
                ", sxNewsId=" + sxNewsId +
                ", sxGmtCreate=" + sxGmtCreate +
                ", sxGmtModified=" + sxGmtModified +
                ", sxIsVisible=" + sxIsVisible +
                '}';
    }
}
