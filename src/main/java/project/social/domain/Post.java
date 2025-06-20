package project.social.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import project.social.dto.CommentDto;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

@Document(collection = "posts")
public class Post implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String authorId;
    private String content;
    private String title;
    private Date createdAt;

    private List<Like> likes = new ArrayList<>();
    private List<CommentDto> comments = new ArrayList<>();

    private boolean hasUserLiked;

    public Post() {
    }

    public Post(String id, String title, String authorId, Date createdAt) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public void setComments(List<CommentDto> comments) {
        this.comments = comments;
    }

    public boolean getHasUserLiked() {
        return hasUserLiked;
    }

    public void setHasUserLiked(boolean hasUserLiked) {
        this.hasUserLiked = hasUserLiked;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
