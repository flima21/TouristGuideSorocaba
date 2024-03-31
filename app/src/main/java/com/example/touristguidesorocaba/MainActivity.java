package com.example.touristguidesorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonGetMuseu;
    Button buttonGetZoo;
    Button buttonGetPalacio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGetMuseu = findViewById(R.id.buttonGetMuseu);
        Button buttonGetShopping = findViewById(R.id.buttonGetShopping);
        Button buttonGetZoo = findViewById(R.id.buttonGetZoo);
    }

    public void goMuseu(View view) {
        try {
            Intent museuPage = new Intent(this, MuseuPage.class);
            startActivity(museuPage);
        }
        catch(Throwable error) {
            Toast.makeText(this,error.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public void goZoo(View view) {
        try {
            Intent museuPage = new Intent(this, ZooPage.class);
            startActivity(museuPage);
        }
        catch(Throwable error) {
            Toast.makeText(this,error.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public void goShopping(View view) {
        try {
            Intent museuPage = new Intent(this, ShoppingPage.class);
            startActivity(museuPage);
        }
        catch(Throwable error) {
            Toast.makeText(this,error.getMessage(),Toast.LENGTH_LONG).show();
        }
    }


}
