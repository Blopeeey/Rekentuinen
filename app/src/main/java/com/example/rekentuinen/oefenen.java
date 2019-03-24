package com.example.rekentuinen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class oefenen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_2);
    }


    public void passData(View view){
        String data1 = "This is data 1";
        String data2 = "This is data 2";

        Intent passData_intent = new Intent(this, oefensommenActivity.class);

        passData_intent.putExtra("firstdata", data1);
        passData_intent.putExtra("seconddata", data2);

        startActivity(passData_intent);
    }
}
