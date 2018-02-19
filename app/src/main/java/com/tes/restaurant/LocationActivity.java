package com.tes.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationActivity extends AppCompatActivity {

    Button backKey, currentLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        backKey = (Button) findViewById(R.id.btnBackLoc);
        currentLoc =(Button) findViewById(R.id.btnCurrentLoc);

        currentLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocationActivity.this, FindingTruckActivity.class));
            }
        });
        backKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
