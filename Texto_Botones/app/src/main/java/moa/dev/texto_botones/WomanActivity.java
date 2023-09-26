package moa.dev.texto_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WomanActivity extends AppCompatActivity {

    TextView IdTxtv_1, IdTxtv_2, IdTxtv_3;
    Button IdBtn_01, IdBtn_012, IdBtn_2, IdBtn_3, IdBtn_4, IdBtn_5, IdBtn_6, IdBtn_7, IdBtn_8, IdBtn_9, IdBtn_10, IdBtn_11, IdBtn_14, IdBtn_15, IdBtn_16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman);
    }

    public void Man(View view) {
        Intent man = new Intent(this, ManActivity.class);
        startActivity(man);

    }

    public void Wt(View view) {
        Intent wt = new Intent(this, White.class);
        startActivity(wt);

    }
    public void Blk(View view) {
        Intent blk = new Intent(this, Black.class);
        startActivity(blk);

    }
    public void Rd(View view) {
        Intent rd = new Intent(this, Red.class);
        startActivity(rd);

    }
    public void Bl(View view) {
        Intent bl = new Intent(this, Blue.class);
        startActivity(bl);

    }
    public void Gy(View view) {
        Intent gy = new Intent(this, Grey.class);
        startActivity(gy);

    }



}