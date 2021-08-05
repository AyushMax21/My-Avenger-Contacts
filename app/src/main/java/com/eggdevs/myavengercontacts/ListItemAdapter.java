package com.eggdevs.myavengercontacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eggdevs.myavengercontacts.models.Person;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ListItemViewHolder> {

   ArrayList<Person> personList;

   public ListItemAdapter(ArrayList<Person> personList) {
      this.personList = personList;
   }

   @Override
   public ListItemViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

// Can also be done in this way.
/*
   View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
return new ListItemViewHolder(view);
*/

      LayoutInflater listItemLayout = LayoutInflater.from(parent.getContext());
      View v = listItemLayout.inflate(R.layout.list_item, parent, false);
      ListItemViewHolder currentViewHolder = new ListItemViewHolder(v);
      return currentViewHolder;
   }

   @Override
   public void onBindViewHolder(@NonNull @NotNull ListItemViewHolder holder, int position) {

      Person currentPerson = personList.get(position);
      holder.bind(currentPerson);
   }

   @Override
   public int getItemCount() {
      return personList.size();
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

      public void bind(Person person) {
         tvAge.setText(String.valueOf(person.age));
         tvName.setText(person.name);
         ivAvenger.setImageResource(person.contactImage);
         tvAddress.setText(person.address);
         tvPhone.setText(String.valueOf(person.phone));
      }

   }


}
