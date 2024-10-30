package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.Date;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        try {
            showdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public String getDate () throws Exception{

        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        return today.toString();
    }

    public void showdate () throws Exception {

        TextView  textView2 = findViewById(R.id.textView2);
        String today = getDate();
        textView2.setText(today);
    }

//    public void toggleColour (View v){
//        int id = v.getId();
//        v.setBackgroundColor(0xFF009688);
//    }

//    public void showName (View v){
//        //V -> Button !!!!
//        EditText editText = findViewById(R.id.editTextText);
//        String name = editText.getText().toString();
//
//        TextView hello = findViewById(R.id.textView);
//        String newHello = "Hello, " + name;
//        hello.setText(newHello);
//
//        v.setBackgroundColor(0xFF009688);
//    }
}