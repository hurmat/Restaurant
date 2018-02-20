package com.tes.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TabHost tabHost =(TabHost) findViewById(R.id.tabHome);
        tabHost.setup();

        //tabOne
        TabHost.TabSpec specOne = tabHost.newTabSpec("Home");
        specOne.setContent(R.id.tabOne);
        specOne.setIndicator("Home");
        specOne.setIndicator(new Tab(getApplicationContext(), R.drawable.ic_home_grey,"Home"));
        tabHost.addTab(specOne);


        //tabTwo
        TabHost.TabSpec specTwo = tabHost.newTabSpec("Order");
        specTwo.setContent(R.id.tabTwo);
        specTwo.setIndicator("Order");
        specTwo.setIndicator(new Tab(getApplicationContext(), R.drawable.ic_recipes_grey2,"Ethereum"));
        tabHost.addTab(specTwo);

        //tabThree
    }
}
