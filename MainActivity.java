package com.example.dice_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView XML_imageView1;
    private ImageView XML_imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        XML_imageView1 = findViewById(R.id.XML_imageView1);
        XML_imageView2 = findViewById(R.id.XML_imageView2);
    }
    int getRandom(int range, int min) {

        return (int) (Math.random() * range) + min;


    }

    public void onClick(View view) {
        int[] diceId = {R.drawable.d1, R.drawable.d2,

                R.drawable.d3, R.drawable.d4,

                R.drawable.d5, R.drawable.d6};

        int rand = getRandom(6, 0);
        XML_imageView1.setImageResource(diceId[rand]);

        rand = getRandom(6, 0);
        XML_imageView2.setImageResource(diceId[rand]);
    }

}