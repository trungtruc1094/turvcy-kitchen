package com.example.trung.turvcykitchen;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class FoodList extends Fragment {
    View view;
    ImageView imageView;
    TextView textView;

    public FoodList(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_list, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        view = getView();
        imageView = view.findViewById(R.id.foodImage);
        textView = view.findViewById(R.id.foodText);
    }
}
