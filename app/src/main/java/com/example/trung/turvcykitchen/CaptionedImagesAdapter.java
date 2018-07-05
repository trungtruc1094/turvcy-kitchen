package com.example.trung.turvcykitchen;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trung.turvcykitchen.interfaces.CustomAnimationListener;

import java.util.List;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private final Context context;
    private String[] titles;
    private int[] imageIds;
    private String[] contents;

    public CaptionedImagesAdapter(Context context, String[] titles, int[] imageIds, String[] contents){
        this.titles = titles;
        this.imageIds = imageIds;
        this.contents = contents;
        this.context = context;
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CardView cv = holder.cardView;

        //Set image
        ImageView imageView = (ImageView) cv.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cv.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);

        //Set title
        TextView textTitle = (TextView) cv.findViewById(R.id.info_title);
        textTitle.setText(titles[position]);

        //Set content
        TextView textContent = (TextView) cv.findViewById(R.id.info_brief_content);
        textContent.setText(contents[position]);

        cv.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                new AnimationObject(context).animateView_shaking(cv.findViewById(R.id.btn));
                new AnimationObject(context).animation(true, cv.findViewById(R.id.btn), R.anim.appear_from_hell_dot, 1000, 2000, new CustomAnimationListener() {
                    @Override
                    public void onAnimationEnd() {
                        Toast.makeText(context, "Animation end!",Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }


}
