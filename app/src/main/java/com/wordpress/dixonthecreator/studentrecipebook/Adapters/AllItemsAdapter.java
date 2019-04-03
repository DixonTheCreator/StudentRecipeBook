package com.wordpress.dixonthecreator.studentrecipebook.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wordpress.dixonthecreator.studentrecipebook.Items.AllRecipesItem;
import com.wordpress.dixonthecreator.studentrecipebook.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AllItemsAdapter extends RecyclerView.Adapter<AllItemsAdapter.RecyclerViewViewHolder> {
    private ArrayList<AllRecipesItem> allRecipesItems;

     static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageResource;
        private TextView recipeName;
        private TextView contentDescription;

         RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageResource = itemView.findViewById(R.id.all_recipes_image_view);
            this.recipeName = itemView.findViewById(R.id.all_recipes_item_name);
            this.contentDescription = itemView.findViewById(R.id.all_recipes_item_content_description);
        }

    }

    public AllItemsAdapter(ArrayList<AllRecipesItem> allRecipesItems) {
        this.allRecipesItems = allRecipesItems;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_recipes_recycler_view_item, parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        AllRecipesItem allRecipesItem = allRecipesItems.get(position);
        holder.imageResource.setImageResource(allRecipesItem.getImageResource());
        holder.recipeName.setText(allRecipesItem.getNameOfRecipe());
        holder.contentDescription.setText(allRecipesItem.getRecipeDescription());
    }

    @Override
    public int getItemCount() {
        return allRecipesItems.size();
    }

}


