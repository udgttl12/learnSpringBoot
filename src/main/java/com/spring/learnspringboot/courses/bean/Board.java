package com.spring.learnspringboot.courses.bean;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_id", nullable = false)
    private Long board_id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(columnDefinition = "DATETIME")
    private String createdAt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Board(Long board_id, String title, String content) {
        this.board_id = board_id;
        this.title = title;
        this.content = content;
    }

    public Board() {

    }

    public Long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Long board_id) {
        this.board_id = board_id;
    }

    @PrePersist
    public void createdAt(){
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
