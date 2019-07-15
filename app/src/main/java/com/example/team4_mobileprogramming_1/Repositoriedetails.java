package com.example.team4_mobileprogramming_1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class Repositoriedetails extends AppCompatActivity {

    ImageView oimg;
    TextView rname, oname, rlang, rdesc;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_repositories);

        oimg = findViewById(R.id.oimg);
        rname = findViewById(R.id.rname);
        oname = findViewById(R.id.oname);
        rlang = findViewById(R.id.rlang);
        rdesc = findViewById(R.id.rdesc);

        Intent intent = getIntent();
        final Repositories repositories = intent.getParcelableExtra("details");


        rname.setText(repositories.getRepositoryname());
        oname.setText(repositories.getUsername());
        Picasso.get().load(repositories.getUseravatar()).into(oimg);
        rlang.setText(repositories.getLanguage());
        rdesc.setText(repositories.getDesc());

        oname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(Repositoriedetails.this,orderdet.class);
                intent1.putExtra("owner", (Parcelable) repositories);
                startActivity(intent1);
            }
        });
    }
}
