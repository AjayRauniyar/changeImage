package com.example.changeimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
            boolean firstviewshow=true;
         public void OnImageClick(View view){
             ImageView firstview=findViewById(R.id.imageView2);
             ImageView secondview=findViewById(R.id.imageView3);
             //translational animation
            // firstview.animate().translationY(2000).setDuration(2000);
             //  firstview.animate().translationXBy(-2000).setDuration(2000);

             // scaling of image
            // firstview.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

             //rotation animation
//             firstview.animate().rotation(150).setDuration(2000);

             // fading Animation
//             if(firstviewshow){
//                firstviewshow=false;
//             firstview.animate().alpha(0).setDuration(2000);
//             secondview.animate().alpha(1).setDuration(2000);
//            }else {
//                 firstviewshow=true;
//                 firstview.animate().alpha(1).setDuration(2000);
//                 secondview.animate().alpha(0).setDuration(2000);
//             }
         }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView first=findViewById(R.id.imageView2);
        first.setX(-2000);
        first.animate().translationXBy(2000).rotationXBy(3600).setDuration(4000);
    }
}