package com.universalmastery.eggtastic;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by D.Brown on 3/26/16.
 */
public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {

public Context context;
    public ArrayList<Recipe> items = new ArrayList<>();

    public RecipeAdapter(Context context) {
        super();
        Recipe recipe = new Recipe();
        recipe.setRecipeName("Hard Boiled");
        recipe.setRecipeImage(R.drawable.hardboiled_egg_row);
        recipe.setRecipeDescription(context.getResources().getString(R.string.hardboiled_egg));
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Soft Boiled");
        recipe.setRecipeImage(R.drawable.soft_boiled_eggs);
        recipe.setRecipeDescription(context.getResources().getString(R.string.hardboiled_egg));
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Scrambled");
        recipe.setRecipeImage(R.drawable.scrambled_eggs);
        recipe.setRecipeDescription(context.getResources().getString(R.string.hardboiled_egg));
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Sunny Side Up");
        recipe.setRecipeImage(R.drawable.sunny_side_up);
        recipe.setRecipeDescription(context.getResources().getString(R.string.hardboiled_egg));
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Basted Egg");
        recipe.setRecipeImage(R.drawable.basted_egg);
        recipe.setRecipeDescription(context.getResources().getString(R.string.hardboiled_egg));
        items.add(recipe);

        recipe = new Recipe();
        recipe.setRecipeName("Poached Egg");
        recipe.setRecipeImage(R.drawable.poached_egg);
        recipe.setRecipeDescription(context.getResources().getString(R.string.hardboiled_egg));
        items.add(recipe);

        this.context = context;

    }

    @Override
    public RecipeAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View cardLayoutView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recipe_card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(cardLayoutView,context,items);
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

  static  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public ImageView recipeImage;
        public TextView recipeName;
       Context context;
ArrayList<Recipe> recipes = new ArrayList<>();
        public ViewHolder(View itemView, Context context,ArrayList<Recipe>recipes) {
            super(itemView);
            this.recipes = recipes;
            this.context = context;
            itemView.setOnClickListener(this);
            recipeImage = (ImageView) itemView.findViewById(R.id.recipe_image);
            recipeName = (TextView) itemView.findViewById(R.id.recipe_name);


        }

       @Override
       public void onClick(View v) {
            int position = getAdapterPosition();
           Recipe recipe = this.recipes.get(position);
           Intent intent = new Intent(context, DetailActivity.class);
           intent.putExtra("image id", recipe.getRecipeImage());
           intent.putExtra("recipe name",recipe.getRecipeName());
           intent.putExtra(DetailActivity.RECIPE_DESC, recipe.getRecipeDescription());
           intent.putExtra("cook time",recipe.getCookTime());
            context.startActivity(intent);
       }
   }
}
