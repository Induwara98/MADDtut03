package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1 , et2;
    Button btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.eNum1);
        et2=findViewById(R.id.eNum2);
        btns=findViewById(R.id.btnSend);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=et1.getText().toString();
                String n2=et2.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("eNum1",n1);
                intent.putExtra("eNum2",n2);
                startActivity(intent);

                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

                /*Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, (CharSequence) message,duration);
                toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
                toast.show();
                */

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();


            }
        });
    }
}