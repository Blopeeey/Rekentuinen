package com.example.rekentuinen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    //Redirect vars
    private Button inzien;
    private Button toetsen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Redirect code naar oefenen
        inzien = (Button) findViewById(R.id.inzien);
        inzien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inzien();
            }
        });


        //Redirect code naar toetsen
        toetsen = (Button) findViewById(R.id.toetsen);
        toetsen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                toetsen();
            }
        });
    }

    //Function naar oefenen
    public void inzien() {
        Intent intent = new Intent(this, inzienActivity.class);
        startActivity(intent);
    }

    //Function naar toetsen
    public void toetsen() {
        Intent intent = new Intent(this, toetsen.class);
        startActivity(intent);
    }
}
