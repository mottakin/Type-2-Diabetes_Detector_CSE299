package com.example.diabeticspredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PredictorActivity extends AppCompatActivity {
    private Button saveDataButton;
    private EditText ageEditText, bmiEditText,glucoseEditText,bpEditText,skinEditText,insulinEditText,diabetesPeDegreeEditText,pregnantEditText;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predictor);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        saveDataButton = findViewById(R.id.saveDataButtonId);
        ageEditText = findViewById(R.id.ageEditTextId);
        bmiEditText = findViewById(R.id.bmiEditTextId);
        glucoseEditText=findViewById(R.id.glucoseEditTextId);
        bpEditText=findViewById(R.id.bpEditTextId);
        skinEditText=findViewById(R.id.skinEditTextId);
        insulinEditText=findViewById(R.id.insulinEditTextId);
        diabetesPeDegreeEditText=findViewById(R.id.diabetesPeDegreeEditTextId);
        pregnantEditText=findViewById(R.id.pregnantEditTextId);
        saveDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }
    public void saveData()
    {
        String age = ageEditText.getText().toString().trim();
        String bmi = bmiEditText.getText().toString().trim();
        String glucose = glucoseEditText.getText().toString().trim();
        String bp = bpEditText.getText().toString().trim();
        String skin = skinEditText.getText().toString().trim();
        String insulin = insulinEditText.getText().toString().trim();
        String diabetes = diabetesPeDegreeEditText.getText().toString().trim();
        String pregnant = pregnantEditText.getText().toString().trim();
        String key = databaseReference.push().getKey();
        People people = new People(age,bmi,glucose,bp,skin,insulin,diabetes,pregnant);
        databaseReference.child("User").child(key).setValue(people);
        Toast.makeText(getApplicationContext(),"Data Saved Successfully",Toast.LENGTH_LONG).show();
    }
}