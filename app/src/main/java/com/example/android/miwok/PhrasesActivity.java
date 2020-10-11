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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("minto wuksus ","Where are you going?"));
        words.add(new Word("tinne oyaase'ne","What is your Name?"));
        words.add(new Word("oyaaset","My name is..."));
        words.add(new Word("oyaaset","How are you feeling"));
        words.add(new Word("michәksәs?","i'm feeling good"));
        words.add(new Word("kuchi achit","Are you comming?"));
        words.add(new Word("әәnәs'aa?","Yes I'm coming"));
        words.add(new Word("hәә’ әәnәm","lets go"));
        words.add(new Word("әәnәm","come here."));
        words.add(new Word("yoowutis","go there.."));


        ListView listView = (ListView) findViewById(R.id.list_phrases);

        WordAdapter adapter = new WordAdapter(getApplicationContext(), words,R.color.category_phrases);
        listView.setAdapter(adapter);

    }
}
