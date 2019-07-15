package com.example.team4_mobileprogramming_1;

import android.content.Context;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context c;
    ArrayList<Repositories> repositories;
    LayoutInflater li;

    public ListAdapter(Context c, ArrayList<Repositories> repositories) {
        this.c = c;
        this.repositories = repositories;
    }

    @Override
    public int getCount() {
        return repositories.size();
    }

    @Override
    public Object getItem(int i) {
        return repositories.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        if (li == null)
        {
            li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }


        if(view == null)
        {
            view = li.inflate(R.layout.adapter_list,parent,false);
        }

        TextView txtnm = view.findViewById(R.id.txt_list);
        txtnm.setText(repositories.get(i).getRepositoryname());

        return view;
    }
}
