package com.example.diabeticspredictor.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diabeticspredictor.Model.Food;
import com.example.diabeticspredictor.R;

import org.w3c.dom.Text;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {
    private List<Food> foodList;

    public FoodAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_single, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.MyViewHolder holder, int position) {

        Food food = foodList.get(position);
        holder.foodName.setText(food.getFoodName());
        holder.foodInfo.setText(food.getFoodInfo());

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView foodName, foodInfo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.foodNameTv);
            foodInfo = itemView.findViewById(R.id.foodInfoTv);
        }
    }
}
