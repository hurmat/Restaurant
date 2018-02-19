package com.tes.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginSignUpActivity extends AppCompatActivity {

    Button loginBtn;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);

        loginBtn = (Button) findViewById(R.id.btnLoginA);
        signUpBtn = (Button) findViewById(R.id.btnSignUpA) ;

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start Login Activity
                startActivity(new Intent(LoginSignUpActivity.this, LoginActivity.class));

            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start Login Activity
                startActivity(new Intent(LoginSignUpActivity.this, SignUpActivity.class));

            }
        });
    }
}
