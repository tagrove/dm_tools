package com.example.terry.dmtools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Because this class implements OnClickListener, we can simply define onClick
// as to avoid adding a listener to each and every button.
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button characterButton, newWorldButton, loadWorldButton, miscToolsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ties the layout of this class to the XML file.  The XML file is 'activity_main.xml'
        setContentView(R.layout.activity_main);

        // Initializes the buttons of this class to the buttons found in the XML file.
        // findViewById(R.id.characterButton) is the XML name of the button.  I usually
        // make these names identical to avoid confusion.
        characterButton = (Button) findViewById(R.id.characterButton);
        characterButton.setOnClickListener(this);

        newWorldButton = (Button) findViewById(R.id.newWorldButton);
        newWorldButton.setOnClickListener(this);

        loadWorldButton = (Button) findViewById(R.id.loadWorldButton);
        loadWorldButton.setOnClickListener(this);

        miscToolsButton = (Button) findViewById(R.id.miscToolsButton);
        miscToolsButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = null; // Intent is how you transition from one activity to another
        int parameter = 15; // Random Number to show how values are passed

        // If the button is X, do action Y.
        // In this case, each button transitions to a different activity
        switch (view.getId()){
            case R.id.characterButton:
                System.out.println("Character Button Has Been Clicked");
                i = new Intent(MainActivity.this, NewCharacter.class);

                break;
            case R.id.newWorldButton:
                System.out.println("New World Button Has Been Clicked");
                i = new Intent(MainActivity.this, NewWorld.class);

                break;
            case R.id.loadWorldButton:
                System.out.println("Load World Button Has Been Clicked");
                i = new Intent(MainActivity.this, LoadWorld.class);

                break;
            case R.id.miscToolsButton:
                System.out.println("Misc Tools Button Has Been Clicked");
                i = new Intent(MainActivity.this, MiscTools.class);

                break;
        }

        // This is how parameters are passed from the first activity to the second
        i.putExtra("parameter", parameter);
        startActivity(i);

    }
}
