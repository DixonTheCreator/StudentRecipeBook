package com.wordpress.dixonthecreator.studentrecipebook.Items;

public class AllRecipesItem {
    private int imageResource;
    private String nameOfRecipe;
    private String recipeDescription;

    public AllRecipesItem(int imageSource, String nameOfRecipe, String recipeDescription) {
        this.imageResource = imageSource;
        this.nameOfRecipe = nameOfRecipe;
        this.recipeDescription = recipeDescription;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }
}
