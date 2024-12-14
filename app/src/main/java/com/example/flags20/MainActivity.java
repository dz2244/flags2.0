package com.example.flags20;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;
    TextView tv;
    country[] s2 = new country[7];
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        spinner =  findViewById(R.id.spinner);

        s2[0] = new country(R.drawable.flag1, "Israel", "Jerusalem", 12000000);
        s2[1] = new country(R.drawable.flag2, "USA", "Washington D.C.", 331000000);
        s2[2] = new country(R.drawable.flag3, "France", "Paris", 67000000);
        s2[3] = new country(R.drawable.flag4, "greece", "atona", 83000000);
        s2[4] = new country(R.drawable.flag5, "england", "london", 3000000);
        s2[5] = new country(R.drawable.italy, "italy", "roma", 4000000);
        s2[6] = new country(R.drawable.flag7, "spain", "real", 3000000);
        spinner.setOnItemSelectedListener(this);

        customAdapter adp = new customAdapter(this, s2);
        spinner.setAdapter(adp);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long rowid)
    {
        tv.setText("countryname: "+s2[pos].getCountryname() +"\n"+"capital city: "+ s2[pos].getCapital() +"\n"+ "poplation: "+s2[pos].populationsize);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.i("1", "Nothing selected");
    }

}