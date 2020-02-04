package com.example.miwoknd;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter  extends ArrayAdapter<Word> {

    private int mcolorResourceId;

    public WordAdapter(Activity context, ArrayList<Word>words, int colorResourceId){
        super(context, 0, words);
        mcolorResourceId = colorResourceId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }
        Word currentWord = getItem(position);

        TextView defaultText = listItemView.findViewById(R.id.text1);
        if (currentWord != null) {
            defaultText.setText(currentWord.getDefaultTranslation());
        }

        TextView transWord = listItemView.findViewById(R.id.text2);
        if (currentWord != null) {
            transWord.setText(currentWord.getMiwokTranslation());
        }

        ImageView imageView = listItemView.findViewById(R.id.image_des);
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImage());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

//        ImageView imageView2 = listItemView.findViewById(R.id.phrases);
//        if (currentWord.hasImage()){
//            imageView2.setImageResource(currentWord.getmImage2());
//            imageView2.setVisibility(View.VISIBLE);
//        }
//        else {
//            imageView2.setVisibility(View.GONE);
//        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
