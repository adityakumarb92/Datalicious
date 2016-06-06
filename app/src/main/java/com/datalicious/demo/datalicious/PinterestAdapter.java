package com.datalicious.demo.datalicious;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by enguru on 6/6/16.
 */
public class PinterestAdapter extends RecyclerView.Adapter<PinterestAdapter.MyViewHolder> {
    ArrayList<Pint> pintList;
    TextView title, link;
    ImageView img;

    public PinterestAdapter(ArrayList<Pint> pintList) {
        this.pintList = pintList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.pint);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_pinterest, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pint obj = pintList.get(position);

    }


    @Override
    public int getItemCount() {
        return pintList.size();
    }
}