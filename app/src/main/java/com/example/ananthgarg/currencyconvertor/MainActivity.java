package com.example.ananthgarg.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Convert(View view)
    {
        EditText val = (EditText) findViewById(R.id.e1);
        Log.i("info","Button Pressed");
        Toast.makeText(this,"Pounds: "+val.getText().toString()+" to "+Double.toString((Double.valueOf(val.getText().toString())*1.1))+" $",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
