package nyc.c4q.buzzfeedquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FellowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fellow);

        // Find the reference in your context(activity). -- Remember findViewById()
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // Add a layout manager - you can use these keywords for context - "this"(just the activity), "getBaseContext", "getApplicationContext" (strongest keyword for use - i.e. - bluetooth)
        // Build necessities
        LinearLayoutManager manager = new LinearLayoutManager(this);
        ColorAdapter adapter = new ColorAdapter(buildModelList());

        // Create and add an adapter to adapt your dataset - after declaring it here then hit "option + enter" to create the ColorAdapter class for me as a shortcut
//        recyclerView.setAdapter(new ColorAdapter(new ArrayList<Question>()));  This was an empty arrayList

        // Assign values
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    // Builds List Question and returns it
    private List<Question> buildModelList(){
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("#ffffff", "What kind of smartphone do you own?", R.drawable  ));
        questionList.add(new Question("#f9982f", "When do you attend Access Code classes?"));
        questionList.add(new Question("#e3ee31","Who is your Program Manager?"));
        questionList.add(new Question("#4366b0", "Who is your Teacher?"));
        return questionList;
    }
}


