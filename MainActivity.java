package com.example.testgit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2;
    TextView txt1;
    Button btnsum;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnsum = findViewById(R.id.btnsum);

        btnsum.setOnClickListener(v -> {
            float a = Float.parseFloat(edt1.getText().toString());
            float b = Float.parseFloat(edt2.getText().toString());
            float c = a+b;
            s=Float.toString(c);
            txt1.setText(s);
        });
    }
}