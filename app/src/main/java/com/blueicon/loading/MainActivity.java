package com.blueicon.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blueicon.loading.tool.Loading;

public class MainActivity extends AppCompatActivity {

    private Button btnAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnimation = (Button)findViewById(R.id.animacion);
        btnAnimation.setOnClickListener(evento);
    }

    View.OnClickListener evento =  new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Loading loading = new Loading(MainActivity.this);
            loading.messageDialog("mensaje","mensaje");

        }
    };



}
