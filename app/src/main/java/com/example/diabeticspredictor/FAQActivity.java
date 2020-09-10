package com.example.diabeticspredictor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class FAQActivity extends AppCompatActivity {
    private static final String TAG = "FAQActivity";
    private static final String KEY_TITLE = "title";

    private EditText editTextTitle;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_q);

        editTextTitle = findViewById(R.id.edit_text_title);

    }

    public void saveNote(View v){
        String title = editTextTitle.getText().toString();

        Map<String,Object> note = new HashMap<>();
        note.put(KEY_TITLE, title);
        db.collection("FAQ").document("Faq ").set(note)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(FAQActivity.this, "Note saved", Toast.LENGTH_SHORT).show();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(FAQActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, e.toString());

                    }
                });



    }
}