package com.example.codechallenge2_lectia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> data = getCandys();
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                data
        );

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(myAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = myAdapter.getItem(position);
                Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }







    private List<String> getCandys(){
        List<String> candys = new ArrayList<>();
        candys.add("Donut");
        candys.add("Cupcake");
        candys.add("Ecleir");
        candys.add("KitKat");
        candys.add("Pie");

        return candys;
    }




}



