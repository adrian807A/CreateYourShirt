package moa.dev.texto_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Photowsw extends AppCompatActivity {
    Button btnCamara, btnOrder;
    ImageView imgView;
    ImageView imageView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photowsw);
        btnCamara = findViewById(R.id.btnCamara);
        imgView = findViewById(R.id.imgView);
        imageView1 = findViewById(R.id.imageView1);

        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCamara();

            }
        });
    }
    private void abrirCamara(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent, 1);

        }
    }
    //Result6ado de esta actividad plasmo photo

    protected void  onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imgBitmap = (Bitmap) extras.get("data");
            imgView.setImageBitmap(imgBitmap);
        }
    }

    //Metodo para el botón anterior
    public void Anterior(View view){
        Intent anterior = new Intent( this, WhiteSwhoman.class);
        startActivity(anterior);

    }


}