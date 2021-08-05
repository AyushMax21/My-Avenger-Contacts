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

   int[] randomAges;
   String[] names, phones, addresses;

   public ListItemAdapter(int[] randomAgeList, String[] names, String[] phones, String[] addresses) {
      randomAges = randomAgeList;
   }

   @Override
   public ListItemViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

      LayoutInflater listItemLayout = LayoutInflater.from(parent.getContext());

      View v = listItemLayout.inflate(R.layout.list_item, parent, false);

      ListItemViewHolder currentViewHolder = new ListItemViewHolder(v);

      return currentViewHolder;
   }

   @Override
   public void onBindViewHolder(@NonNull @NotNull ListItemViewHolder holder, int position) {

      int currentAge = randomAges[position];

      holder.bind(currentAge);
   }

   @Override
   public int getItemCount() {
      return randomAges.length;
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

      public void bind(int age) {
         tvAge.setText(String.valueOf(age));
      }

   }


}
