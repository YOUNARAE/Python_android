package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    EditText etMine,etCom,etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        etMine = findViewById(R.id.etMine);
        etCom = findViewById(R.id.etCom);
        etResult = findViewById(R.id.etResult);

        Button btn =  findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myclick();
            }
        });

    }

    public void myclick(){
        String mine = etMine.getText().toString();
        String com = "";
        String result = "";

        double rnd = Math.random();
        if(rnd>0.66) {
            com = "가위";
        }else if(rnd>0.33){
            com = "바위";
        } else {
            com = "보";
        }

        if(com.equals("가위")&&mine.equals("가위"))     result = "비김";
        if(com.equals("가위")&&mine.equals("바위"))     result = "승리";
        if(com.equals("가위")&&mine.equals("보"))      result = "짐";

        if(com.equals("바위")&&mine.equals("가위"))     result = "짐";
        if(com.equals("바위")&&mine.equals("바위"))     result = "비김";
        if(com.equals("바위")&&mine.equals("보"))      result = "승리";

        if(com.equals("보")&&mine.equals("가위"))     result = "승리";
        if(com.equals("보")&&mine.equals("바위"))     result = "짐";
        if(com.equals("보")&&mine.equals("보"))      result = "비김";

        
        etCom.setText(com);
        etResult.setText(result);
    }
}