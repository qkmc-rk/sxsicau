package xyz.ruankun.sxsicau.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_ext_comment")
@DynamicInsert
@DynamicUpdate
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_ext_id")
    private Integer sxExtId;

    @Column(name = "sx_ext_practice_id")
    private Integer sxExtPracticeId;

    @Column(name = "sx_ext_commenter_id")
    private String sxExtCommenterId;    // 评论者学号

    @Column(name = "sx_ext_comment")
    private String sxExtComment;

    @Column(name = "sx_ext_gmt_create")
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

    public Integer getSxExtPracticeId() {
        return sxExtPracticeId;
    }

    public void setSxExtPracticeId(Integer sxExtPracticeId) {
        this.sxExtPracticeId = sxExtPracticeId;
    }

    public String getSxExtCommenterId() {
        return sxExtCommenterId;
    }

    public void setSxExtCommenterId(String sxExtCommenterId) {
        this.sxExtCommenterId = sxExtCommenterId;
    }

    public String getSxExtComment() {
        return sxExtComment;
    }

    public void setSxExtComment(String sxExtComment) {
        this.sxExtComment = sxExtComment;
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
