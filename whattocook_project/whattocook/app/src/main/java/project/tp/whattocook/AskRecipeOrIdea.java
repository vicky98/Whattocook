package project.tp.whattocook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AskRecipeOrIdea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_recipe_or_idea);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button search = (Button) findViewById(R.id.askrecipeoridea_search_button);
        search.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Action_AskRorItoSearch(view);
            }
        });

        Button random = (Button) findViewById(R.id.askrecipeoridea_random_button);
        random.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Action_AskRorItoRandomRecipe(view);
            }
        });
    }

    public void Action_AskRorItoSearch(View view)
    {
        Intent intent = new Intent(getApplicationContext(), Search.class);
        startActivity(intent);
    }

    public void Action_AskRorItoRandomRecipe(View view)
    {
        Intent intent = new Intent(getApplicationContext(), RandomRecipe.class);
        startActivity(intent);
    }
}
