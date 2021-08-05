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

      int[] randomAges = generateRandomAges(100);
      String[] names = {}, phones = {}, addresses = {}, incomes;

      ListItemAdapter myAdapter = new ListItemAdapter(randomAges, names, phones, addresses, incomes, );

      recyclerView.setAdapter(myAdapter);

   }

   public int[] generateRandomAges(int ages) {
      int[] ageList = new int[ages];
      for (int i = 0; i < ages; i++) {
         int randomAge = (int) (Math.random() * 100);
         ageList[i] = randomAge;
      }
      return ageList;
   }

}