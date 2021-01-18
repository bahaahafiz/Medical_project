package com.example.medical_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class First_Aid extends AppCompatActivity {
    ListView lv_first_aid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__aid);
        lv_first_aid = findViewById(R.id.lv_fisrt_aid);
        ArrayList<first_aid_info> first_aids = new ArrayList<>();
        first_aids.add(new first_aid_info());
        first_aid_adapter adapter = new first_aid_adapter(this, R.layout, first_aids);
        lv_first_aid.setAdapter(adapter);
    }
}