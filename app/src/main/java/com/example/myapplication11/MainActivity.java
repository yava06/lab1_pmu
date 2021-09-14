package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("SetTextI18n")
    public void onMyButtonClick(View view)
    {

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        textView.setText("Massive: ");
        textView2.setText("Max: ");
        textView3.setText("Min: ");
        // fill an array with random numbers between 0 and 50
        int[] ar = new int[10];
        for (int i = 0; i < 10; i++)
        {
            ar[i] = new Random().nextInt(50);
            textView.append(ar[i] + " ");
        }

        int maxValue = max(ar);
        int minValue = min(ar);

        textView2.append(String.valueOf(maxValue));
        textView3.append(String.valueOf(minValue));
    }

    public static int min(int... args) {
        int m = Integer.MAX_VALUE;
        for (int a : args) {
            if (a <= m) {
                m = a;
            }
        }
        return m;
    }

    public static int max(int... args) {
        int m = Integer.MIN_VALUE;
        for (int a : args) {
            if (a >= m) {
                m = a;
            }
        }
        return m;
    }

}