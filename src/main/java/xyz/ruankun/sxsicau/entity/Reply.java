package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_ext_reply")
@DynamicInsert
@DynamicUpdate
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_ext_id")
    private Integer sxExtId;
    @Column(name = "sx_ext_comment_id")
    private Integer sxExtCommentId;
    @Column(name = "sx_ext_replyer_id")
    private String sxExtReplyerId;
    @Column(name = "sx_ext_commender_id")
    private String sxExtCommenderId;
    @Column(name = "sx_ext_msg")
    private String sxExtMsg;
    @Column(name = "sx_ext_gtm_create")
    private Date sxExtGmtCreate;
    @Column(name = "sx_ext_praise")
    private Integer sxExtPraise;
    @Column(name = "sx_ext_is_visible")
    private Boolean sxExtIsVisible;

    public Integer getSxExtId() {
        return sxExtId;
    }

    public void setSxExtId(Integer sxExtId) {
        this.sxExtId = sxExtId;
    }

    public Integer getSxExtCommentId() {
        return sxExtCommentId;
    }

    public void setSxExtCommentId(Integer sxExtCommentId) {
        this.sxExtCommentId = sxExtCommentId;
    }

    public String getSxExtReplyerId() {
        return sxExtReplyerId;
    }

    public void setSxExtReplyerId(String sxExtReplyerId) {
        this.sxExtReplyerId = sxExtReplyerId;
    }

    public String getSxExtCommenderId() {
        return sxExtCommenderId;
    }

    public void setSxExtCommenderId(String sxExtCommenderId) {
        this.sxExtCommenderId = sxExtCommenderId;
    }

    public String getSxExtMsg() {
        return sxExtMsg;
    }

    public void setSxExtMsg(String sxExtMsg) {
        this.sxExtMsg = sxExtMsg;
    }

    public Date getSxExtGmtCreate() {
        return sxExtGmtCreate;
    }

    public void setSxExtGmtCreate(Date sxExtGmtCreate) {
        this.sxExtGmtCreate = sxExtGmtCreate;
    }

    public Integer getSxExtPraise() {
        return sxExtPraise;
    }

    public void setSxExtPraise(Integer sxExtPraise) {
        this.sxExtPraise = sxExtPraise;
    }

    public Boolean getSxExtIsVisible() {
        return sxExtIsVisible;
    }

    public void setSxExtIsVisible(Boolean sxExtIsVisible) {
        this.sxExtIsVisible = sxExtIsVisible;
    }
}
