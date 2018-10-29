package com.example.gerard.dambrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PoemsRecyclerAdapter extends RecyclerView.Adapter<PoemsRecyclerAdapter.PoemViewHolder> {

    ArrayList<Poem> poemArrayList;

    @NonNull
    @Override
    public PoemsRecyclerAdapter.PoemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PoemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_poem, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PoemsRecyclerAdapter.PoemViewHolder viewHolder, int i) {
        viewHolder.textViewTitulo.setText(poemArrayList.get(i).author);
        viewHolder.textViewAuthor.setText(poemArrayList.get(i).title);
    }

    @Override
    public int getItemCount() {
        return poemArrayList.size();
    }

    public void setPoemArray(ArrayList<Poem> araypoems) {
        poemArrayList = araypoems;
    }

    class PoemViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitulo;
        TextView textViewAuthor;

        PoemViewHolder(View view){
            super(view);

            textViewAuthor = view.findViewById(R.id.poem_author);
            textViewTitulo = view.findViewById(R.id.poem_title);
        }

    }
}
