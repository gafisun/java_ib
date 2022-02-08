package Game;

import java.util.ArrayList;

public class Question {
    private String value;
    private ArrayList<String> answers;
    private Integer correct;

    public Question(String value, ArrayList<String> answers, Integer correct){
        this.value = value;
        this.answers = answers;
        this.correct = correct;
    }
}
