package com.example.study_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView list;
    private ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list = (ListView) findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,data);

        list.setAdapter(adapter);

        data.add("SeoAndroid");
        data.add("SeoAndroi");
        data.add("SeoAndro");
        data.add("SeoAndr");
        adapter.notifyDataSetChanged();

        test = (ImageView) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Toast테스트", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}