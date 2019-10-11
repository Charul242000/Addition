package com.example.hp.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);


    }

    public void onAdd(View view) {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        int a = Integer.parseInt(value1);
        int b = Integer.parseInt(value2);
        int sum = a + b;
        Toast.makeText(getApplicationContext(), String.valueOf(sum),Toast.LENGTH_LONG).show();
    }




}
