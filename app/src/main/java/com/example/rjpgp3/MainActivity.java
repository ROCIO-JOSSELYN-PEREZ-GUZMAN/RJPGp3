package com.example.rjpgp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datos=findViewById(R.id.Datos);

        String[] arreglo= new String[]{"num-1","num-2","num-3","num-4"
                ,"num-5","num-6","num-7","num-8","num-9","num-10","num-11","num-12"
                ,"num-13","num-14","num-15","num-16","num-17","num-18","num-19","num-20"};
        ArrayAdapter adaptador= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
        datos.setAdapter(adaptador);
    }
}
