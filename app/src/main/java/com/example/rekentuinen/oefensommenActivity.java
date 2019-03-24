package com.example.rekentuinen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class oefensommenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefensommen);

        Bundle bundle = getIntent().getExtras();

        String data_1 = bundle.getString("firstdata");
        String data_2 = bundle.getString("seconddata");

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText(data_1);
        textView2.setText(data_2);
    }
}
