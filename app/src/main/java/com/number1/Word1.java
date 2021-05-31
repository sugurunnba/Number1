package com.number1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//ランダムメソッドが使えるように記述
import java.util.Random;
//(TextView)記述時にエラーが発生しないように記述
import android.widget.TextView;

public class Word1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word1);

        String[] words = {"ジョナサン", "ジョセフ", "承太郎", "仗助", "ジョルノ"};
        Random random = new Random();
        int word = random.nextInt(5);
        String a = words[word];

        ((TextView)findViewById(R.id.tvWord1)).setText(a);
    }
}