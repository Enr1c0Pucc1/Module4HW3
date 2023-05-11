package com.example.module4hw3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FishAdapter extends RecyclerView.Adapter<FishAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Fish> fishes;

    public FishAdapter(Context context, List<Fish> fishes){
        this.inflater = LayoutInflater.from(context);
        this.fishes = fishes;
    }

    @Override
    public FishAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fish fish = fishes.get(position);
        holder.animalView.setImageResource(fish.getFishResource());
        holder.nameView.setText(fish.getFishName());
        holder.animalDescriptionView.setText(fish.getFishDescription());
        holder.populationSizeView.setText(fish.getPopulationSize());
    }

    @Override
    public int getItemCount() {
        return fishes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView animalView;
        final TextView nameView, animalDescriptionView, populationSizeView;

        ViewHolder(View view){
            super(view);
            animalView = view.findViewById(R.id.animalResource);
            nameView = view.findViewById(R.id.name);
            animalDescriptionView = view.findViewById(R.id.animalDescription);
            populationSizeView = view.findViewById(R.id.populationSize);
        }
    }
}
