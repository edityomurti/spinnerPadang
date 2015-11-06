package com.example.hanifsugiyanto.spinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner,spinner2,spinner3,spinner4,spinner5;

    ArrayAdapter<CharSequence> adapter;

    EditText editText;
    ImageView imageView;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //initialization
        spinner = (Spinner) findViewById(R.id.spinner1);
        adapter = ArrayAdapter.createFromResource(this,R.array.nama_provinsi,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + "selected", Toast.LENGTH_LONG).show();
                //((TextView) parent.getChildAt(0)).setTextColor(Color.BLUE);
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //Intialization
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        adapter = ArrayAdapter.createFromResource(this,R.array.jabatan,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });

        //Intialization
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        adapter = ArrayAdapter.createFromResource(this,R.array.kabupaten,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });

        //Intialization
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        adapter = ArrayAdapter.createFromResource(this,R.array.kecamatan,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });


        //Intialization
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        adapter = ArrayAdapter.createFromResource(this,R.array.kelurahan,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });



    }
}
