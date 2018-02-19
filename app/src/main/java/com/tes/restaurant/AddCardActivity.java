package com.tes.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddCardActivity extends AppCompatActivity {

    Button addCard, backKey;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        addCard = (Button) findViewById(R.id.btnAddCard);
        backKey =(Button) findViewById(R.id.btnBackAC);
        skip = (TextView) findViewById(R.id.txtSkip);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddCardActivity.this, LocationActivity.class));
            }
        });

        backKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        addCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddCardActivity.this, LocationActivity.class));
            }
        });
    }
}
