package org.fft.oucbbs;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by lsmtty on 15-3-17.
 */
@Entity
@Table(name = "User", schema = "", catalog = "OUC-BBS")
public class UserEntity {
    private int id;
    private String username;
    private String password;
    private Timestamp borntime;
    private Timestamp lastlogin;
    private String usergroup;
    private String email;
    private Collection<ArticleEntity> articlesById;
    private Collection<CommentEntity> commentsById;
    private Integer level;
    private Integer exeperience;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, insertable = true, updatable = true, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 128)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "borntime", nullable = false, insertable = true, updatable = true)
    public Timestamp getBorntime() {
        return borntime;
    }

    public void setBorntime(Timestamp borntime) {
        this.borntime = borntime;
    }

    @Basic
    @Column(name = "lastlogin", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Timestamp lastlogin) {
        this.lastlogin = lastlogin;
    }

    @Basic
    @Column(name = "usergroup", nullable = false, insertable = true, updatable = true, length = 15)
    public String getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (borntime != null ? !borntime.equals(that.borntime) : that.borntime != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (lastlogin != null ? !lastlogin.equals(that.lastlogin) : that.lastlogin != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (usergroup != null ? !usergroup.equals(that.usergroup) : that.usergroup != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (borntime != null ? borntime.hashCode() : 0);
        result = 31 * result + (lastlogin != null ? lastlogin.hashCode() : 0);
        result = 31 * result + (usergroup != null ? usergroup.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByAuthorid")
    public Collection<ArticleEntity> getArticlesById() {
        return articlesById;
    }

    public void setArticlesById(Collection<ArticleEntity> articlesById) {
        this.articlesById = articlesById;
    }

    @OneToMany(mappedBy = "userByAuthorid")
    public Collection<CommentEntity> getCommentsById() {
        return commentsById;
    }

    public void setCommentsById(Collection<CommentEntity> commentsById) {
        this.commentsById = commentsById;
    }

    @Basic
    @Column(name = "level", nullable = true, insertable = true, updatable = true)
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "exeperience", nullable = true, insertable = true, updatable = true)
    public Integer getExeperience() {
        return exeperience;
    }

    public void setExeperience(Integer exeperience) {
        this.exeperience = exeperience;
    }
}
