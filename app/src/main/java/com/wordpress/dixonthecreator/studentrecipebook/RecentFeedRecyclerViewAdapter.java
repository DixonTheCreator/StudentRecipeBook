package com.wordpress.dixonthecreator.studentrecipebook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecentFeedRecyclerViewAdapter extends RecyclerView.Adapter<RecentFeedRecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecentFeedRecyclerViewItem> itemArrayList;

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        public ImageView recipeImageView;
        public TextView recipeName;
        public TextView priceTextView;
        public TextView priceValueTextView;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeImageView = itemView.findViewById(R.id.recipeImageView);
            recipeName = itemView.findViewById(R.id.recipeTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            priceValueTextView = itemView.findViewById(R.id.priceValueTextView);
        }
    }

    public RecentFeedRecyclerViewAdapter (ArrayList<RecentFeedRecyclerViewItem> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_feed_recycler_view_item, parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        RecentFeedRecyclerViewItem recentFeedRecyclerViewItem = itemArrayList.get(position);
        holder.recipeImageView.setImageResource(recentFeedRecyclerViewItem.getRecipeImageView());
        holder.recipeName.setText(recentFeedRecyclerViewItem.getRecipeName());
        holder.priceTextView.setText(recentFeedRecyclerViewItem.getPriceTextView());
        holder.priceValueTextView.setText(recentFeedRecyclerViewItem.getPriceValueTextView());
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

}
