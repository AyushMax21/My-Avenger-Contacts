package com.eggdevs.myavengercontacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.eggdevs.myavengercontacts.models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   RecyclerView recyclerView;
   ViewGroup parent;
   ArrayList<Person> personList;
   ListItemAdapter myAdapter;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      recyclerView = findViewById(R.id.recyclerView);
      parent = findViewById(R.id.parent);

      LinearLayoutManager listItemLayoutManager = new LinearLayoutManager(this);
      recyclerView.setLayoutManager(listItemLayoutManager);

      personList = new ArrayList<Person> ();

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

      myAdapter = new ListItemAdapter(personList);

      recyclerView.setAdapter(myAdapter);

   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main_menu, menu);
      return super.onCreateOptionsMenu(menu);
   }

   //ctrl + o

   @Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      if (item.getItemId() == R.id.action_add) {
         Toast.makeText(this, "" + personList.size(), Toast.LENGTH_SHORT).show();
         showAddContactDialog();
         return true;
      }
      return super.onOptionsItemSelected(item);
   }

   void showAddContactDialog() {
      AlertDialog.Builder addContactDialog = new AlertDialog.Builder(this);

      View dialogView = LayoutInflater.from(this).inflate(R.layout.add_contact_dialog_layout, null);

      addContactDialog.setView(dialogView);

      EditText etName = dialogView.findViewById(R.id.etName);
      EditText etAddress = dialogView.findViewById(R.id.etAddress);
      EditText etAge = dialogView.findViewById(R.id.etAge);
      EditText etPhone = dialogView.findViewById(R.id.etPhone);
      Spinner spinner = dialogView.findViewById(R.id.spinner);
      Button btnAdd = dialogView.findViewById(R.id.btnAdd);

//      String image = spinner.getSelectedItem().toString();

//      setAdapterOnSpinner(spinner);
      AlertDialog oldVersion = addContactDialog.show();
      btnAdd.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            String name = etName.getText().toString();
            String age = etAge.getText().toString();
            String phone = etPhone.getText().toString();
            String address = etAddress.getText().toString();

            Person newPerson = new Person(R.drawable.thanos,
                    Integer.parseInt(age),
                    Integer.parseInt(phone),
                    name, address);

            personList.add(newPerson);

            Toast.makeText(MainActivity.this, "" + personList.size(), Toast.LENGTH_SHORT).show();

            myAdapter.notifyDataSetChanged();

            oldVersion.dismiss();
         }
      });

   }

   void setAdapterOnSpinner(Spinner spinner) {
      List<Integer> images = Arrays.asList(R.drawable.america,
              R.drawable.america1,
              R.drawable.colossus,
              R.drawable.hawkeye,
              R.drawable.hulk,
              R.drawable.iron,
              R.drawable.marvel,
              R.drawable.panther1,
              R.drawable.panther2,
              R.drawable.punisher,
              R.drawable.spiderman,
              R.drawable.thanos,
              R.drawable.thor1,
              R.drawable.thor2,
              R.drawable.venom,
              R.drawable.vision,
              R.drawable.wolverine1,
              R.drawable.wolverine2
              );

      ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_selectable_list_item, images);
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      spinner.setAdapter(adapter);

   }
}