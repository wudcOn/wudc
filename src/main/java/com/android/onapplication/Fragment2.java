package com.android.onapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Fragment2 extends AppCompatActivity {
    ImageButton b2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b2 = (ImageButton) findViewById(R.id.mypage);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
