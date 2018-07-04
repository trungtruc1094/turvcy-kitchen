package com.example.trung.turvcykitchen;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private String[] titles;
    private int[] imageIds;
    private String[] contents;

    public CaptionedImagesAdapter(String[] titles, int[] imageIds, String[] contents){
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

    // Add CardView to ViewHolder
    @NonNull
    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Code to instantiate the ViewHolder
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_caption_food, parent, false);
        return new ViewHolder(cv);
    }

    // Bind data to CardView
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull List<Object> payloads) {
        CardView cv = holder.cardView;
        ImageView imageView = (ImageView) cv.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cv.getContext(), imageIds[position]);


        super.onBindViewHolder(holder, position, payloads);
    }
}
