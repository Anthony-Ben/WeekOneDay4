package com.example.week1day4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText efirstName,elastName,eAddress,ecity,estate,ezip;
    TextView tvFirstName,tvLastName,tvAddress,tvCity,tvState,tvZip;
    Button   submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        efirstName = findViewById(R.id.eT_first_name);
        elastName = findViewById(R.id.eT_last_name);
        ecity = findViewById(R.id.eT_city);
        eAddress = findViewById(R.id.eT_street_address);
        estate = findViewById(R.id.eT_state);
        ezip = findViewById(R.id.et_zip);

        submitButton = findViewById(R.id.submit_button);

        tvFirstName = findViewById(R.id.label_first_name);
        tvLastName = findViewById(R.id.label_last_name);
        tvAddress = findViewById(R.id.label_street_address);
        tvCity = findViewById(R.id.label_city);
        tvState = findViewById(R.id.label_state);
        tvZip = findViewById(R.id.label_zip);




    }

    public void onClick(View view){
        switch (view.getId()){

            case R.id.submit_button:
                String fName,lName,sAddress,city,state,zip;

                fName = efirstName.getText().toString();
                lName = elastName.getText().toString();
                sAddress = eAddress.getText().toString();
                city = ecity.getText().toString();
                state = estate.getText().toString();
                zip = ezip.getText().toString();


                Person person = new Person();

                person.setFirstName(fName);
                person.setLastName(lName);
                person.setStreetAddress(sAddress);
                person.setCity(city);
                person.setState(state);
                person.setZip(zip);


                tvFirstName.setText(person.getFirstName());
                tvLastName.setText(person.getLastName());
                tvAddress.setText(person.getStreetAddress());
                tvState.setText(person.getState());
                tvCity.setText(person.getCity());
                tvZip.setText(person.getZip());
        }


    }
}
