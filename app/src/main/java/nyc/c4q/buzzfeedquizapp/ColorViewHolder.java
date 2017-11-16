package nyc.c4q.buzzfeedquizapp;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by MsNehisi on 11/15/17.
 */

public class ColorViewHolder extends RecyclerView.ViewHolder {
    private TextView question_textview;
    private ImageButton first_choice;
    private ImageButton second_choice;

    public ColorViewHolder(View itemView) {

        super(itemView);
        question_textview = (TextView) itemView.findViewById(R.id.ask_question);
        first_choice = (ImageButton) itemView.findViewById(R.id.choice_one);
        second_choice = (ImageButton) itemView.findViewById(R.id.choice_two);

    }

    public void bind(Question question) {
        itemView.setBackgroundColor(Color.parseColor(question.getColor()));
        question_textview.setText(question.getQuiz_question());
//        use setImageDrawable after I update the images with Picasso
//        first_choice.setI

    }
}
