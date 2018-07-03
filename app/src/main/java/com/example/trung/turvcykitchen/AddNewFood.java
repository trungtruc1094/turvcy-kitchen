package com.example.trung.turvcykitchen;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AddNewFood extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_food);
        imageView = (ImageView) findViewById(R.id.exitBtn);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AddNewFood.this, MainActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.stay, R.anim.godown);
            }
        });
    }

}
