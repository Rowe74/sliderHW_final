package com.example.sliderhw_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // utilizes slide images 1-16 to make the game interface
        ImageButton b1 = findViewById(R.id.slide1);
        ImageButton b2 = findViewById(R.id.slide2);
        ImageButton b3 = findViewById(R.id.slide3);
        ImageButton b4 = findViewById(R.id.slide4);
        ImageButton b5 = findViewById(R.id.slide5);
        ImageButton b6 = findViewById(R.id.slide6);
        ImageButton b7 = findViewById(R.id.slide7);
        ImageButton b8 = findViewById(R.id.slide8);
        ImageButton b9 = findViewById(R.id.slide9);
        ImageButton b10 = findViewById(R.id.slide10);
        ImageButton b11 = findViewById(R.id.slide11);
        ImageButton b12 = findViewById(R.id.slide12);
        ImageButton b13 = findViewById(R.id.slide13);
        ImageButton b14 = findViewById(R.id.slide14);
        ImageButton b15 = findViewById(R.id.slide15);
        ImageButton b16 = findViewById(R.id.slide16);

        // controles the image being displayed
        ImageController Icon = new ImageController(this);  // simple intialization of the controller
        RandomizeController rx = new RandomizeController(Icon.get_board(), Icon); // simple randomize controller
        b1.setOnClickListener(Icon); // create listeners
        b2.setOnClickListener(Icon);
        b3.setOnClickListener(Icon);
        b4.setOnClickListener(Icon);
        b5.setOnClickListener(Icon);
        b6.setOnClickListener(Icon);
        b7.setOnClickListener(Icon);
        b8.setOnClickListener(Icon);
        b9.setOnClickListener(Icon);
        b10.setOnClickListener(Icon);
        b11.setOnClickListener(Icon);
        b12.setOnClickListener(Icon);
        b13.setOnClickListener(Icon);
        b14.setOnClickListener(Icon);
        b15.setOnClickListener(Icon);
        b16.setOnClickListener(Icon);

        ResetController Rcon = new ResetController(Icon.get_board(), Icon);
        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(Rcon);
        Button rand = findViewById(R.id.random);
        rand.setOnClickListener(rx);    }
}
