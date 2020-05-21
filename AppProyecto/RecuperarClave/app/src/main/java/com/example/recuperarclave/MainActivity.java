package com.example.recuperarclave;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miButton = (Button) findViewById(R.id.button2);
        miButton.setText("RecuperarClave");

        final TextView mitexto = (TextView) findViewById(R.id.button2);

    }
}
