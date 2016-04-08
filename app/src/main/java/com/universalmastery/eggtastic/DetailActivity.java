package com.universalmastery.eggtastic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by D.Brown on 3/29/16.
 */
public class DetailActivity  extends AppCompatActivity{

    public static final String RECIPE_DESC = "recipe_desc";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_detail);
//        this.requestWindowFeature(getWindow().FEATURE_NO_TITLE);

        Intent intent = getIntent();

        TextView textView = (TextView) findViewById(R.id.details_directions);
        textView.setText(Html.fromHtml(intent.getStringExtra(RECIPE_DESC)));




    }
}
