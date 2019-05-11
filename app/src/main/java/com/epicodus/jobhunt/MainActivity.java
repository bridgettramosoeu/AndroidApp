package com.epicodus.jobhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.button) Button msignupButton;
    @BindView(R.id.button2) Button mloginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        msignupButton.setOnClickListener(this);
        mloginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == msignupButton) {
            Intent intent = new Intent(MainActivity.this, signUp.class);
            startActivity(intent);
        }
        else if(v == mloginButton){
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);
        }
    }
}
