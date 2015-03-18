package org.fft.oucbbs;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lsmtty on 15-3-17.
 */
@Entity
@Table(name = "comment", schema = "", catalog = "OUC-BBS")
public class CommentEntity {
    private int id;
    private Integer reply;
    private String content;
    private Timestamp creattime;
    private UserEntity userByAuthorid;
    private Integer postid;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "reply", nullable = true, insertable = true, updatable = true)
    public Integer getReply() {
        return reply;
    }

    public void setReply(Integer reply) {
        this.reply = reply;
    }

    @Basic
    @Column(name = "content", nullable = false, insertable = true, updatable = true, length = 45)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "creattime", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreattime() {
        return creattime;
    }

    public void setCreattime(Timestamp creattime) {
        this.creattime = creattime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (id != that.id) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (creattime != null ? !creattime.equals(that.creattime) : that.creattime != null) return false;
        if (reply != null ? !reply.equals(that.reply) : that.reply != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (reply != null ? reply.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (creattime != null ? creattime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "authorid", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByAuthorid() {
        return userByAuthorid;
    }

    public void setUserByAuthorid(UserEntity userByAuthorid) {
        this.userByAuthorid = userByAuthorid;
    }

    @Basic
    @Column(name = "postid", nullable = true, insertable = true, updatable = true)
    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }
}
