package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    EditText et_mine,et_com,et_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        et_mine = findViewById(R.id.et_mine);
        et_com = findViewById(R.id.et_com);
        et_result = findViewById(R.id.et_result);

        Button btn =  findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myclick();
            }
        });
    }
    public void myclick(){
        String mine = et_mine.getText().toString();
        String com = "";
        String result = "";

        double rnd = Math.random();
        if(rnd>0.5){
            com = "홀";
        } else {
            com = "짝";
        }

        if(mine.equals(com)){
            result = "승리";
        } else {
            result = "패배";
        }
        et_com.setText(com);
        et_result.setText(result);

    }
}









