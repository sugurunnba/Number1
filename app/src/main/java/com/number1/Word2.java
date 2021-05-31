package com.number1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Word2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word2);

        String[] words = {"ジョナサン", "ジョセフ", "承太郎", "仗助", "ジョルノ"};
        Random random = new Random();
        int word = random.nextInt(5);
        String a = words[word];

        ((TextView)findViewById(R.id.tvWord1)).setText(a);

        String[] words2 = {"ジョースター", "ジョースター", "空条", "空条", "ジョバーナ"};
        Random random2 = new Random();
        int word2 = random2.nextInt(5);
        String a2 = words2[word2];

        ((TextView)findViewById(R.id.tvWord2)).setText(a2);

        String[] words3 = {"君が！泣くまで！殴るのを！やめない！", "クラッカーボレー！", "やれやれだぜ", "壊して治す", "覚悟が道を切り開く"};
        Random random3 = new Random();
        int word3 = random3.nextInt(5);
        String a3 = words3[word3];

        ((TextView)findViewById(R.id.tvWord3)).setText(a3);
    }
}