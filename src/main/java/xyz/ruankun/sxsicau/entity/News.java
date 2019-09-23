package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_index_news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;
    @Column(name = "sx_title")
    private String sxTitle;
    @Column(name = "sx_gmt_create")
    private Date sxGmtCreate;
    @Column(name = "sx_gmt_modified")
    private Date sxGmtModified;
    @Column(name = "sx_read")
    private Integer sxRead;
    @Column(name = "sx_content")
    private String sxContent;
    @Column(name = "sx_is_visible")
    private Boolean sxIsVisible;

    public Integer getSxId() {
        return sxId;
    }

    public void setSxId(Integer sxId) {
        this.sxId = sxId;
    }

    public String getSxTitle() {
        return sxTitle;
    }

    public void setSxTitle(String sxTitle) {
        this.sxTitle = sxTitle;
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

    public Integer getSxRead() {
        return sxRead;
    }

    public void setSxRead(Integer sxRead) {
        this.sxRead = sxRead;
    }

    public String getSxContent() {
        return sxContent;
    }

    public void setSxContent(String sxContent) {
        this.sxContent = sxContent;
    }

    public Boolean getSxIsVisible() {
        return sxIsVisible;
    }

    public void setSxIsVisible(Boolean sxIsVisible) {
        this.sxIsVisible = sxIsVisible;
    }

    @Override
    public String toString() {
        return "News{" +
                "sxId=" + sxId +
                ", sxTitle='" + sxTitle + '\'' +
                ", sxGmtCreate=" + sxGmtCreate +
                ", sxGmtModified=" + sxGmtModified +
                ", sxRead=" + sxRead +
                ", sxContent='" + sxContent + '\'' +
                ", sxIsVisible=" + sxIsVisible +
                '}';
    }
}
