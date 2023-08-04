package moa.dev.texto_botones;

import static moa.dev.texto_botones.R.id.IdTxtv_5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class PhotoActivity2 extends AppCompatActivity {
    TextView  remeraElegida ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //IdTxtv_5 = (TextView) findViewById(R.id.IdTxtv_5);
        setContentView(R.layout.activity_photo2);
        //remeraElegida = (TextView) findViewById(remeraElegida);
        remeraElegida=findViewById(R.id.remeraElegida);

        String recivi=getIntent().getExtras().getString("remera");
        remeraElegida.setText(recivi);


    }
}