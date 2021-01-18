package com.example.medical_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class first_aid_adapter extends BaseAdapter {
    private Context c;
    private int resourse;
    private ArrayList<first_aid_info>aid_infos;
    public  first_aid_adapter(Context c, int resourse, ArrayList<first_aid_info>aid_infos)
    {
        this.c=c;
        this.resourse=resourse;
        this.aid_infos=aid_infos;

    }

    @Override
    public int getCount() {
        return aid_infos.size();
    }

    @Override
    public first_aid_info getItem(int position) {
        return aid_infos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= convertView;
        if(v==null)
        {
            v= LayoutInflater.from(c).inflate(resourse,null,false);
        }
        TextView tv_title=v.findViewById();
        TextView tv_discription=v.findViewById();
        ImageView iv_image=v.findViewById();

        first_aid_info  fai=getItem(position);
        tv_title.setText(fai.getTitle());
        tv_discription.setText(fai.getDiscription());
        iv_image.setImageResource(fai.getImage());

        return v;
    }
}
