package com.example.listview_customarrayadapter_listviewitems;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listview_customarrayadapter_listviewitems.Model.DataItem;
import com.example.listview_customarrayadapter_listviewitems.SampleData.SampleDataProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataItem> dataItemList = SampleDataProvider.dataItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataItemAdapter dataItemAdapter = new DataItemAdapter(this,dataItemList);
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(dataItemAdapter);
    }
}
