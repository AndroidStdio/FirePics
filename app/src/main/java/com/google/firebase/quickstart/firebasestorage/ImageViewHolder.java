package com.google.firebase.quickstart.firebasestorage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by saurabh on 25/9/16.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;

    public ImageViewHolder(View itemView) {
        super(itemView);
        imageView= (ImageView) itemView.findViewById(R.id.image);
    }
}
