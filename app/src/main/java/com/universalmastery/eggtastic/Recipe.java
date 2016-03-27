package com.universalmastery.eggtastic;

/**
 * Created by D.Brown on 3/26/16.
 * Class to store recipe data
 */
public class Recipe {
    String recipeName;
    String recipeDescription;
    int recipeImage;

    public Recipe(String recipeName, String recipeDescription, int recipeImage) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.recipeImage = recipeImage;
    }
}
