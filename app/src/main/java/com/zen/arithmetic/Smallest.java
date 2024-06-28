package com.zen.arithmetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Smallest extends AppCompatActivity {

    EditText e1,e2;
    AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smallest);

        e1=(EditText) findViewById(R.id.no1);
        e2=(EditText) findViewById(R.id.no2);
        b1=(AppCompatButton) findViewById(R.id.equals);
        b2=(AppCompatButton) findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    if(a<b)
                    {
                        Toast.makeText(getApplicationContext(), "Smallest Number is: " + a, Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Smallest Number is: " + b, Toast.LENGTH_LONG).show();
                    }

                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Unknown Error",Toast.LENGTH_LONG).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });

    }
}