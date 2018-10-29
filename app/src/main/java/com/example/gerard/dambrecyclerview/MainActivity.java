package com.example.gerard.dambrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Poem> poems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        for (int i = 0; i < 1000; i++) {
            Poem poem = new Poem();
            poem.author = "Author " +i;
            poem.title = "Title " +i;
            poem.content = i + "codsofijdfsojidgfkjdas ";
            poems.add(poem);
        }

        RecyclerView recyclerView =  findViewById(R.id.poem_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PoemsRecyclerAdapter poemsRecyclerAdapter = new PoemsRecyclerAdapter();
        poemsRecyclerAdapter.setPoemArray(poems);


    }
}
