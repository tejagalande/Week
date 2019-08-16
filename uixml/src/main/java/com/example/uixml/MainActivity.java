package com.example.uixml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnok = (Button) findViewById(R.id.btnOK);
        //btnok.setOnClickListener(new Click());
        // anonymous name class
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtanyname = (EditText) findViewById(R.id.edtAnyName);
                String data = edtanyname.getText().toString();
                edtanyname.setText(data.toUpperCase());
            }
        });
    }
        // name of class
//    private class Click implements View.OnClickListener{
//
//        @Override
//        public void onClick(View view) {
//
//        }
//    }
}

