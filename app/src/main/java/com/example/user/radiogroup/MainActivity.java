package com.example.user.radiogroup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    public RadioButton rb1,rb2,rb3;
    public Button btn1, btn2;
    public LinearLayout le;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        rb2=findViewById(R.id.rb2);
        rb1=findViewById(R.id.rb1);
        btn2=findViewById(R.id.btn2);
        le=findViewById(R.id.ganiefes);
        rb3=findViewById(R.id.rb3);

    }

    public void ganiefes(View view) {
        if (rb1.isChecked())
            le.setBackgroundColor(Color.BLUE);
         if (rb2.isChecked())
            le.setBackgroundColor(Color.GREEN);
            if (rb3.isChecked())
                le.setBackgroundColor(Color.RED);
        }

    public void yeaiclicked(View view) {
        le.setBackgroundColor(Color.WHITE);
    }
}


