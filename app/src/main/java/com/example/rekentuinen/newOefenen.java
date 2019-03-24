package com.example.rekentuinen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class newOefenen extends AppCompatActivity {

    public static final String STUUR_EXTRA = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_new_oefenen);
    }

    public void finish(View v){
        this.finish();
    }

    //Intents naar toetsen van sommen
    public void toTafelToetsen11(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "11");
        startActivity(intent);
    }

    public void toTafelToetsen12(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "12");
        startActivity(intent);
    }

    public void toTafelToetsen13(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "13");
        startActivity(intent);
    }

    public void toTafelToetsen14(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "14");
        startActivity(intent);
    }

    public void toTafelToetsen15(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "15");
        startActivity(intent);
    }

    public void toTafelToetsen16(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "16");
        startActivity(intent);
    }

    public void toTafelToetsen17(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "17");
        startActivity(intent);
    }

    public void toTafelToetsen18(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "18");
        startActivity(intent);
    }

    public void toTafelToetsen19(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "19");
        startActivity(intent);
    }

    public void toTafelToetsen20(View view){
        Intent intent = new Intent(this, newOefenTafel.class);
        intent.putExtra(STUUR_EXTRA, "20");
        startActivity(intent);
    }
}
