package com.wordpress.dixonthecreator.studentrecipebook.Items;

public class AllRecipesItem {
    private int imageResource;
    private String nameOfRecipe;
    private String recipeDescription;
  //  private String recipe;

    public AllRecipesItem(int imageResource, String nameOfRecipe, String recipeDescription /* String recipe */) {
        this.imageResource = imageResource;
        this.nameOfRecipe = nameOfRecipe;
        this.recipeDescription = recipeDescription;
    //    this.recipe = recipe;
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

//    public String getRecipe() {
//        return recipe;
//    }
}
