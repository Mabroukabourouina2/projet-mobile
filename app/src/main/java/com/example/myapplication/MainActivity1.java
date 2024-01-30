package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.ContactAdapter;
import com.example.myapplication.Domain.Contact;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {
    private RecyclerView.Adapter adapterContact;
    private RecyclerView recyclerViewContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<Contact> itemsArrayList=new ArrayList<>();
        itemsArrayList.add(new Contact("david","user_1"));
        itemsArrayList.add(new Contact("mary","user_2"));
        itemsArrayList.add(new Contact("sara","user_3"));
        itemsArrayList.add(new Contact("jack","user_4"));
        itemsArrayList.add(new Contact("rose","user_5"));
        recyclerViewContact=findViewById(R.id.view1);
        recyclerViewContact.setLayoutManager( new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterContact=new ContactAdapter(itemsArrayList);
        recyclerViewContact.setAdapter(adapterContact);
    }
}