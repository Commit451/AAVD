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
public class AAVDFragment extends Fragment {

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
        vectors.add(new Vector(getActivity(), "Play/Reset", R.drawable.avd_play_to_reset, R.drawable.avd_reset_to_play));
        vectors.add(new Vector(getActivity(), "Views", R.drawable.avd_views, R.drawable.avd_views));
        vectors.add(new Vector(getActivity(), "Followers", R.drawable.avd_followers, R.drawable.avd_followers));
        vectors.add(new Vector(getActivity(), "Heart Beat", R.drawable.avd_likes, R.drawable.avd_likes));
        return vectors;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}

