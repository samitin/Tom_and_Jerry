package ru.samitin.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView jerryImageView,tomImageView;
    private boolean isClickImage=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tomImageView=findViewById(R.id.imageViewTom);
        tomImageView.setOnClickListener(this);

        jerryImageView=findViewById(R.id.imageViewJerry);
        jerryImageView.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (isClickImage) {
            tomImageView.animate().alpha(0).setDuration(3000);
            jerryImageView.animate().alpha(1).setDuration(3000);
            isClickImage=false;
        }else {
            tomImageView.animate().alpha(1).setDuration(3000);
            jerryImageView.animate().alpha(0).setDuration(3000);
            isClickImage=true;
        }
    }
}