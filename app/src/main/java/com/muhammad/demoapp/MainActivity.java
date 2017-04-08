package com.muhammad.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickFunction(View view){

        EditText NameField = (EditText) findViewById(R.id.NameInput);
        EditText PassField = (EditText) findViewById(R.id.PassInput);
        Log.i("INFO", PassField.getText().toString() + " " + NameField.getText().toString());

        Toast.makeText(MainActivity.this, NameField.getText().toString(),Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
