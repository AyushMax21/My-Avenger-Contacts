# My-Avenger-Contacts
App showing the use of recycler view

### Steps: 
- Add **recyclerview** to the layout file.
- Create a new layout resource file (**custom_list_item_layout**) for the list item in recyclerview.
- Create new "**CustomAdapter**" class and extend it from **RecyclerView.Adapter<>**
- Create an inner class "**CustomViewHolder**" inside **CustomAdapter** class and extend it from **RecyclerView.ViewHolder** and create a **constructor** taking a **View** as a parameter and calling super constructor as in **super(itemView)**.
- Pass the **CustomViewHolder** class inside the **<>** as in **RecyclerView.Adapter<CustomAdapter.CustomViewHolder>**.
- **Implement methods:**
  * **onCreateViewHolder**(parent, viewType) {</br>
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item_layout, parent, false);
      **return new CustomViewHolder(view)**; </br>
      }
  * **onBindViewHolder**() {}
  * **getItemCount**() { return **number_of_item_to_be_show**; }
- Inside the activity:</br>
  RecyclerView recyclerView = findViewById(R.id.recyclerView);</br>
  LinearLayoutManager recyclerViewLayoutManager = new LinearLayoutManger(this);</br>
  CustomAdapter myAdapter = new CustomAdapter():</br>
  recyclerView.setLayoutManager(recyclerViewLayoutManager);</br>
  recyelerView.setAdapter(myAdapter);</br>
