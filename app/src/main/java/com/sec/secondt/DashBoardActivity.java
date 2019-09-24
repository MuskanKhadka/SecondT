package com.sec.secondt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_Addition,button_FarToCel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        button_Addition = findViewById(R.id.button_Addition);
        button_FarToCel = findViewById(R.id.button_FarToCel);

        button_Addition.setOnClickListener(this);
        button_FarToCel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button_Addition){
            Intent intent = new Intent(DashBoardActivity.this,SumActivity.class);
            startActivity(intent);
        }

    }
}
