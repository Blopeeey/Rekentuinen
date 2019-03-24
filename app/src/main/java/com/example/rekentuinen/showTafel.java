package com.example.rekentuinen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class showTafel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_show_tafel);

        //Haalt gegevens van de intent op
        Intent intent = getIntent();
        String data = intent.getStringExtra(inzienActivity.STUUR_EXTRA);

        //Toont op welke tafel je zit
        TextView titel = (TextView) findViewById(R.id.tafelTonen);
        String showTitel = "Tafel van " + data;
        titel.setText(showTitel);

        //Som gedeelte
        int num = Integer.parseInt(data);
        String r = "";
        for (int i = 1;i < 11; i++) {
            int result = (num * i);
            r+= num + " x " + i + " = " + result + "\n";
            TextView textViewTafel = (TextView)findViewById(R.id.tafels);
            textViewTafel.setText(r);
        }
    }
}
