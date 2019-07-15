package com.example.team4_mobileprogramming_1;

import android.os.AsyncTask;

public class Syncdata extends AsyncTask<String, Void, String> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        System.out.println(s);

    }
    @Override
    protected String doInBackground(String... strings) {
        String jurl = strings[0];
        HttpLoader hp = new HttpLoader();

        String json = hp.makeService(jurl);

        System.out.println("This is from Syncdata :"+json);

        return json;

    }
}

