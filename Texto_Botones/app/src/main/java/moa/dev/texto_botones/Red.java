package moa.dev.texto_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Red extends AppCompatActivity {
    TextView IdTxtv_1, IdTxtv_2, IdTxtv_3;
    Button IdBtn_01, IdBtn_012, IdBtn_2, IdBtn_3, IdBtn_4, IdBtn_5, IdBtn_6, IdBtn_7, IdBtn_8, IdBtn_9, IdBtn_10, IdBtn_11, IdBtn_14, IdBtn_15, IdBtn_16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
    }
    public void Man(View view) {
        Intent man = new Intent(this, ManActivity.class);
        startActivity(man);

    }
    public void White(View view) {
        Intent white = new Intent(this, White.class);
        startActivity(white);

    }
    public void Black(View view) {
        Intent black = new Intent(this, Black.class);
        startActivity(black);

    }
    public void Blue(View view) {
        Intent blue = new Intent(this, Blue.class);
        startActivity(blue);

    }
    public void Grey(View view) {
        Intent grey = new Intent(this, Grey.class);
        startActivity(grey);

    }


}