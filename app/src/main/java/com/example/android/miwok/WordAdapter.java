package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> resource, int colorResourceId) {
        super(context, 0, resource);
        this.colorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView miwok;
        TextView english;
        ImageView icon;


        Word currentLanguage = getItem(position);


        miwok = (TextView) listItemView.findViewById(R.id.tv_miwok);
        english = (TextView) listItemView.findViewById(R.id.tv_english);

        miwok.setText(currentLanguage.getmMiwokTranslation());
        english.setText(currentLanguage.getmDefaultTranslation());

        icon = (ImageView) listItemView.findViewById(R.id.image_view);

        View textContainer = listItemView.findViewById(R.id.container);


        if (currentLanguage.hasImage()) {

            icon.setImageResource(currentLanguage.getImageResourceId());
            icon.setVisibility(View.VISIBLE);


        } else {
            icon.setVisibility(View.GONE);
        }

        int color = ContextCompat.getColor(getContext(), colorResourceId);
        //textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
