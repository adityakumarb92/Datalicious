package com.datalicious.demo.datalicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enguru on 4/6/16.
 */
public class PinterestFragment extends Fragment{
    ArrayList<Pint> pintList;

    RecyclerView recyclerView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.pinterest_fragmnet,container,false);
        recyclerView= (RecyclerView) view.findViewById(R.id.feedlist);
        fetchFeed();
        PinterestAdapter pinterestAdapter=new PinterestAdapter(pintList);
        recyclerView.setAdapter(pinterestAdapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Second.class);
                startActivity(in);
            }
        });

        return view;
    }

    private void fetchFeed() {

    }

}