package com.example.flags20;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener{
    Spinner spinner;
    TextView tv;

    country[] s2 = new country[4];




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        spinner =  findViewById(R.id.spinner);

        //countreis.setOnItemSelectedListener(this);
        s2[0] = new country(R.drawable.israel, "Israel", "Jerusalem", 12000000);
        s2[1] = new country(R.drawable.usa, "USA", "Washington D.C.", 331000000);
        s2[2] = new country(R.drawable.france, "France", "Paris", 67000000);
        s2[3] = new country(R.drawable.britian, "london", "Berlin", 83000000);

        countreis.setOnItemSelectedListener(this);

        CustomAdapter customAdapter = new CustomAdapter(this, s2);
        countreis.setAdapter(customAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long rowid)
    {
        tV.setText("countryname: "+s2[pos].getCountryname() +"\n"+"capital: "+ s2[pos].getCapital() +"\n"+ "poplationsize: "+s2[pos].populationsize);
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.i("1", "Nothing selected");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}