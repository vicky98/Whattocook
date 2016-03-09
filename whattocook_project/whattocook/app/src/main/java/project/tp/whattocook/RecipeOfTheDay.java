package project.tp.whattocook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class RecipeOfTheDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_of_the_day);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button recipe = (Button) findViewById(R.id.rotd_recipe_button);
        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Action_ROTDtoRecipe(view);
            }
        });

        Button askroi = (Button) findViewById(R.id.rotd_askroi_button);
        askroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Action_ROTDtoAskRorIdea(view);
            }
        });
    }

    public void Action_ROTDtoRecipe(View view)
    {
        Intent intent = new Intent(getApplicationContext(), Recipe.class);
        startActivity(intent);
    }

    public void Action_ROTDtoAskRorIdea(View view)
    {
        Intent intent = new Intent(getApplicationContext(), AskRecipeOrIdea.class);
        startActivity(intent);
    }
}
