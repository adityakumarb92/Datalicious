package com.datalicious.demo.datalicious;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by enguru on 5/6/16.
 */
public class RssAdapter extends RecyclerView.Adapter<RssAdapter.MyViewHolder> {
    ArrayList<HandleXML> rssList;
    TextView title,description;
    public  RssAdapter(ArrayList<HandleXML> rssList){
        this.rssList=rssList;
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
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_rss,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        HandleXML obj=rssList.get(position);
        title.setText (obj.getTitle().toString());
        description.setText(obj.getDescription().toString());
    }


    @Override
    public int getItemCount() {
        return rssList.size();
    }


}
