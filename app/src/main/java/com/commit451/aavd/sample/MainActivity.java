package com.commit451.aavd.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.list)
    RecyclerView mList;

    VectorAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mToolbar.setTitle(R.string.app_name);
        mList.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new VectorAdapter(getVectors());
        mList.setAdapter(mAdapter);
    }

    private ArrayList<Vector> getVectors() {
        ArrayList<Vector> vectors = new ArrayList<>();
        vectors.add(new Vector(this, "Play/Reset", R.drawable.fab_play_to_reset_animated_vector, R.drawable.fab_reset_to_play_animated_vector));
        return vectors;
    }
}
