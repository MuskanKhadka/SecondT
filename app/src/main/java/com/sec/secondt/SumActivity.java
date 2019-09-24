package com.sec.secondt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SumActivity extends AppCompatActivity {
    private Button but_CON;
    private EditText ed_f;
    private TextView tv_c;
    double c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_CON = findViewById(R.id.butcon);
        ed_f = findViewById(R.id.txtF);
        tv_c = findViewById(R.id.viResult);
        but_CON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat i = new DecimalFormat("0.00");
                double f = Double.parseDouble(ed_f.getText().toString());
                c = (f - 32) * 5 / 9;
                tv_c.setText(String.valueOf("celsiua is " + i.format(c)));
            }
        });

    }

}
