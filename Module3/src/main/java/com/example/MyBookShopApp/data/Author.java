package com.example.MyBookShopApp.data;

public class Author {
    private Integer author_id;
    private String first_name;
    private String last_name;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + author_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name +
                '}';
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }
}
