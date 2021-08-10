package com.eggdevs.myavengercontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

   ImageView ivContactImage;
   TextView tvAge, tvName, tvAddress;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_contact);

      ivContactImage = findViewById(R.id.ivContactImage);
      tvAddress = findViewById(R.id.tvAddress);
      tvName = findViewById(R.id.tvName);
      tvAge = findViewById(R.id.tvAge);

      String name = getIntent().getStringExtra("username");
      String age =  String.valueOf(getIntent().getIntExtra("userage", 0));
      String address = getIntent().getStringExtra("useraddress");
      int image = getIntent().getIntExtra("userimage", 0);

      tvName.setText(name);
      tvAge.setText(age);
      tvAddress.setText(address);
      ivContactImage.setImageResource(image);
   }
}