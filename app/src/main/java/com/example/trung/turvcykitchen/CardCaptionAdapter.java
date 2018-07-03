package com.example.trung.turvcykitchen;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class CardCaptionAdapter extends RecyclerView.Adapter<CardCaptionAdapter.ViewHolder> {
    private String[] titles;
    private int[] imageIds;
    private String[] contents;

    public CardCaptionAdapter(String[] titles, int[] imageIds, String[] contents){
        this.titles = titles;
        this.imageIds = imageIds;
        this.contents = contents;
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    // Class ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;

        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }

    }

    @NonNull
    @Override
    public CardCaptionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Code to instantiate the ViewHolder
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_caption_food, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }
}
