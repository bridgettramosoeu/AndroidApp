package com.epicodus.jobhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class signUp extends AppCompatActivity implements View.OnClickListener{
@BindView(R.id.button3) Button mLandScreen;
@BindView(R.id.editText) EditText mUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        mLandScreen.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mLandScreen){
            String username = mUsername.getText().toString();
            Intent intent = new Intent(signUp.this,HomeActivity.class);
            intent.putExtra("username",username);
            startActivity(intent);
        }
    }
}
