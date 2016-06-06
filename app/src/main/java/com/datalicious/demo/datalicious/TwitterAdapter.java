package com.datalicious.demo.datalicious;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by enguru on 6/6/16.
 */
public class TwitterAdapter extends RecyclerView.Adapter<TwitterAdapter.MyViewHolder> {
    ArrayList<Tweet> tweets;
    TextView title,description;
    public  TwitterAdapter(ArrayList<Tweet> tweets){
        this.tweets=tweets;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.feedtitle);
            description=(TextView)itemView.findViewById(R.id.feeddescription);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_tweet,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Tweet obj=tweets.get(position);
//        title.setText (obj.getTitle().toString());
//        description.setText(obj.getDescription().toString());
    }


    @Override
    public int getItemCount() {
        return tweets.size();
    }
}
