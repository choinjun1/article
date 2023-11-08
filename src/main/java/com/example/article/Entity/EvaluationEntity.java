package com.example.article.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name="evaluation")
public class EvaluationEntity {
    @Id
    @Column(name="evalid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer evalid;             //평가 번호

    @Column(name="userid",nullable = false,length = 50)
    private String userid;              //작성자 아이디

    @Column(name="lecname",nullable = false,length = 50)
    private String lecname;             //강의명

    @Column(name="professorname",nullable = false,length = 50)
    private String professorname;       //교수명

    @Column(name="lecyear",nullable = false)
    private Integer lecyear;            //수강 연도

    @Column(name="semesterdivide",length = 20)
    private String semesterdivide;      //수강 학기

    @Column(name="lecdivide",length = 10)
    private String lecdivide;           //강의 구분

    @Column(name="evaltitle",nullable = false,length = 50)
    private String evaltitle;           //평가 제목

    @Column(name="evalcontent",length = 2048)
    private String evalcontent;         //평가 내용

    @Column(name="totalscore",length = 10)
    private String totalscore;          //종합 점수

    @Column(name="creditscore",length = 10)
    private String creditscore;         //성적 점수

    @Column(name="comfortablescore",length = 10)
    private String comfortablescore;    //널널 점수

    @Column(name="lecscore",length = 10)
    private String lecscore;            //강의점수

    @Column(name="likecount")
    private Integer likecount;          //추천갯수
}
