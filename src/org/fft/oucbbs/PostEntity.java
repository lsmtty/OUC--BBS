package org.fft.oucbbs;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by lsmtty on 15-3-18.
 */
@Entity
@Table(name = "Post", schema = "", catalog = "OUC-BBS")
public class PostEntity {
    private int id;
    private int postowner;
    private String postname;
    private Collection<ArticleEntity> articlesById;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "postowner", nullable = false, insertable = true, updatable = true)
    public int getPostowner() {
        return postowner;
    }

    public void setPostowner(int postowner) {
        this.postowner = postowner;
    }

    @Basic
    @Column(name = "postname", nullable = false, insertable = true, updatable = true, length = 20)
    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity that = (PostEntity) o;

        if (id != that.id) return false;
        if (postowner != that.postowner) return false;
        if (postname != null ? !postname.equals(that.postname) : that.postname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + postowner;
        result = 31 * result + (postname != null ? postname.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "postByPostid")
    public Collection<ArticleEntity> getArticlesById() {
        return articlesById;
    }

    public void setArticlesById(Collection<ArticleEntity> articlesById) {
        this.articlesById = articlesById;
    }
}
