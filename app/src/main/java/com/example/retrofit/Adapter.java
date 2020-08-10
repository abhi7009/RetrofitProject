package com.example.retrofit;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<Model> items;

    public Adapter(Context context, List<Model> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_view,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.USERID.setText(items.get(position).getUserId());
        holder.ID.setText(items.get(position).getId());
        holder.TITLE.setText(items.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView USERID,ID,TITLE;
        public ViewHolder(@NonNull View itemView) {
           super(itemView);
           USERID = (TextView) itemView.findViewById(R.id.userId);
           ID = (TextView) itemView.findViewById(R.id.id);
           TITLE = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
