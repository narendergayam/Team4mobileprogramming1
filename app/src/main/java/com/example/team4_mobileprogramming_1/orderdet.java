package com.example.team4_mobileprogramming_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class orderdet extends AppCompatActivity {


    ImageView o_img;
    TextView o_name, o_followers, o_following, o_repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdet);

        o_name = findViewById(R.id.o_name);
        o_followers = findViewById(R.id.o_followers);
        o_following = findViewById(R.id.o_following);
        o_repo = findViewById(R.id.o_repo);
        o_img = findViewById(R.id.o_img);

        Intent intent = getIntent();
        Repositories repositories = intent.getParcelableExtra("owner");
        Picasso.get().load(repositories.getUseravatar()).into(o_img);

      /* intent = new Intent(orderdet.this, Listrepository.class);
        startActivity(intent);
        finish();*/
        o_followers.setText(repositories.getFollowers());
        o_following.setText(repositories.getFollowing());
        o_name.setText(repositories.getUsername());


        o_repo.setText(repositories.getUserrepository());


        o_repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(orderdet.this, Listrepository.class);

                startActivity(intent1);


            }


});
    };
};