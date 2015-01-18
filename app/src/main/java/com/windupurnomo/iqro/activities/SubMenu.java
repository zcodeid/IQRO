package com.windupurnomo.iqro.activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ExpandableListView;

import com.windupurnomo.iqro.adapters.MyExpandableListAdapter;
import com.windupurnomo.iqro.models.Iqro;
import com.windupurnomo.iqro.models.Letter;
import com.windupurnomo.iqro.models.Level;

public class SubMenu extends Activity {
    // more efficient than HashMap for mapping integers to objects
    List<Iqro> groups = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        initData();
        setContentView(R.layout.activity_sub_menu);
        ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
                groups);
        listView.setAdapter(adapter);
    }

    private void initData(){
        List<Level> levels = new ArrayList<>();
        List<Letter> letters = new ArrayList<>();
        Letter l = new Letter();
        l.setId(1);
        l.setSounds(Arrays.asList(1));
        letters.add(l);

        l = new Letter();
        l.setId(2);
        l.setSounds(Arrays.asList(2));
        letters.add(l);

        l = new Letter();
        l.setId(5);
        l.setSounds(Arrays.asList(5));
        letters.add(l);

        l = new Letter();
        l.setId(8);
        l.setSounds(Arrays.asList(8));
        letters.add(l);

        l = new Letter();
        l.setId(12);
        l.setSounds(Arrays.asList(12));
        letters.add(l);

        Level level = new Level();
        level.setLevel(1);
        level.setLetters(letters);
        letters = new ArrayList<>();
        levels.add(level);


        l = new Letter();
        l.setId(3);
        l.setSounds(Arrays.asList(3));
        letters.add(l);

        l = new Letter();
        l.setId(6);
        l.setSounds(Arrays.asList(6));
        letters.add(l);

        l = new Letter();
        l.setId(9);
        l.setSounds(Arrays.asList(9));
        letters.add(l);

        l = new Letter();
        l.setId(13);
        l.setSounds(Arrays.asList(13));
        letters.add(l);

        l = new Letter();
        l.setId(16);
        l.setSounds(Arrays.asList(16));
        letters.add(l);

        level = new Level();
        level.setLevel(2);
        level.setLetters(letters);
        levels.add(level);
        letters = new ArrayList<>();




        l = new Letter();
        l.setId(4);
        l.setSounds(Arrays.asList(4));
        letters.add(l);

        l = new Letter();
        l.setId(7);
        l.setSounds(Arrays.asList(7));
        letters.add(l);

        l = new Letter();
        l.setId(10);
        l.setSounds(Arrays.asList(10));
        letters.add(l);

        l = new Letter();
        l.setId(14);
        l.setSounds(Arrays.asList(14));
        letters.add(l);

        l = new Letter();
        l.setId(17);
        l.setSounds(Arrays.asList(17));
        letters.add(l);

        level = new Level();
        level.setLevel(3);
        level.setLetters(letters);
        levels.add(level);
        letters = new ArrayList<>();




        l = new Letter();
        l.setId(11);
        l.setSounds(Arrays.asList(11));
        letters.add(l);

        l = new Letter();
        l.setId(15);
        l.setSounds(Arrays.asList(15));
        letters.add(l);

        l = new Letter();
        l.setId(18);
        l.setSounds(Arrays.asList(18));
        letters.add(l);

        l = new Letter();
        l.setId(20);
        l.setSounds(Arrays.asList(20));
        letters.add(l);

        l = new Letter();
        l.setId(22);
        l.setSounds(Arrays.asList(22));
        letters.add(l);

        level = new Level();
        level.setLevel(4);
        level.setLetters(letters);
        levels.add(level);
        letters = new ArrayList<>();



        l = new Letter();
        l.setId(19);
        l.setSounds(Arrays.asList(19));
        letters.add(l);

        l = new Letter();
        l.setId(21);
        l.setSounds(Arrays.asList(21));
        letters.add(l);

        l = new Letter();
        l.setId(23);
        l.setSounds(Arrays.asList(23));
        letters.add(l);

        l = new Letter();
        l.setId(24);
        l.setSounds(Arrays.asList(24));
        letters.add(l);

        l = new Letter();
        l.setId(25);
        l.setSounds(Arrays.asList(25));
        letters.add(l);

        level = new Level();
        level.setLevel(5);
        level.setLetters(letters);
        levels.add(level);
        letters = new ArrayList<>();



        l = new Letter();
        l.setId(26);
        l.setSounds(Arrays.asList(26));
        letters.add(l);

        l = new Letter();
        l.setId(27);
        l.setSounds(Arrays.asList(27));
        letters.add(l);

        l = new Letter();
        l.setId(28);
        l.setSounds(Arrays.asList(28));
        letters.add(l);

        l = new Letter();
        l.setId(29);
        l.setSounds(Arrays.asList(29));
        letters.add(l);

        level = new Level();
        level.setLevel(6);
        level.setLetters(letters);
        levels.add(level);
        groups.add(new Iqro(1, levels));
    }

}