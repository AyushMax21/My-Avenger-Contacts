package com.eggdevs.myavengercontacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   RecyclerView recyclerView;
   ViewGroup parent;
   ArrayList<Person> personList;
   ListItemAdapter myAdapter;
   List<Integer> images;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      recyclerView = findViewById(R.id.recyclerView);
      parent = findViewById(R.id.parent);

      LinearLayoutManager listItemLayoutManager = new LinearLayoutManager(this);
      recyclerView.setLayoutManager(listItemLayoutManager);

      personList = new ArrayList<Person> ();
      setUpRandomImages();

      setUpPersonList();

      myAdapter = new ListItemAdapter(personList, new ListItemAdapter.OnContactItemClick() {

         @Override
         public void onContactClick(int position) {

            Intent contactIntent = new Intent(MainActivity.this, ContactActivity.class);

            Person personClicked = personList.get(position);

            contactIntent.putExtra("username", personClicked.name);
            contactIntent.putExtra("userimage", personClicked.contactImage);
            contactIntent.putExtra("userage", personClicked.age);
            contactIntent.putExtra("useraddress", personClicked.address);

            startActivity(contactIntent);

//            showAddContactDialogForEdit(position);
         }
      });

      recyclerView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

         }
      });

      recyclerView.setAdapter(myAdapter);

   }

   private void setUpPersonList() {
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(getRandomImage(), 80, 524554, "Carol Danvers", "London"));
      personList.add(new Person(getRandomImage(), 24, 84377, "Tony Stark", "America"));
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rogers", "America"));
      personList.add(new Person(getRandomImage(), 45, 84378347, "Steve Rdsdsdsogers", "America"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bdfdfr", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Brucsdsdsde Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce asas", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Bansdssdner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce sds", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));
      personList.add(new Person(getRandomImage(), 52, 8717871, "Bruce Banner", "India"));

   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main_menu, menu);
      return super.onCreateOptionsMenu(menu);
   }

   @Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      if (item.getItemId() == R.id.action_add) {
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

            Person newPerson = new Person(getRandomImage(),
                    Integer.parseInt(age),
                    Integer.parseInt(phone),
                    name, address);

            personList.add(newPerson);

            myAdapter.notifyDataSetChanged();

            oldVersion.dismiss();
         }
      });

   }

   void setUpRandomImages() {
      images = Arrays.asList(R.drawable.america,
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
   }

   int getRandomImage() {
      Collections.shuffle(images);
      int random = (int)(Math.random() * images.size());
      return images.get(random);
   }

   void setAdapterOnSpinner(Spinner spinner) {
      images = Arrays.asList(R.drawable.america,
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

   void showAddContactDialogForEdit(int position) {

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

      Person personClicked = personList.get(position);

      etAddress.setText(personClicked.address);
      etAge.setText(String.valueOf(personClicked.age));
      etPhone.setText(String.valueOf(personClicked.phone));
      etName.setText(personClicked.name);


      AlertDialog oldVersion = addContactDialog.show();

      btnAdd.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            String name = etName.getText().toString();
            String age = etAge.getText().toString();
            String phone = etPhone.getText().toString();
            String address = etAddress.getText().toString();

            Person newPerson = new Person(personClicked.contactImage,
                    Integer.parseInt(age),
                    Integer.parseInt(phone),
                    name, address);

            personList.set(position, newPerson);

            myAdapter.notifyDataSetChanged();

            oldVersion.dismiss();
         }
      });

   }
}