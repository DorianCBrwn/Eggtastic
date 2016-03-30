package com.universalmastery.eggtastic;

/**
 * Created by D.Brown on 3/26/16.
 * Class to store recipe CardView data
 */
public class Recipe {
    private String recipeName;
    private String recipeDescription;
    private int recipeImage;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }


    public int getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(int recipeImage) {
        this.recipeImage = recipeImage;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }
}

