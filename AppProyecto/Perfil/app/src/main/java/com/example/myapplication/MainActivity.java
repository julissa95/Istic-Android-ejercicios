package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miButton = (Button) findViewById(R.id.button);
        miButton.setText("Usuario");

        final TextView mitexto = (TextView) findViewById(R.id.button);

        miButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("Lo que sea");
            }
        });

               
    }
}
