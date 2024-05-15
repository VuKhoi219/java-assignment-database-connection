public class PostList {
    private long id;
    private String Article_title, Detail, Avatar, Writer, Date_of_writing;

    public PostList(long id, String Article_title, String Detail, String Avatar, String Writer, String Date_of_writing) {
        this.id = id;
        this.Article_title = Article_title;
        this.Detail = Detail;
        this.Avatar = Avatar;
        this.Writer = Writer;
        this.Date_of_writing = Date_of_writing;
    }

    public String getArticle_title() {
        return Article_title;
    }

    public void setArticle_title(String article_title) {
        Article_title = article_title;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getDate_of_writing() {
        return Date_of_writing;
    }

    public void setDate_of_writing(String date_of_writing) {
        Date_of_writing = date_of_writing;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }
}
