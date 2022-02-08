package Game;

import java.util.ArrayList;

public class Quiz {
    private Integer numberOfQuestions;
    private ArrayList<Question> questions;

    public Quiz(Integer numberOfQuestions, ArrayList<Question> questions){
        this.numberOfQuestions = numberOfQuestions;
        this.questions = questions;
    }
}
