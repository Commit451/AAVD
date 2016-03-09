package com.commit451.aavd.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Shows all of the normal awesome animated vector drawables
 */
public class AAVDPathFragment extends Fragment {

    @Bind(R.id.list)
    RecyclerView mList;

    VectorAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_aavd, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        mList.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new VectorAdapter(getVectors());
        mList.setAdapter(mAdapter);
    }

    private ArrayList<Vector> getVectors() {
        ArrayList<Vector> vectors = new ArrayList<>();
        vectors.add(new Vector(getActivity(), "Share", R.drawable.aavd_avd_share, R.drawable.aavd_avd_share));
        vectors.add(new Vector(getActivity(), "Add to comments", R.drawable.aavd_avd_add_to_comment, R.drawable.aavd_avd_add_to_comment));
        vectors.add(new Vector(getActivity(), "Search/Back", R.drawable.aavd_avd_back_to_search, R.drawable.aavd_avd_search_to_back));
        return vectors;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}

