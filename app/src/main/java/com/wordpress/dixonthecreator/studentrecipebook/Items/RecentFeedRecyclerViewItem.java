package com.wordpress.dixonthecreator.studentrecipebook.Items;

import android.widget.ImageView;
import android.widget.TextView;

public class RecentFeedRecyclerViewItem {
    private int recipeImageView;
    private String recipeName;
    private String  priceTextView;
    private String priceValueTextView;

    public RecentFeedRecyclerViewItem(int recipeImageView, String recipeName, String priceTextView, String priceValueTextView) {
        this.recipeImageView = recipeImageView;
        this.recipeName = recipeName;
        this.priceTextView = priceTextView;
        this.priceValueTextView = priceValueTextView;
    }

    public int getRecipeImageView() {
        return recipeImageView;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getPriceTextView() {
        return priceTextView;
    }

    public String getPriceValueTextView() {
        return priceValueTextView;
    }
}