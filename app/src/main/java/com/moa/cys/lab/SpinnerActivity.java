package com.moa.cys.lab;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moa.cys.R;

public class SpinnerActivity extends AppCompatActivity implements     AdapterView.OnItemSelectedListener {
    
    String[] gender = { "Woman", "Man"};
    String[] color = { "White", "Black", "Red", "Blue", "Gray"};
    String[] size = { "Small", "Medium", "Large", "Extra Large", "XXLarge"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_activity);
        
        /* spnGender */
        Spinner spnGender = findViewById(R.id.spnGender);
        spnGender.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapterGender = new ArrayAdapter(this,android.R.layout.simple_spinner_item, gender);
        arrayAdapterGender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnGender.setAdapter(arrayAdapterGender);
    
        /* spnColor */
        Spinner spnColor = findViewById(R.id.spnColor);
        spnColor.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapterColor = new ArrayAdapter(this,android.R.layout.simple_spinner_item, color);
        arrayAdapterGender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnColor.setAdapter(arrayAdapterColor);
    
        /* spnSize */
        Spinner spnSize = findViewById(R.id.spnSize);
        spnSize.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapterSize = new ArrayAdapter(this,android.R.layout.simple_spinner_item, size);
        arrayAdapterGender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnSize.setAdapter(arrayAdapterSize);
        
    }
    
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    
        Log.d("Item %s", String.valueOf(id));
        switch (String.valueOf(id)){
            
            case "1":
                Toast.makeText(getApplicationContext(), "Gender: " + gender[position] , Toast.LENGTH_LONG).show();
                break;
                
            case "2":
                Toast.makeText(getApplicationContext(), "Color: " + color[position] , Toast.LENGTH_LONG).show();
                break;
                
            case "3":
                Toast.makeText(getApplicationContext(), "Size: " + size[position] , Toast.LENGTH_LONG).show();
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub  
    }
}  