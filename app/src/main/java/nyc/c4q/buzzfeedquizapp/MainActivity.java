package nyc.c4q.buzzfeedquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Boolean isRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  This allows the app to restore the values saved in the Bundle before destroying (changing phone's orientation from portrait to landscape)
        if (savedInstanceState != null) {
            isRunning = savedInstanceState.getBoolean("isRunning");
        }
    }

        @Override
        protected void onSaveInstanceState (Bundle savedInstanceState) {
            super.onSaveInstanceState(savedInstanceState);
            savedInstanceState.putBoolean("isRunning", isRunning);
        }

//      Call when the button gets clicked
        public void onClickSelect(View view) {
        // Get a reference to the TextView
            TextView display = (TextView) findViewById(R.id.display_choice);
        // Get a reference to the Spinner
            Spinner quizOptions = (Spinner) findViewById(R.id.quiz_options);
        // Get the selected item in the Spinner
            String quizType = String.valueOf(quizOptions.getSelectedItem());
        // Display selected item
            display.setText("You have selected: " + quizType);

            isRunning = true;

            if(quizType.equals("C4Q Fellow")) {
                Intent intent = new Intent(this,FellowActivity.class);
                startActivity(intent);
            } else if(quizType.equals("Animal Lover")) {
                Intent intent = new Intent(this, AnimalLoverActivity.class);
                startActivity(intent);
            }

    }
}
