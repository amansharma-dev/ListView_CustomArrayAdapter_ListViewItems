package com.example.listview_customarrayadapter_listviewitems.SampleData;

import com.example.listview_customarrayadapter_listviewitems.Model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {

    public static List<DataItem> dataItemList;
    public static Map<String, DataItem> stringDataItemMap;

    static {
        dataItemList = new ArrayList<>();
        stringDataItemMap = new HashMap<>();

        addItem(new DataItem(null,"Going Bad","Drake ft Meek Mill",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Childs Play","Drake",15,16,"drake_one.jpg"));
        addItem(new DataItem(null,"Work","Drake ft Rihanna",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Language","Drake",19,26,"drake_one.jpg"));

        addItem(new DataItem(null,"Going Bad","Drake ft Meek Mill",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Childs Play","Drake",15,16,"drake_one.jpg"));
        addItem(new DataItem(null,"Work","Drake ft Rihanna",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Language","Drake",19,26,"drake_one.jpg"));

        addItem(new DataItem(null,"Going Bad","Drake ft Meek Mill",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Childs Play","Drake",15,16,"drake_one.jpg"));
        addItem(new DataItem(null,"Work","Drake ft Rihanna",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Language","Drake",19,26,"drake_one.jpg"));

        addItem(new DataItem(null,"Going Bad","Drake ft Meek Mill",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Childs Play","Drake",15,16,"drake_one.jpg"));
        addItem(new DataItem(null,"Work","Drake ft Rihanna",9,16,"drake.jpg"));
        addItem(new DataItem(null,"Language","Drake",19,26,"drake_one.jpg"));

    }

    private static void addItem(DataItem item){
        dataItemList.add(item);
        stringDataItemMap.put(item.getId(), item);
    }
}

