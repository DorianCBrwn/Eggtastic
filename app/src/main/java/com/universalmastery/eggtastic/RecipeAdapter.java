package com.universalmastery.eggtastic;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by D.Brown on 3/26/16.
 */
public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {


    List<Recipe> items;;

    public RecipeAdapter() {
        super();
        items = new ArrayList<>();
        Recipe recipe = new Recipe();
        recipe.setRecipeName("Hard Boiled");
        recipe.setRecipeImage(R.drawable.hardboiled_egg_row_large);
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Soft Boiled");
        recipe.setRecipeImage(R.drawable.soft_boiled_eggs);
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Scrambled");
        recipe.setRecipeImage(R.drawable.scrambled_eggs);
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Sunny Side Up");
        recipe.setRecipeImage(R.drawable.sunny_side_up);
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Basted Egg");
        recipe.setRecipeImage(R.drawable.basted_egg);
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Poached Egg");
        recipe.setRecipeImage(R.drawable.poached_egg);
        items.add(recipe);

    }

    @Override
    public RecipeAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recipe_card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Recipe recipe = items.get(i);
        viewHolder.recipeName.setText(recipe.getRecipeName());
        viewHolder.recipeImage.setImageResource(recipe.getRecipeImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

   class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView recipeImage;
        public TextView recipeName;

        public ViewHolder(View itemView) {
            super(itemView);
            recipeImage = (ImageView) itemView.findViewById(R.id.recipe_image);
            recipeName = (TextView) itemView.findViewById(R.id.recipe_name);
        }
    }
}
