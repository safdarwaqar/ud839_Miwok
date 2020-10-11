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
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("lutti","father",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("otiiko","son",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("tolookosu","mother",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("oyyisa","tune",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("massokka","daughter",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("temmokka","younger bro",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("kenekaku","older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("kawinta","GrandMother",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("wo’e","GrandFather",R.drawable.family_grandfather,R.raw.family_grandfather));
        words.add(new Word("na’aacha","older brother",R.drawable.family_older_brother,R.raw.family_older_brother));


        ListView listView = (ListView) findViewById(R.id.list_family);

        WordAdapter adapter = new WordAdapter(getApplicationContext(), words,R.color.category_family);
        listView.setAdapter(adapter);


        //String[] myWords = new String[]{"one", "two", "three","four"};
        //ArrayAdapter<String> myAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_2,android.R.id.text1,myWords);




    }
}
