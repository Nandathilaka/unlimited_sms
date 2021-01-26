package com.nandeproduction.unlimitedsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoadingApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_app);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {

                    Intent mainIntent = new Intent(LoadingApp.this, MainActivity.class);
                    startActivity(mainIntent);

                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}