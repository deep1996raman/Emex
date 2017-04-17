package com.example.android.emex.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.android.emex.model.JobHistoryModel;

import java.util.ArrayList;

/**
 * Created by abc on 14-Apr-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
     private int mode;
    private ArrayList<JobHistoryModel>jobHistoryModels;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return  null;
    }

    public RecyclerAdapter(int mode, ArrayList<JobHistoryModel> jobHistoryModels) {
        this.mode = mode;
        this.jobHistoryModels = jobHistoryModels;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
