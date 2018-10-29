package com.example.gerard.dambrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Poem> poems = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Poem poem = new Poem();
            poem.author = "Author " +i;
            poem.title = "Title " +i;
            poem.content = i + "codsofijdfsojidgfkjdas ";
            poems.add(poem);
        }


    }
}
