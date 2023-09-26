package moa.dev.texto_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BlueMan extends AppCompatActivity {
    TextView IdTxtv_1, IdTxtv_2, IdTxtv_3;
    Button IdBtn_01, IdBtn_012, IdBtn_2, IdBtn_3, IdBtn_4, IdBtn_5, IdBtn_6, IdBtn_7, IdBtn_8, IdBtn_9, IdBtn_10, IdBtn_11, IdBtn_14, IdBtn_15, IdBtn_16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_man);
    }
    public void Woman(View view) {
        Intent woman = new Intent(this, WomanActivity.class);
        startActivity(woman);

    }
    public void RedMan(View view) {
        Intent redman = new Intent(this, RedMan.class);
        startActivity(redman);

    }
    public void BlackMan(View view) {
        Intent blackman = new Intent(this, BlackMan.class);
        startActivity(blackman);

    }
    public void WhiteMan(View view) {
        Intent whiteman = new Intent(this, WhiteManActivity.class);
        startActivity(whiteman);

    }
    public void GreyMan(View view) {
        Intent greyman = new Intent(this, GreyMan.class);
        startActivity(greyman);

    }
}