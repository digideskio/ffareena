package com.smandroigames.bhmanager.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.smandroigames.R;

public class MainActivity extends Activity implements View.OnClickListener
{

    private Button newGameButton;
    private Button continueGameButton;
    private Button instructionsButton;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        initUI();
    }

    private void initUI() {
        newGameButton = (Button) findViewById(R.id.main_menu_new_game_button);
        continueGameButton = (Button) findViewById(R.id.main_menu_continue_game_button);
        instructionsButton = (Button) findViewById(R.id.main_menu_instructions_button);

        newGameButton.setOnClickListener(this);
        continueGameButton.setOnClickListener(this);
        instructionsButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();    //To change body of overridden methods use File | Settings | File Templates.
        updateUI();
    }

    private void updateUI() {
        continueGameButton.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == newGameButton.getId())
            newGame();
        else if(view.getId() == continueGameButton.getId())
            continueGame();
        else if(view.getId() == instructionsButton.getId())
            instructions();
    }

    private void newGame() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    private void continueGame() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    private void instructions() {
    }


}
