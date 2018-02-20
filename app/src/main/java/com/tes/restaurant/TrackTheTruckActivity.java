package com.tes.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class TrackTheTruckActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    ImageButton truck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_the_truck);


        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.my_toolbar);
        truck = (ImageButton) findViewById(R.id.imgBtnTruck);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        truck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUP();
            }
        });



    }

    private void showPopUP() {
    //show popUp
        final AlertDialog alertBox;
        final View mView = getLayoutInflater().inflate(R.layout.booking_alert, null);

        Button booknow = (Button) mView.findViewById(R.id.btnBookNow);
        Button seeMenu = (Button) mView.findViewById(R.id.btnSeeMenu);

        alertBox = new AlertDialog.Builder(TrackTheTruckActivity.this).create();
        alertBox.setView(mView);
        alertBox.show();
        alertBox.setCancelable(true);

        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrackTheTruckActivity.this, HomeActivity.class));
            }
        });

        seeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TrackTheTruckActivity.this, "SEEMenu!!", Toast.LENGTH_SHORT).show();
            }
        });

    }



}

