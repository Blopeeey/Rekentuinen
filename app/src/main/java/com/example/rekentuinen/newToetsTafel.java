package com.example.rekentuinen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class newToetsTafel extends AppCompatActivity {

    private EditText opgenomenData11;
    private EditText opgenomenData12;
    private EditText opgenomenData13;
    private EditText opgenomenData14;
    private EditText opgenomenData15;
    private EditText opgenomenData16;
    private EditText opgenomenData17;
    private EditText opgenomenData18;
    private EditText opgenomenData19;
    private EditText opgenomenData20;
    private Button control;

    public static final String MY_PREFS_NAME11 = "Prefs";
    public static final String MY_PREFS_NAME12 = "Prefs";
    public static final String MY_PREFS_NAME13 = "Prefs";
    public static final String MY_PREFS_NAME14 = "Prefs";
    public static final String MY_PREFS_NAME15 = "Prefs";
    public static final String MY_PREFS_NAME16 = "Prefs";
    public static final String MY_PREFS_NAME17 = "Prefs";
    public static final String MY_PREFS_NAME18 = "Prefs";
    public static final String MY_PREFS_NAME19 = "Prefs";
    public static final String MY_PREFS_NAME20 = "Prefs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_new_toets_tafel);

        //Disable button tot alles ingevuld is
        opgenomenData11 = (EditText) findViewById(R.id.somAntwoord11);
        opgenomenData12 = (EditText) findViewById(R.id.somAntwoord12);
        opgenomenData13 = (EditText) findViewById(R.id.somAntwoord13);
        opgenomenData14 = (EditText) findViewById(R.id.somAntwoord14);
        opgenomenData15 = (EditText) findViewById(R.id.somAntwoord15);
        opgenomenData16 = (EditText) findViewById(R.id.somAntwoord16);
        opgenomenData17 = (EditText) findViewById(R.id.somAntwoord17);
        opgenomenData18 = (EditText) findViewById(R.id.somAntwoord18);
        opgenomenData19 = (EditText) findViewById(R.id.somAntwoord19);
        opgenomenData20 = (EditText) findViewById(R.id.somAntwoord20);
        control = (Button) findViewById(R.id.control);

        //TextWatcher
        opgenomenData11.addTextChangedListener(somTextWatcher);
        opgenomenData12.addTextChangedListener(somTextWatcher);
        opgenomenData13.addTextChangedListener(somTextWatcher);
        opgenomenData14.addTextChangedListener(somTextWatcher);
        opgenomenData15.addTextChangedListener(somTextWatcher);
        opgenomenData16.addTextChangedListener(somTextWatcher);
        opgenomenData17.addTextChangedListener(somTextWatcher);
        opgenomenData18.addTextChangedListener(somTextWatcher);
        opgenomenData19.addTextChangedListener(somTextWatcher);
        opgenomenData20.addTextChangedListener(somTextWatcher);

        //Haalt intent gegevens op
        Intent intent = getIntent();
        String data = intent.getStringExtra(toetsen.STUUR_EXTRA);

        //Toont op welke tafel je zit
        TextView newTitel = (TextView) findViewById(R.id.toonNewTafel);
        String showNewTitel = "Tafel van " + data;
        newTitel.setText(showNewTitel);

        //Toont sommen
        String somInhoud = "";
        for(int i = 1; i < 11; i++){
            int test = Integer.parseInt(data);
            somInhoud+= test + " x " + i + " = \n";
            TextView som = (TextView) findViewById(R.id.toetsSom);
            som.setText(somInhoud);
        }
    }

    private TextWatcher somTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String som11 = opgenomenData11.getText().toString().trim();
            String som12 = opgenomenData12.getText().toString().trim();
            String som13 = opgenomenData13.getText().toString().trim();
            String som14 = opgenomenData14.getText().toString().trim();
            String som15 = opgenomenData15.getText().toString().trim();
            String som16 = opgenomenData16.getText().toString().trim();
            String som17 = opgenomenData17.getText().toString().trim();
            String som18 = opgenomenData18.getText().toString().trim();
            String som19 = opgenomenData19.getText().toString().trim();
            String som20 = opgenomenData20.getText().toString().trim();

            control.setEnabled(!som11.isEmpty() && !som12.isEmpty() && !som13.isEmpty() && !som14.isEmpty()
                    && !som15.isEmpty() && !som16.isEmpty() && !som17.isEmpty()
                    && !som18.isEmpty() && !som19.isEmpty() && !som20.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    int goedeNewAntwoorden = 0;

    public void buttonNewClick(View view) {
        //Haalt intent gegevens op
        Intent intent = getIntent();
        String data = intent.getStringExtra(toetsen.STUUR_EXTRA);

        //Antwoord 11
        EditText opgenomenData11 = (EditText) findViewById(R.id.somAntwoord11);
        int eindData1 = Integer.parseInt(data);
        int som1 = eindData1 * 1;
        String calcToString11 = Integer.toString(som1);
        if (opgenomenData11.getText().toString().equals(calcToString11)) {
            goedeNewAntwoorden++;
            opgenomenData11.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData11.setBackgroundColor(Color.RED);
        }

        //Antwoord 12
        EditText opgenomenData12 = (EditText) findViewById(R.id.somAntwoord12);
        int eindData2 = Integer.parseInt(data);
        int som2 = eindData2 * 2;
        String calcToString2 = Integer.toString(som2);
        if (opgenomenData12.getText().toString().equals(calcToString2)) {
            goedeNewAntwoorden++;
            opgenomenData12.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData12.setBackgroundColor(Color.RED);
        }

        //Antwoord 3
        EditText opgenomenData3 = (EditText) findViewById(R.id.somAntwoord13);
        int eindData3 = Integer.parseInt(data);
        int som3 = eindData3 * 3;
        String calcToString3 = Integer.toString(som3);
        if (opgenomenData3.getText().toString().equals(calcToString3)) {
            goedeNewAntwoorden++;
            opgenomenData3.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData3.setBackgroundColor(Color.RED);
        }


        //Antwoord 4
        EditText opgenomenData4 = (EditText) findViewById(R.id.somAntwoord14);
        int eindData4 = Integer.parseInt(data);
        int som4 = eindData4 * 4;
        String calcToString4 = Integer.toString(som4);
        if (opgenomenData4.getText().toString().equals(calcToString4)) {
            goedeNewAntwoorden++;
            opgenomenData4.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData4.setBackgroundColor(Color.RED);
        }

        //Antwoord 5
        EditText opgenomenData5 = (EditText) findViewById(R.id.somAntwoord15);
        int eindData5 = Integer.parseInt(data);
        int som5 = eindData5 * 5;
        String calcToString5 = Integer.toString(som5);
        if (opgenomenData5.getText().toString().equals(calcToString5)) {
            goedeNewAntwoorden++;
            opgenomenData5.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData5.setBackgroundColor(Color.RED);
        }

        //Antwoord 6
        EditText opgenomenData6 = (EditText) findViewById(R.id.somAntwoord16);
        int eindData6 = Integer.parseInt(data);
        int som6 = eindData6 * 6;
        String calcToString6 = Integer.toString(som6);
        if (opgenomenData6.getText().toString().equals(calcToString6)) {
            goedeNewAntwoorden++;
            opgenomenData6.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData6.setBackgroundColor(Color.RED);
        }

        //Antwoord 7
        EditText opgenomenData7 = (EditText) findViewById(R.id.somAntwoord17);
        int eindData7 = Integer.parseInt(data);
        int som7 = eindData7 * 7;
        String calcToString7 = Integer.toString(som7);
        if (opgenomenData7.getText().toString().equals(calcToString7)) {
            goedeNewAntwoorden++;
            opgenomenData7.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData7.setBackgroundColor(Color.RED);
        }

        //Antwoord 8
        EditText opgenomenData8 = (EditText) findViewById(R.id.somAntwoord18);
        int eindData8 = Integer.parseInt(data);
        int som8 = eindData8 * 8;
        String calcToString8 = Integer.toString(som8);
        if (opgenomenData8.getText().toString().equals(calcToString8)) {
            goedeNewAntwoorden++;
            opgenomenData8.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData8.setBackgroundColor(Color.RED);
        }

        //Antwoord 9
        EditText opgenomenData9 = (EditText) findViewById(R.id.somAntwoord19);
        int eindData9 = Integer.parseInt(data);
        int som9 = eindData9 * 9;
        String calcToString9 = Integer.toString(som9);
        if (opgenomenData9.getText().toString().equals(calcToString9)) {
            goedeNewAntwoorden++;
            opgenomenData9.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData9.setBackgroundColor(Color.RED);
        }

        //Antwoord 10
        EditText opgenomenData10 = (EditText) findViewById(R.id.somAntwoord20);
        int eindData10 = Integer.parseInt(data);
        int som10 = eindData10 * 10;
        String calcToString10 = Integer.toString(som10);
        if (opgenomenData10.getText().toString().equals(calcToString10)) {
            goedeNewAntwoorden++;
            opgenomenData10.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData10.setBackgroundColor(Color.RED);
        }

        String yeetus = Integer.toString(goedeNewAntwoorden);
        String laatsteAntwoord = "Je hebt " + yeetus + " van de sommen goed gemaakt!";
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(laatsteAntwoord);

        if (goedeNewAntwoorden == 10) {
            int p = Integer.parseInt(data);

            //Tafels
            if (p == 11) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME11, MODE_PRIVATE).edit();
                editor.putString("name11", data);
                editor.apply();
            }

            if (p == 12) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME12, MODE_PRIVATE).edit();
                editor.putString("name12", data);
                editor.apply();
            }

            if (p == 13) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME13, MODE_PRIVATE).edit();
                editor.putString("name13", data);
                editor.apply();
            }

            if (p == 14) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME14, MODE_PRIVATE).edit();
                editor.putString("name14", data);
                editor.apply();
            }

            if (p == 15) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME15, MODE_PRIVATE).edit();
                editor.putString("name15", data);
                editor.apply();
            }

            if (p == 16) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME16, MODE_PRIVATE).edit();
                editor.putString("name16", data);
                editor.apply();
            }

            if (p == 17) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME17, MODE_PRIVATE).edit();
                editor.putString("name17", data);
                editor.apply();
            }

            if (p == 18) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME18, MODE_PRIVATE).edit();
                editor.putString("name18", data);
                editor.apply();
            }

            if (p == 19) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME19, MODE_PRIVATE).edit();
                editor.putString("name19", data);
                editor.apply();
            }

            if (p == 20) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME20, MODE_PRIVATE).edit();
                editor.putString("name20", data);
                editor.apply();
            }
        }
    }
}
