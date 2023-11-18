package com.moa.cys.lab;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moa.cys.R;
import com.moa.cys.model.CysCodes;

public class RecyclerActivity extends AppCompatActivity implements RecyclerAdapter.ItemClickListener {
	
	RecyclerAdapter recyclerAdapterColors;
	RecyclerAdapter recyclerAdapterSizes;
	RecyclerAdapter recyclerAdapterGenders;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recycler_activity);
		
		RecyclerView recyclerViewColors = findViewById(R.id.recColors);
		recyclerViewColors.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
		recyclerAdapterColors = new RecyclerAdapter(this, CysCodes.get().getColors());
		recyclerAdapterColors.setClickListener(this);
		recyclerViewColors.setAdapter(recyclerAdapterColors);
		
		RecyclerView recyclerViewSizes = findViewById(R.id.recSizes);
		recyclerViewSizes.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
		recyclerAdapterSizes = new RecyclerAdapter(this, CysCodes.get().getSizes());
		recyclerAdapterSizes.setClickListener(this);
		recyclerViewSizes.setAdapter(recyclerAdapterSizes);
		
		RecyclerView recyclerViewGenders = findViewById(R.id.recGenders);
		recyclerViewGenders.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
		recyclerAdapterGenders = new RecyclerAdapter(this, CysCodes.get().getGenders());
		recyclerAdapterGenders.setClickListener(this);
		recyclerViewGenders.setAdapter(recyclerAdapterGenders);
	}
	
	@Override
	public void onItemClick(View view, int position) {
		Toast.makeText(this, "You clicked " + recyclerAdapterGenders.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
	}
}