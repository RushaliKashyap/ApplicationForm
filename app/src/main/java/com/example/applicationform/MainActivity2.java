package com.example.applicationform;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText name,Father,email,address,date;
    RadioGroup radio;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.Name);
        Father = findViewById(R.id.Father);
        email = findViewById(R.id.email);
        date = findViewById(R.id.date);
        address = findViewById(R.id.Address);
        radio = findViewById(R.id.Radio);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String FatherName = Father.getText().toString();
                String Email = email.getText().toString();
                String Address = address.getText().toString();
                String Date = date.getText().toString();
                if (userName.equals("") || FatherName.equals("") || Email.equals("") || Address.equals("") || Date.equals("")) {
                    Toast.makeText(MainActivity2.this, "Please enter all the details", Toast.LENGTH_LONG).show();

                } else {


                    Toast.makeText(MainActivity2.this, "You Successfully submit", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}