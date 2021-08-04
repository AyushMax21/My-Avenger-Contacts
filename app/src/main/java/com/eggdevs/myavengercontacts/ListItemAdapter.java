package com.eggdevs.myavengercontacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ListItemViewHolder> {

   @NonNull
   @NotNull
   @Override
   public ListItemViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
      return new ListItemViewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull @NotNull ListItemAdapter.ListItemViewHolder holder, int position) {
      //we'll do this later.
   }

   @Override
   public int getItemCount() {
      return 100;
   }

   class ListItemViewHolder extends RecyclerView.ViewHolder {

      TextView tvName, tvAge, tvPhone, tvAddress;
      ImageView ivAvenger;

      public ListItemViewHolder(View itemView) {
         super(itemView);
         tvName = itemView.findViewById(R.id.tvName);
         tvAge = itemView.findViewById(R.id.tvAge);
         tvPhone = itemView.findViewById(R.id.tvPhone);
         tvAddress = itemView.findViewById(R.id.tvAddress);
         ivAvenger = itemView.findViewById(R.id.ivAvenger);
      }

   }


}
