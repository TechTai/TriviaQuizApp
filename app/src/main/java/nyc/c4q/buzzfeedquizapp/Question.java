package nyc.c4q.buzzfeedquizapp;


/**
 * Created by MsNehisi on 11/15/17.
 */

public class Question {
    private String color;
    private String quiz_question;
    private int quiz_image;

    // Creating a constructor for building the Question List and setting the colors in the Main Activity.

    public Question(String color, String quiz_question) {
        this.color = color;
        this.quiz_question = quiz_question;
//        this.quiz_image = quiz_image;
    }

    //Create Getter
    public String getColor(){
        return color;
    }
    //Create Getter
    public String getQuiz_question(){
        return quiz_question;
    }
    //Create Setter
    public void setColor(String color){
        this.color = color;
    }
    //Create Setter
    public void setQuiz_question(String quiz_question){
        this.quiz_question = quiz_question;
    }
}
