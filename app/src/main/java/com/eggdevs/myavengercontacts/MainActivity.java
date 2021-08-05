package com.eggdevs.myavengercontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.eggdevs.myavengercontacts.models.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   RecyclerView recyclerView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      recyclerView = findViewById(R.id.recyclerView);

      LinearLayoutManager listItemLayoutManager = new LinearLayoutManager(this);
      recyclerView.setLayoutManager(listItemLayoutManager);

      ArrayList<Person> personList = new ArrayList<Person> ();

      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.marvel, 80, 524554, "Carol Danvers", "London"));
      personList.add(new Person(R.drawable.iron, 24, 84377, "Tony Stark", "America"));
      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.america, 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(R.drawable.hulk, 52, 8717871, "Bruce Banner", "India"));

      //ctrl + d

      ListItemAdapter myAdapter = new ListItemAdapter(personList);

      recyclerView.setAdapter(myAdapter);

   }

}