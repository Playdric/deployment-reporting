package com.example.deployement_reporting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.appcenter.analytics.Analytics;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Analytics.trackEvent("My custom event2");
    }
}
