package com.example.inflearn_srping_basic.member;

public class Member {
    private Long id;
    private String name;
    private Grade Grade;

    public Member(Long id, String name, com.example.inflearn_srping_basic.member.Grade grade) {
        this.id = id;
        this.name = name;
        Grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.example.inflearn_srping_basic.member.Grade getGrade() {
        return Grade;
    }

    public void setGrade(com.example.inflearn_srping_basic.member.Grade grade) {
        Grade = grade;
    }
}
