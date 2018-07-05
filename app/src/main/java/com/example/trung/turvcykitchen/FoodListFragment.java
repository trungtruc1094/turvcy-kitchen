package com.example.trung.turvcykitchen;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class FoodListFragment extends Fragment {
    View view;
    ImageView imageView;
    TextView textView;

    public FoodListFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_food_list, container, false);


        String[] foodTitles = new String[Food.food.length];
        for (int i = 0; i < foodTitles.length; i++){
            foodTitles[i] = Food.food[i].getName();
        }

        String[] foodDesc = new String[Food.food.length];
        for (int i = 0; i < foodTitles.length; i++){
            foodDesc[i] = Food.food[i].getDesc();
        }

        int[] foodImage = new int[Food.food.length];
        for (int i = 0; i < foodTitles.length; i++){
            foodImage[i] = Food.food[i].getImageRes();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(getActivity(), foodTitles,foodImage, foodDesc);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return recyclerView;
    }

    /*@Override
    public void onStart() {
        super.onStart();
        view = getView();
        imageView = view.findViewById(R.id.foodImage);
        textView = view.findViewById(R.id.foodText);
    }*/
}
