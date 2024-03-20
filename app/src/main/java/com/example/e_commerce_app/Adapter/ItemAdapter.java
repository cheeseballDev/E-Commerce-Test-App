package com.example.e_commerce_app.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerce_app.Items.Item;
import com.example.e_commerce_app.databinding.ViewholderListBinding;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Viewholder> {
    ArrayList<Item> items;
    Context context;
    ViewholderListBinding binding;
    


    @NonNull
    @Override
    public ItemAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ViewholderListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.Viewholder holder, int position) {
        binding.viewholderProductName.setText(items.get(position).get);
        binding.viewholderImageID.setId();
        binding.viewholderProductCategory.setText();
        binding.viewholderProductPrice.setText();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(ViewholderListBinding binding) {
            super(binding.getRoot());
        }
    }
}
