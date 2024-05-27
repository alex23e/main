package com.example.testgit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView out1;
    Button btnsum;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out1 = findViewById(R.id.txt1);
        num1 = findViewById(R.id.edt1);
        num2 = findViewById(R.id.edt2);
        btnsum = findViewById(R.id.btnsum);

        btnsum.setOnClickListener(v -> {
            float a = Float.parseFloat(num1.getText().toString());
            float b = Float.parseFloat(num2.getText().toString());
            float c = a+b;
            s=Float.toString(c);
            out1.setText(s);
        });
    }
}
// the chages has been edited by Ali Shahbazi in some values (num, out).