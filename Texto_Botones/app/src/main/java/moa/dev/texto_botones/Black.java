package moa.dev.texto_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Black extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black);
    }
    public void Man(View view) {
        Intent man = new Intent(this, ManActivity.class);
        startActivity(man);

    }
    public void Red(View view) {
        Intent red = new Intent(this, Red.class);
        startActivity(red);

    }
    public void White(View view) {
        Intent white = new Intent(this, White.class);
        startActivity(white);

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