package com.example.rekentuinen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inzienActivity extends AppCompatActivity {

    public static final String STUUR_EXTRA = "default";
    public static final String MY_PREFS_NAME1 = "Prefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inzien);
    }

    public void goToNewOefenen(View view){
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);
        if(prefs.contains("name1") && prefs.contains("name2") && prefs.contains("name3") && prefs.contains("name4")
                && prefs.contains("name5") && prefs.contains("name6") && prefs.contains("name7") && prefs.contains("name8")
                && prefs.contains("name9") && prefs.contains("name10"))
        {
            Intent intent = new Intent(this, newOefenen.class);
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

    //Som functies
    public void showTafel1(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "1");
        startActivity(i);
    }
    public void showTafel2(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "2");
        startActivity(i);
    }
    public void showTafel3(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "3");
        startActivity(i);
    }
    public void showTafel4(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "4");
        startActivity(i);
    }
    public void showTafel5(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "5");
        startActivity(i);
    }
    public void showTafel6(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "6");
        startActivity(i);
    }
    public void showTafel7(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "7");
        startActivity(i);
    }
    public void showTafel8(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "8");
        startActivity(i);
    }
    public void showTafel9(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "9");
        startActivity(i);
    }
    public void showTafel10(View view){
        Intent i = new Intent(this, showTafel.class);
        i.putExtra(STUUR_EXTRA, "10");
        startActivity(i);
    }
    //Einde van functies
}
