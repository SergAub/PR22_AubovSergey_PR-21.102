package com.example.pr22_aubovsergey_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
private GridView mGrid;
private GridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGrid = (GridView)findViewById(R.id.field);
        mGrid.setNumColumns(6);
        mGrid.setEnabled(true);

        mAdapter = new GridAdapter(this, 6, 6);
        mGrid.setAdapter(mAdapter);

    }

    private void adjustGridView(){

    }
}