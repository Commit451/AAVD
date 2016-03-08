package com.commit451.aavd.sample;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Holds all the vectors
 */
public class VectorAdapter extends RecyclerView.Adapter<VectorViewHolder> {

    private ArrayList<Vector> mVectors;

    private final View.OnClickListener mOnItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            VectorViewHolder holder = (VectorViewHolder) v.getTag(R.layout.item_vector);
            int position = (int) v.getTag();
            Vector vector = mVectors.get(position);
            if (vector.active) {
                holder.icon.setImageDrawable(vector.activeDrawable);
            } else {
                holder.icon.setImageDrawable(vector.unactiveDrawable);
            }
            Drawable drawable = holder.icon.getDrawable();
            if (drawable instanceof Animatable) {
                vector.active = !vector.active;
                ((Animatable) drawable).start();
            }
        }
    };

    public VectorAdapter(Collection<Vector> vectors) {
        mVectors = new ArrayList<>();
        mVectors.addAll(vectors);
        notifyDataSetChanged();
    }

    @Override
    public VectorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        VectorViewHolder holder = VectorViewHolder.inflate(parent);
        holder.itemView.setOnClickListener(mOnItemClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(VectorViewHolder holder, int position) {
        holder.bind(mVectors.get(position));
        holder.itemView.setTag(position);
        holder.itemView.setTag(R.layout.item_vector, holder);
    }

    @Override
    public int getItemCount() {
        return mVectors.size();
    }
}
