package org.fft.oucbbs;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lsmtty on 15-3-17.
 */
@Entity
@Table(name = "article", schema = "", catalog = "OUC-BBS")
public class ArticleEntity {
    private int id;
    private String title;
    private String tips;
    private String content;
    private Timestamp creattime;
    private Timestamp lastchange;
    private UserEntity userByAuthorid;
    private PostEntity postByPostid;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, insertable = true, updatable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "tips", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    @Basic
    @Column(name = "content", nullable = true, insertable = true, updatable = true, length = 45)
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

    @Basic
    @Column(name = "lastchange", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastchange() {
        return lastchange;
    }

    public void setLastchange(Timestamp lastchange) {
        this.lastchange = lastchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleEntity that = (ArticleEntity) o;

        if (id != that.id) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (creattime != null ? !creattime.equals(that.creattime) : that.creattime != null) return false;
        if (lastchange != null ? !lastchange.equals(that.lastchange) : that.lastchange != null) return false;
        if (tips != null ? !tips.equals(that.tips) : that.tips != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (tips != null ? tips.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (creattime != null ? creattime.hashCode() : 0);
        result = 31 * result + (lastchange != null ? lastchange.hashCode() : 0);
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

    @ManyToOne
    @JoinColumn(name = "postid", referencedColumnName = "id", nullable = false)
    public PostEntity getPostByPostid() {
        return postByPostid;
    }

    public void setPostByPostid(PostEntity postByPostid) {
        this.postByPostid = postByPostid;
    }
}
