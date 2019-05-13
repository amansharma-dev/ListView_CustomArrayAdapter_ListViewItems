package com.example.listview_customarrayadapter_listviewitems;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview_customarrayadapter_listviewitems.Model.DataItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataItemAdapter extends ArrayAdapter<DataItem> {

    List<DataItem> dataItemList;
    LayoutInflater layoutInflater;

    public DataItemAdapter(Context context,List<DataItem> objects) {
        super(context, R.layout.list_item, objects);

        dataItemList = objects;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item,parent,false);
        }

        TextView textView_song = convertView.findViewById(R.id.songname);
        TextView textView_artist = convertView.findViewById(R.id.artistName);
        TextView textView_like = convertView.findViewById(R.id.likes);
        TextView textView_views = convertView.findViewById(R.id.views);
        ImageView imageView = convertView.findViewById(R.id.imageview);
        Button button = convertView.findViewById(R.id.play);

        DataItem dataItem = dataItemList.get(position);

        textView_song.setText(dataItem.getSongName());
        textView_artist.setText(dataItem.getArtistName());
        textView_like.setText(String.valueOf(dataItem.getLikes()));
        textView_views.setText(String.valueOf((int) dataItem.getViews()));
      //  imageView.setImageResource(R.drawable.drake);

        //load image dynamically

        InputStream inputStream = null;
        try {
            String imageFile = dataItem.getImage();
            inputStream = getContext().getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            imageView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return convertView;
    }
}
