package com.example.diabeticspredictor;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diabeticspredictor.Adapter.FoodAdapter;
import com.example.diabeticspredictor.Model.Food;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class FoodActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference myRef;
    private RecyclerView foodRv;
    private FoodAdapter foodAdapter;
    private List<Food> foods = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        database = FirebaseDatabase.getInstance();

        foodRv = findViewById(R.id.foodRv);
        foodAdapter = new FoodAdapter(foods);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        foodRv.setLayoutManager(mLayoutManager);
        foodRv.setItemAnimator(new DefaultItemAnimator());
        foodRv.setAdapter(foodAdapter);
        getFoodFromDb();
    }

    private void getFoodFromDb() {
        myRef = database.getReference("Food");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                foods.clear();
                for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                    Food food = new Food();
                    food.setFoodName(snapshot1.child("name").getValue().toString());
                    food.setFoodInfo(snapshot1.child("info").getValue().toString());
                    foods.add(food);
                }
                foodAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }


}