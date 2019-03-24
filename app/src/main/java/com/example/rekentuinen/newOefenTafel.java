package com.example.rekentuinen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class newOefenTafel extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_new_oefen_tafel);

        //Haalt intent gegevens op
        Intent intent = getIntent();
        String data = intent.getStringExtra(toetsen.STUUR_EXTRA);

        //Toont op welke tafel je zit
        TextView titel = (TextView) findViewById(R.id.tafelTonen);
        String showTitel = "Tafel van " + data;
        titel.setText(showTitel);

        //Som gedeelte
        String resultaat = "";
        int num = Integer.parseInt(data);
        for (int i = 1; i < 11; i++) {
            int ant = (num * i);

            resultaat += num + " x " + i + " = " + ant + "\n";
            TextView toets = (TextView) findViewById(R.id.tafels);
            toets.setText(resultaat);
        }
    }



}
