package com.example.team4_mobileprogramming_1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    ImageView img,title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.mainlogo);
        title=findViewById(R.id.logo);

        ObjectAnimator animator = ObjectAnimator.ofFloat(img,"rotationY",0.0f,360.0f);
        animator.setDuration(5000);
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();



       handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Listrepository.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }
}


