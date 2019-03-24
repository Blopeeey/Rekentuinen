package com.example.rekentuinen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class welkomAcitvity extends AppCompatActivity {
    //Welkom scherm var
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welkom_acitvity);

        //Welkom scherm code
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                welkom();
            }
        }, SPLASH_TIME_OUT);
    }
    //Function voor welkom scherm
    public void welkom(){
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
        finish();
    }

}
