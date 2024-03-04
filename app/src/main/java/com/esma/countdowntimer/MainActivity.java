package com.esma.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        //kaç saniye sayacağını,nasıl bir aralıkta saysın
        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {//biz 1000 yazdık yani her 1 saniyede bir ne yapsın
                textView.setText("Left: " + l/1000);//bölü bin dersek saniye sayar demezsek 1000 küsürlü yazılarla geri sayma işlemi yapıyor o yüzden 1000 e bölmek mantıklı
            }

            @Override
            public void onFinish() {//bitince ne yapayım
                Toast.makeText(MainActivity.this,"Done!", Toast.LENGTH_LONG).show();
                textView.setText("Finished!");
            }
        }.start();
    }
}