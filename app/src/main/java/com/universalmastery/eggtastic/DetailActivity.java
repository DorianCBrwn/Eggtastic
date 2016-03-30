package com.universalmastery.eggtastic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by D.Brown on 3/29/16.
 */
public class DetailActivity  extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_detail);
        this.requestWindowFeature(getWindow().FEATURE_NO_TITLE);

        Intent intent = getIntent();

    }
}
