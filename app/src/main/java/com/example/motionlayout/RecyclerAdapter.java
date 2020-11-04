package com.example.motionlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    List<Contentgetset> contents=new ArrayList<>();
    Context context;

    public RecyclerAdapter(List<Contentgetset> contents, Context context) {
        this.contents = contents;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cards,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //holder.postsimages.setImageResource(posts.get(position));
        Glide.with(context).load(contents.get(position).getThumbnails()).centerCrop()
                .into(holder.thumbnail);
        holder.desc.setText(contents.get(position).getDesc().toString());
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView thumbnail;
        TextView desc;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail=itemView.findViewById(R.id.thumbnail);
            desc=itemView.findViewById(R.id.descri);
        }
    }
}
