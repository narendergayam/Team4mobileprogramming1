package com.example.team4_mobileprogramming_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Listrepository extends AppCompatActivity {

    ArrayList<Repositories> repositorie;
    ListView lv;
    ListAdapter la;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listrepository);

        repositorie = new ArrayList<>();
        lv = findViewById(R.id.txt_repos);

        String link = getResources().getString(R.string.link);
        try
        {
            String repJson = new Syncdata().execute(link).get();

            System.out.println("Narender Json :"+repJson);

            JSONArray jsonArray = new JSONArray(repJson);

            for(int i=0;i<26;i++)
            {
                JSONObject childObj = jsonArray.getJSONObject(i);
                String repositoryname = childObj.getString("name");
                String desc = childObj.getString("description");
                String language = childObj.getString("languages_url");
                String username = childObj.getJSONObject("owner").getString("login");
                String useravatar = childObj.getJSONObject("owner").getString("avatar_url");
                String followers = childObj.getJSONObject("owner").getString("followers_url");
                String following = childObj.getJSONObject("owner").getString("following_url");
                String oranization = childObj.getJSONObject("owner").getString("organizations_url");
                String userrepository = childObj.getJSONObject("owner").getString("repos_url");


                repositorie.add(new Repositories(repositoryname,username,useravatar,language,desc,followers,following,oranization,userrepository));

            }

            la = new ListAdapter(getApplicationContext(),repositorie);
            lv.setAdapter(la);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(Listrepository.this,Repositoriedetails.class);
                    intent.putExtra("details", repositorie.get(i));
                    startActivity(intent);
                }
            });

            System.out.println("Narender Repository Array"+repositorie.get(1).toString());

    } catch (ExecutionException e) {
        e.printStackTrace();
    }  catch (InterruptedException e) {
        e.printStackTrace();
    } catch (JSONException e) {
        e.printStackTrace();
    }

}
}


