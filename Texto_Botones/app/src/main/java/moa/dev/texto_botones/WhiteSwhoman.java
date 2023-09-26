package moa.dev.texto_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WhiteSwhoman extends AppCompatActivity {
    TextView IdTxtv_1, IdTxtv_2, IdTxtv_3, tsiz, textSi;
    Button IdBtn_01, IdBtn_012, IdBtn_2, IdBtn_3, IdBtn_4, IdBtn_5, IdBtn_6, IdBtn_7, IdBtn_8, IdBtn_9, IdBtn_10, IdBtn_11,
            IdBtn_14, IdBtn_15, IdBtn_16, btnreset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_swhoman);
    }
    public void Reset(View view) {
        Intent reset = new Intent(this, MainActivity.class);
        startActivity(reset);

    }
    public void Med(View view) {
        Intent med = new Intent(this, Photowsw.class);
        startActivity(med);// WhiteMwhoman

    }
    public void Lon(View view) {
        Intent lon = new Intent(this, Photowsw.class);
        startActivity(lon);//WhiteLwhoman

    }
    public void Xlon(View view) {
        Intent xlon = new Intent(this,Photowsw.class);
        startActivity(xlon);//WhiteXLwhoman

    }
    public void Xxlon(View view) {
        Intent xxlon = new Intent(this, Photowsw.class);
        startActivity(xxlon);//WhiteXXLwhoman

    }
    public void irPhotoWSwh(View vista){
      Intent phowsw = new Intent(this,Photowsw.class);
      startActivity(phowsw);
    }

}