package com.eggdevs.myavengercontacts.models;

public class Person {

   public int contactImage;
   public int age;
   public int phone;
   public String name;
   public String address;


   public Person(int contactImage, int age, int phone, String name, String address) {
      this.contactImage = contactImage;
      this.age = age;
      this.phone = phone;
      this.name = name;
      this.address = address;
   }
}
