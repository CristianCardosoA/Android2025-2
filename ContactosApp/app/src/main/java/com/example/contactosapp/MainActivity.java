package com.example.contactosapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ContactAdapter contactAdapter;
    RecyclerView listContacts;

    public static List<Contact> createContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Araiana Grande", "1553853365"));
        contacts.add(new Contact("Kenia Os", "1553853364"));
        contacts.add(new Contact("Trumpas", "1553853361"));

        return contacts;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listContacts = findViewById(R.id.listContacts);
        contactAdapter = new ContactAdapter(MainActivity.createContacts());
        listContacts.setAdapter(contactAdapter);
        listContacts.setLayoutManager(new LinearLayoutManager(this));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}