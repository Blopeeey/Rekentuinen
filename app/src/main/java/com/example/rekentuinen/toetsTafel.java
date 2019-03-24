package com.example.rekentuinen;

import android.content.Context;
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
import android.widget.Toast;

public class toetsTafel extends AppCompatActivity {

    private EditText opgenomenData1;
    private EditText opgenomenData2;
    private EditText opgenomenData3;
    private EditText opgenomenData4;
    private EditText opgenomenData5;
    private EditText opgenomenData6;
    private EditText opgenomenData7;
    private EditText opgenomenData8;
    private EditText opgenomenData9;
    private EditText opgenomenData10;
    private Button cont;

    public static final String MY_PREFS_NAME1 = "Prefs";
    public static final String MY_PREFS_NAME2 = "Prefs";
    public static final String MY_PREFS_NAME3 = "Prefs";
    public static final String MY_PREFS_NAME4 = "Prefs";
    public static final String MY_PREFS_NAME5 = "Prefs";
    public static final String MY_PREFS_NAME6 = "Prefs";
    public static final String MY_PREFS_NAME7 = "Prefs";
    public static final String MY_PREFS_NAME8 = "Prefs";
    public static final String MY_PREFS_NAME9 = "Prefs";
    public static final String MY_PREFS_NAME10 = "Prefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_toets_tafel);

        //Disable button tot alles ingevuld is
        opgenomenData1 = (EditText) findViewById(R.id.somAntwoord1);
        opgenomenData2 = (EditText) findViewById(R.id.somAntwoord2);
        opgenomenData3 = (EditText) findViewById(R.id.somAntwoord3);
        opgenomenData4 = (EditText) findViewById(R.id.somAntwoord4);
        opgenomenData5 = (EditText) findViewById(R.id.somAntwoord5);
        opgenomenData6 = (EditText) findViewById(R.id.somAntwoord6);
        opgenomenData7 = (EditText) findViewById(R.id.somAntwoord7);
        opgenomenData8 = (EditText) findViewById(R.id.somAntwoord8);
        opgenomenData9 = (EditText) findViewById(R.id.somAntwoord9);
        opgenomenData10 = (EditText) findViewById(R.id.somAntwoord10);
        cont = (Button) findViewById(R.id.cont);

        //TextWatcher
        opgenomenData1.addTextChangedListener(somTextWatcher);
        opgenomenData2.addTextChangedListener(somTextWatcher);
        opgenomenData3.addTextChangedListener(somTextWatcher);
        opgenomenData4.addTextChangedListener(somTextWatcher);
        opgenomenData5.addTextChangedListener(somTextWatcher);
        opgenomenData6.addTextChangedListener(somTextWatcher);
        opgenomenData7.addTextChangedListener(somTextWatcher);
        opgenomenData8.addTextChangedListener(somTextWatcher);
        opgenomenData9.addTextChangedListener(somTextWatcher);
        opgenomenData10.addTextChangedListener(somTextWatcher);


        //Haalt intent gegevens op
        Intent intent = getIntent();
        String data = intent.getStringExtra(toetsen.STUUR_EXTRA);

        //Toont op welke tafel je zit
        TextView titel = (TextView) findViewById(R.id.toonTafel);
        String showTitel = "Tafel van " + data;
        titel.setText(showTitel);

        //Som gedeelte
        String resultaat = "";
        int num = Integer.parseInt(data);
        for (int i = 1; i < 11; i++) {
            int ant = (num * i);

            resultaat += num + " x " + i + " = \n";
            TextView toets = (TextView) findViewById(R.id.toetsSom);
            toets.setText(resultaat);
        }
    }

    private TextWatcher somTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String som1 = opgenomenData1.getText().toString().trim();
            String som2 = opgenomenData2.getText().toString().trim();
            String som3 = opgenomenData3.getText().toString().trim();
            String som4 = opgenomenData4.getText().toString().trim();
            String som5 = opgenomenData5.getText().toString().trim();
            String som6 = opgenomenData6.getText().toString().trim();
            String som7 = opgenomenData7.getText().toString().trim();
            String som8 = opgenomenData8.getText().toString().trim();
            String som9 = opgenomenData9.getText().toString().trim();
            String som10 = opgenomenData10.getText().toString().trim();

            cont.setEnabled(!som1.isEmpty() && !som2.isEmpty() && !som3.isEmpty() && !som4.isEmpty()
                    && !som5.isEmpty() && !som6.isEmpty() && !som7.isEmpty()
                    && !som8.isEmpty() && !som9.isEmpty() && !som10.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    int goedeAntwoorden = 0;

    public void buttonClick(View view) {
        //Haalt intent gegevens op
        Intent intent = getIntent();
        String data = intent.getStringExtra(toetsen.STUUR_EXTRA);

        //Antwoord 1
        EditText opgenomenData1 = (EditText) findViewById(R.id.somAntwoord1);
        int eindData1 = Integer.parseInt(data);
        int som1 = eindData1 * 1;
        String calcToString1 = Integer.toString(som1);
        if (opgenomenData1.getText().toString().equals(calcToString1)) {
            goedeAntwoorden++;
            opgenomenData1.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData1.setBackgroundColor(Color.RED);
        }

        //Antwoord 2
        EditText opgenomenData2 = (EditText) findViewById(R.id.somAntwoord2);
        int eindData2 = Integer.parseInt(data);
        int som2 = eindData2 * 2;
        String calcToString2 = Integer.toString(som2);
        if (opgenomenData2.getText().toString().equals(calcToString2)) {
            goedeAntwoorden++;
            opgenomenData2.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData2.setBackgroundColor(Color.RED);
        }

        //Antwoord 3
        EditText opgenomenData3 = (EditText) findViewById(R.id.somAntwoord3);
        int eindData3 = Integer.parseInt(data);
        int som3 = eindData3 * 3;
        String calcToString3 = Integer.toString(som3);
        if (opgenomenData3.getText().toString().equals(calcToString3)) {
            goedeAntwoorden++;
            opgenomenData3.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData3.setBackgroundColor(Color.RED);
        }


        //Antwoord 4
        EditText opgenomenData4 = (EditText) findViewById(R.id.somAntwoord4);
        int eindData4 = Integer.parseInt(data);
        int som4 = eindData4 * 4;
        String calcToString4 = Integer.toString(som4);
        if (opgenomenData4.getText().toString().equals(calcToString4)) {
            goedeAntwoorden++;
            opgenomenData4.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData4.setBackgroundColor(Color.RED);
        }

        //Antwoord 5
        EditText opgenomenData5 = (EditText) findViewById(R.id.somAntwoord5);
        int eindData5 = Integer.parseInt(data);
        int som5 = eindData5 * 5;
        String calcToString5 = Integer.toString(som5);
        if (opgenomenData5.getText().toString().equals(calcToString5)) {
            goedeAntwoorden++;
            opgenomenData5.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData5.setBackgroundColor(Color.RED);
        }

        //Antwoord 6
        EditText opgenomenData6 = (EditText) findViewById(R.id.somAntwoord6);
        int eindData6 = Integer.parseInt(data);
        int som6 = eindData6 * 6;
        String calcToString6 = Integer.toString(som6);
        if (opgenomenData6.getText().toString().equals(calcToString6)) {
            goedeAntwoorden++;
            opgenomenData6.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData6.setBackgroundColor(Color.RED);
        }

        //Antwoord 7
        EditText opgenomenData7 = (EditText) findViewById(R.id.somAntwoord7);
        int eindData7 = Integer.parseInt(data);
        int som7 = eindData7 * 7;
        String calcToString7 = Integer.toString(som7);
        if (opgenomenData7.getText().toString().equals(calcToString7)) {
            goedeAntwoorden++;
            opgenomenData7.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData7.setBackgroundColor(Color.RED);
        }

        //Antwoord 8
        EditText opgenomenData8 = (EditText) findViewById(R.id.somAntwoord8);
        int eindData8 = Integer.parseInt(data);
        int som8 = eindData8 * 8;
        String calcToString8 = Integer.toString(som8);
        if (opgenomenData8.getText().toString().equals(calcToString8)) {
            goedeAntwoorden++;
            opgenomenData8.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData8.setBackgroundColor(Color.RED);
        }

        //Antwoord 9
        EditText opgenomenData9 = (EditText) findViewById(R.id.somAntwoord9);
        int eindData9 = Integer.parseInt(data);
        int som9 = eindData9 * 9;
        String calcToString9 = Integer.toString(som9);
        if (opgenomenData9.getText().toString().equals(calcToString9)) {
            goedeAntwoorden++;
            opgenomenData9.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData9.setBackgroundColor(Color.RED);
        }

        //Antwoord 10
        EditText opgenomenData10 = (EditText) findViewById(R.id.somAntwoord10);
        int eindData10 = Integer.parseInt(data);
        int som10 = eindData10 * 10;
        String calcToString10 = Integer.toString(som10);
        if (opgenomenData10.getText().toString().equals(calcToString10)) {
            goedeAntwoorden++;
            opgenomenData10.setBackgroundColor(Color.GREEN);
        } else {
            opgenomenData10.setBackgroundColor(Color.RED);
        }

        String yeetus = Integer.toString(goedeAntwoorden);
        String laatsteAntwoord = "Je hebt " + yeetus + " van de sommen goed gemaakt!";
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(laatsteAntwoord);

        if (goedeAntwoorden == 10) {
            int p = Integer.parseInt(data);

            //Tafels
            if(p == 1) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE).edit();
                editor.putString("name1", data);
                editor.apply();
            }

            if(p == 2) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME2, MODE_PRIVATE).edit();
                editor.putString("name2", data);
                editor.apply();
            }

            if(p == 3) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME3, MODE_PRIVATE).edit();
                editor.putString("name3", data);
                editor.apply();
            }

            if(p == 4) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME4, MODE_PRIVATE).edit();
                editor.putString("name4", data);
                editor.apply();
            }

            if(p == 5) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME5, MODE_PRIVATE).edit();
                editor.putString("name5", data);
                editor.apply();
            }

            if(p == 6) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME6, MODE_PRIVATE).edit();
                editor.putString("name6", data);
                editor.apply();
            }

            if(p == 7) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME7, MODE_PRIVATE).edit();
                editor.putString("name7", data);
                editor.apply();
            }

            if(p == 8) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME8, MODE_PRIVATE).edit();
                editor.putString("name8", data);
                editor.apply();
            }

            if(p == 9) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME9, MODE_PRIVATE).edit();
                editor.putString("name9", data);
                editor.apply();
            }

            if(p == 10) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                editor.putString("name10", data);
                editor.apply();
            }
        }
        Button weg = (Button) findViewById(R.id.cont);
        weg.setVisibility(View.GONE);
    }
}
