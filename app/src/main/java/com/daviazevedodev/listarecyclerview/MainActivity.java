package com.daviazevedodev.listarecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.daviazevedodev.listarecyclerview.model.Emails;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailAdapter = new EmailAdapter(new ArrayList<>(Emails.fakeEmails()));
        RecyclerView rv = findViewById(R.id.reclyclerview_name);
        rv.setAdapter(emailAdapter);
    }
}