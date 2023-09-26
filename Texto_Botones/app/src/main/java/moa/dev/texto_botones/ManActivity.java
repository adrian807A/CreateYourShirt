package moa.dev.texto_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ManActivity extends AppCompatActivity {

    TextView IdTxtv_1, IdTxtv_2, IdTxtv_3, textSm;
    Button IdBtn_01, IdBtn_012, IdBtn_2, IdBtn_3, IdBtn_4, IdBtn_5, IdBtn_6, IdBtn_7, IdBtn_8, IdBtn_9, IdBtn_10, IdBtn_11, IdBtn_14, IdBtn_15, IdBtn_16;
    ImageView imgMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);
    }

    public void Woman(View view) {
        Intent woman = new Intent(this, WomanActivity.class);
        startActivity(woman);

    }
    public void Whiman(View view) {
        Intent whiman = new Intent(this, WhiteManActivity.class);
        startActivity(whiman);

    }
    public void Blkman(View view) {
        Intent blkman = new Intent(this, BlackMan.class);
        startActivity(blkman);

    }
    public void Rdman(View view) {
        Intent rdman = new Intent(this, RedMan.class);
        startActivity(rdman);

    }
    public void Blman(View view) {
        Intent blman = new Intent(this, BlueMan.class);
        startActivity(blman);

    }
    public void Gyman(View view) {
        Intent gyman = new Intent(this, GreyMan.class);
        startActivity(gyman);

    }

}