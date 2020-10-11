/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("lutti", "red", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("otiiko", "green", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("tolookosu", "brown", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("oyyisa", "black", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("massokka", "yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("temmokka", "gray", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("kenekaku", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("kawinta", "white", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("wo’e", "black", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("na’aacha", "red", R.drawable.color_red, R.raw.color_red));


        ListView listView = (ListView) findViewById(R.id.list_color);

        WordAdapter adapter = new WordAdapter(getApplicationContext(), words, R.color.category_colors);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                MediaPlayer mMediaPlayer = MediaPlayer.create(getApplicationContext(), word.getAudioResourceId());
                mMediaPlayer.start();
                Toast.makeText(getApplicationContext(), "list item clicked", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
