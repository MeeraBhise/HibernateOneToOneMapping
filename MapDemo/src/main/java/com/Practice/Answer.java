package com.Practice;

import javax.persistence.*;

@Entity
public class Answer{

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        answerId= answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
@Id
@Column(name = "answer_id")
    private int answerId;

    private String answer;
 //   @OneToOne(mappedBy = "answer")
   // private Question question;
    public Answer() {
    }

    public Answer(int answerId, String answer) {
        answerId= answerId;
        this.answer = answer;
    }

}
