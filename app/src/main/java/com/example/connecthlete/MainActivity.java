package com.example.connecthlete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button goAct3;
    private Button goSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"firebase connection really worked", Toast.LENGTH_LONG).show();

        goSignUp=(Button) findViewById(R.id.signup);
        goSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
                finish();
            }


        });
        goAct3=(Button) findViewById(R.id.signin);
        goAct3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,FindPeople.class);
               //check if username is unique
                startActivity(intent);
                finish();
            }


        });


    }


}