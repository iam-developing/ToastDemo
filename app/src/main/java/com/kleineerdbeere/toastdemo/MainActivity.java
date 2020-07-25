package com.kleineerdbeere.toastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

// Simple git test
// Other test
public class MainActivity extends AppCompatActivity {

    /*
           First Test app in git hub.
     */

    public void clickFunction(View view){
        EditText userName = (EditText) findViewById(R.id.editTextTextPersonName);
        Log.i("Info", "Button pressed");
        Toast.makeText(this, "hello " + userName.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
