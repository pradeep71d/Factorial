package com.example.factorialexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i;
        int fact=1;
        int number=5;
        for (i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
