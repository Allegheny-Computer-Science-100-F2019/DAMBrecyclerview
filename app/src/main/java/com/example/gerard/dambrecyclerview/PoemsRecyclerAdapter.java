package com.example.gerard.dambrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PoemsRecyclerAdapter extends RecyclerView.Adapter {

    ArrayList<Poem> poemArrayList;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_poem, viewGroup, false);
        return R.layout.item_poem;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ////
    }

    @Override
    public int getItemCount() {
        return poemArrayList.size();
    }

    public void setPoemArray(ArrayList<Poem> araypoems) {
        poemArrayList = araypoems;
    }
}
