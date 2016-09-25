package com.google.firebase.quickstart.firebasestorage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;

/**
 * Created by saurabh on 25/9/16.
 */

public class MyFirebaseRecyclerAdapter extends FirebaseRecyclerAdapter<String,ImageViewHolder> {
    public static final String TAG=MyFirebaseRecyclerAdapter.class.getSimpleName();
    private Context context;
    public MyFirebaseRecyclerAdapter(Class<String> modelClass, int modelLayout, Class<ImageViewHolder> viewHolderClass, DatabaseReference ref,Context context) {
        super(modelClass, modelLayout, viewHolderClass, ref);
        this.context=context;
    }

    @Override
    protected void populateViewHolder(ImageViewHolder viewHolder, String model, int position) {
        Glide.with(context).load(model).placeholder(R.drawable.firebase_lockup_400).into(viewHolder.imageView);
        Log.d(TAG, "populateViewHolder: "+model);
    }
}
