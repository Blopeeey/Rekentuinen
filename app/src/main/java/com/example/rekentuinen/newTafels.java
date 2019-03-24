package com.example.rekentuinen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class newTafels extends AppCompatActivity {

    public static final String STUUR_EXTRA = "default";
    public static final String MY_PREFS_NAME1 = "Prefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_new_tafels);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);
        String name = prefs.getString("name", "No name defined");
        int tafel1 = Integer.parseInt(name);

        if(prefs.contains("name11")) {
            Button taf = (Button) findViewById(R.id.button22);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name12")) {
            Button taf = (Button) findViewById(R.id.button33);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name13")) {
            Button taf = (Button) findViewById(R.id.button34);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name14")) {
            Button taf = (Button) findViewById(R.id.button42);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name15")) {
            Button taf = (Button) findViewById(R.id.button43);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name16")) {
            Button taf = (Button) findViewById(R.id.button41);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name17")) {
            Button taf = (Button) findViewById(R.id.button46);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name18")) {
            Button taf = (Button) findViewById(R.id.button45);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name19")) {
            Button taf = (Button) findViewById(R.id.button44);
            taf.setBackgroundColor(Color.BLUE);
        }

        if(prefs.contains("name20")) {
            Button taf = (Button) findViewById(R.id.button47);
            taf.setBackgroundColor(Color.BLUE);
        }
    }

    //Terug naar 1 t/m 10
    public void finish(View v){
        this.finish();
    }

    //Intents naar toetsen van sommen
    public void toTafelToetsen11(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "11");
        startActivity(intent);
    }

    public void toTafelToetsen12(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "12");
        startActivity(intent);
    }

    public void toTafelToetsen13(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "13");
        startActivity(intent);
    }

    public void toTafelToetsen14(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "14");
        startActivity(intent);
    }

    public void toTafelToetsen15(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "15");
        startActivity(intent);
    }

    public void toTafelToetsen16(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "16");
        startActivity(intent);
    }

    public void toTafelToetsen17(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "17");
        startActivity(intent);
    }

    public void toTafelToetsen18(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "18");
        startActivity(intent);
    }

    public void toTafelToetsen19(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "19");
        startActivity(intent);
    }

    public void toTafelToetsen20(View view){
        Intent intent = new Intent(this, newToetsTafel.class);
        intent.putExtra(STUUR_EXTRA, "20");
        startActivity(intent);
    }
}
