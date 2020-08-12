package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et3 , et4;
    String n1 , n2;
    TextView calculation;
    Button add , sub ,mul , div;


    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
    public int mul(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et3 = findViewById(R.id.eNum3);
        et4 =findViewById(R.id.eNum4);

        Intent intent = getIntent();
        n1 = intent.getStringExtra("eNum1");
        n2= intent.getStringExtra("eNum2");

        et3.setText(n1);
        et4.setText(n2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        calculation = findViewById(R.id.calculation);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cal = add(Integer.parseInt(n1),Integer.parseInt(n2));
                calculation.setText(n1 + " + " + n2  + " = " + cal);
            }
        });

       sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cal = sub(Integer.parseInt(n1),Integer.parseInt(n2));
                calculation.setText(n1 + " - " + n2  + " = " + cal);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cal = mul(Integer.parseInt(n1),Integer.parseInt(n2));
                calculation.setText(n1 + " * " + n2  + " = " + cal);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cal = div(Integer.parseInt(n1),Integer.parseInt(n2));
                calculation.setText(n1 + " / " + n2  + " = " + cal);
            }
        });


    }
}