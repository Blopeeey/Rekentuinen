package com.example.rekentuinen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class toetsen extends AppCompatActivity {

    public static final String STUUR_EXTRA = "default";
    public static final String MY_PREFS_NAME1 = "Prefs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_toetsen);


        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);
        String name = prefs.getString("name", "No name defined");
        int tafel1 = Integer.parseInt(name);

        if(prefs.contains("name1")) {
            Button taf = (Button) findViewById(R.id.button22);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name2")) {
            Button taf = (Button) findViewById(R.id.button33);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name3")) {
            Button taf = (Button) findViewById(R.id.button34);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name4")) {
            Button taf = (Button) findViewById(R.id.button42);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name5")) {
            Button taf = (Button) findViewById(R.id.button43);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name6")) {
            Button taf = (Button) findViewById(R.id.button41);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name7")) {
            Button taf = (Button) findViewById(R.id.button46);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name8")) {
            Button taf = (Button) findViewById(R.id.button45);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name9")) {
            Button taf = (Button) findViewById(R.id.button44);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name10")) {
            Button taf = (Button) findViewById(R.id.button47);
            taf.setBackgroundColor(Color.BLUE);
        }
    }

    public void goToNewTafels(View view){
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);
        if(prefs.contains("name1") && prefs.contains("name2") && prefs.contains("name3") && prefs.contains("name4")
                && prefs.contains("name5") && prefs.contains("name6") && prefs.contains("name7") && prefs.contains("name8")
                && prefs.contains("name9") && prefs.contains("name10"))
        {
            Intent intent = new Intent(this, newTafels.class);
            startActivity(intent);
        }
        else{
            Context context = getApplicationContext();
            CharSequence text = "GESLOTEN";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void toTafelToetsen1(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "1");
        startActivity(intent);
    }

    public void toTafelToetsen2(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "2");
        startActivity(intent);
    }

    public void toTafelToetsen3(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "3");
        startActivity(intent);
    }

    public void toTafelToetsen4(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "4");
        startActivity(intent);
    }

    public void toTafelToetsen5(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "5");
        startActivity(intent);
    }

    public void toTafelToetsen6(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "6");
        startActivity(intent);
    }

    public void toTafelToetsen7(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "7");
        startActivity(intent);
    }

    public void toTafelToetsen8(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "8");
        startActivity(intent);
    }

    public void toTafelToetsen9(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "9");
        startActivity(intent);
    }

    public void toTafelToetsen10(View view){
        Intent intent = new Intent(this, toetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "10");
        startActivity(intent);
    }
}
