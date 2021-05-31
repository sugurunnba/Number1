 package com.number1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//22行目、intentが使用できるようにするため記述
import android.content.Intent;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      ボタンで画面遷移(btnWord1をクリックした際にword1へ遷移)
        findViewById(R.id.btnWord1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                　　　　　　　　　　　　　　　MainActivityのこのクラス から Word1のクラス へ遷移
                Intent intent = new Intent (MainActivity.this,Word1.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnWord2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                　　　　　　　　　　　　　　　MainActivityのこのクラス から Word1のクラス へ遷移
                Intent intent = new Intent (MainActivity.this,Word2.class);
                startActivity(intent);
            }
        });
    }
}