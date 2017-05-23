package com.example.terry.dmtools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NewCharacter extends AppCompatActivity implements View.OnClickListener {

    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_character);
        backButton = (Button) findViewById(R.id.backButton1);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.backButton1:
                onBackPressed();
                break;
            default:
                break;
        }
    }
}
