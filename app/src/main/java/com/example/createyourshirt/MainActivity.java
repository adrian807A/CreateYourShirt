package com.example.createyourshirt;

import android.app.Activity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	//EditText etEleccion;
	TextView IdTxtv_1, IdTxtv_2, IdTxtv_3, etEleccion;
	Button IdBtn_1, IdBtn_12, IdBtn_2, IdBtn_3, IdBtn_4, IdBtn_5, IdBtn_6, IdBtn_7, IdBtn_8, IdBtn_9, IdBtn_10, IdBtn_11, IdBtn_14, IdBtn_15, IdBtn_16;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		IdTxtv_1 = (TextView) findViewById(R.id.IdTxtv_1);
		IdTxtv_2 = (TextView) findViewById(R.id.IdTxtv_2);
		IdTxtv_3 = (TextView) findViewById(R.id.IdTxtv_3);
		etEleccion = (TextView) findViewById(R.id.etEleccion);
		IdBtn_1 = (Button) findViewById(R.id.IdBtn_1);
		IdBtn_12 = (Button) findViewById(R.id.IdBtn_12);
		IdBtn_2 = (Button) findViewById(R.id.IdBtn_2);
		IdBtn_3 = (Button) findViewById(R.id.IdBtn_3);
		IdBtn_4 = (Button) findViewById(R.id.IdBtn_4);
		IdBtn_5 = (Button) findViewById(R.id.IdBtn_5);
		IdBtn_6 = (Button) findViewById(R.id.IdBtn_6);
		IdBtn_7 = (Button) findViewById(R.id.IdBtn_7);
		IdBtn_8 = (Button) findViewById(R.id.IdBtn_8);
		IdBtn_9 = (Button) findViewById(R.id.IdBtn_9);
		IdBtn_10 = (Button) findViewById(R.id.IdBtn_10);
		IdBtn_11 = (Button) findViewById(R.id.IdBtn_11);
		IdBtn_14 = (Button) findViewById(R.id.IdBtn_14);
		IdBtn_15 = (Button) findViewById(R.id.IdBtn_15);
		IdBtn_16 = (Button) findViewById(R.id.IdBtn_16);
		
		
		IdBtn_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//Toast.makeText(getBaseContext(),"Se a presionado el boton 1", Toast.LENGTH_SHORT).show();
				IdTxtv_1.setText("Woman");
			}
		});
		
		
		IdBtn_12.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				//Toast.makeText(getBaseContext(),"Se a presionado el boton 2", Toast.LENGTH_SHORT).show();
				IdTxtv_1.setText("Rosito");
			}
		});
		
		
		IdBtn_2.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_2.setText("White");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
			}
			
			
			//IdTxtv_1.setText("  ");
			//IdTxtv_2.setText("  ");
			
			
		});
		
		IdBtn_3.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_2.setText("Black");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
			}
			
			//IdTxtv_1.setText("  ");
			
			
		});
		
		IdBtn_4.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_2.setText("Red");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
			}
			
			//IdTxtv_1.setText("  ");
			
			
		});
		
		IdBtn_5.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_2.setText("Blue");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
				
				//IdTxtv_1.setText("  ");
			}
		});
		
		IdBtn_6.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_2.setText("Grey");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
				
				//IdTxtv_1.setText("  ");
			}
		});
		IdBtn_7.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_3.setText("Small");
				etEleccion.setText("S");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				String StrTexto_3 = IdTxtv_3.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();
				
				
				//IdTxtv_1.setText("  ");
			}
		});
		IdBtn_8.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_3.setText("Medium");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				String StrTexto_3 = IdTxtv_3.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();
				
				
			}
		});
		IdBtn_9.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_3.setText("Long");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				String StrTexto_3 = IdTxtv_3.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();
				
				
			}
		});
		
		
		IdBtn_10.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				IdTxtv_3.setText("X.Long");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				String StrTexto_3 = IdTxtv_3.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();
				
			}
		});
		IdBtn_11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				IdTxtv_3.setText("XX.Long");
				
				String StrTexto_1 = IdTxtv_1.getText().toString();
				String StrTexto_2 = IdTxtv_2.getText().toString();
				String StrTexto_3 = IdTxtv_3.getText().toString();
				
				Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();
			}
			
			
		});
		IdBtn_15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				// String StrTexto_1 = IdTxtv_1 .getText().toString();
				//String StrTexto_2 = IdTxtv_2.getText().toString();
				//String StrTexto_3 = IdTxtv_3.getText().toString();
/*

                Intent intent = new Intent(MainActivity.this, PhotoActivity2.class);
                intent.putExtra("remera",etEleccion.getText().toString());
                //intent.putExtra("remera", IdTxtv_2.getText().toString());*/
				
				
				//startActivity(intent);
			}
			
			
		});
		
	}
	
	//public void irPhotoActivity2(View vista){
	//  Intent miPhoto = new Intent(this, PhotoActivity2.class);
	//startActivity(miPhoto);
	//}
}