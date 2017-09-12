package com.example.hywoman.sep12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void copy ( View v ) {

        EditText aa = (EditText) findViewById(R.id.editText);
        //aa.getText();
        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText( aa.getText());


    }
}
