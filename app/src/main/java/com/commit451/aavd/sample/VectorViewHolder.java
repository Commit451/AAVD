package com.commit451.aavd.sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * View holder for a category
 * <br>
 * Copyright 2016 <a href="http://www.ovenbits.com">Oven Bits</a>
 *
 * @author Jawn.
 */
public class VectorViewHolder extends RecyclerView.ViewHolder {

    public static VectorViewHolder inflate(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_vector, parent, false);
        return new VectorViewHolder(view);
    }

    private VectorViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    @Bind(R.id.title)
    public TextView title;
    @Bind(R.id.icon)
    public ImageView icon;

    public void bind(Vector vector) {
        title.setText(vector.name);
        if (vector.active) {
            icon.setImageDrawable(vector.activeDrawable);
        } else {
            icon.setImageDrawable(vector.unactiveDrawable);
        }
    }
}

