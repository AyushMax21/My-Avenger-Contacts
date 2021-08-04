package com.eggdevs.myavengercontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   RecyclerView recyclerView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      recyclerView = findViewById(R.id.recyclerView);

      LinearLayoutManager listItemLayoutManger = new LinearLayoutManager(this);
      recyclerView.setLayoutManager(listItemLayoutManger);

      ListItemAdapter myAdapter = new ListItemAdapter();

      recyclerView.setAdapter(myAdapter);


   }
}