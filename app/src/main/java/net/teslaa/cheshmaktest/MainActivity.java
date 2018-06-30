package net.teslaa.cheshmaktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.cheshmak.android.sdk.core.Cheshmak;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cheshmak.with(getApplicationContext());
        Cheshmak.initTracker("5b12bf37c02e920015182b40");
    }
}
