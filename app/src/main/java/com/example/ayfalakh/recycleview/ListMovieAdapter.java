package com.example.ayfalakh.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Movie> listMovie;

    public ListMovieAdapter(Context context) {
        this.context = context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Movie> getListPresident() {
        return  listMovie;
    }

    public void setListPresident(ArrayList<Movie> listPresident) {
        this. listMovie = listPresident;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvName.setText(getListPresident().get(i).getName());
        viewHolder.tvDescription.setText(getListPresident().get(i).getDescription());
        Glide.with(context)
                .load(Integer.valueOf(getListPresident().get(i).getPhoto()))
                .apply(new RequestOptions().override(60,60))
                .into(viewHolder.ivPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDescription;
        ImageView ivPhoto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDescription = itemView.findViewById(R.id.tv_item_desc);
            ivPhoto = itemView.findViewById(R.id.iv_item_photo);
        }
    }
}
