package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {
    EditText et_f;
    EditText et_l;
    TextView tv_disp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        et_f = findViewById(R.id.et_f);
        et_l = findViewById(R.id.et_l);
        tv_disp = findViewById(R.id.tv_disp);
        Button btn =  findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myclick();
            }
        });
    }

    public String drawLine(int cnt){
        String ret = "";
        for(int i=0;i<cnt;i++){
            ret += "*";
        }
        ret += "\n";
        return ret;
    }

    public void myclick(){
        int a = Integer.parseInt(et_f.getText().toString());
        int b = Integer.parseInt(et_l.getText().toString());

        String txt = "";

        for(int i=a;i<=b;i++){
            txt += drawLine(i);
        }


        tv_disp.setText(txt);

    }


}