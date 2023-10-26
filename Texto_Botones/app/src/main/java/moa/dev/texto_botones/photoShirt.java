package moa.dev.texto_botones;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.dhaval2404.imagepicker.ImagePicker;

public class photoShirt extends AppCompatActivity {
    Button btnCamara, btnOrder, btnph;
    ImageView imgView;
    ImageView imageView1;
    TextView textSize, textDat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_shirt);
        btnCamara = findViewById(R.id.btnCamara);
        btnOrder = findViewById(R.id.btnOrder);
        btnph = findViewById(R.id.btnph);
        imgView = findViewById(R.id.imgView);
        imageView1 = findViewById(R.id.imageView1);
        textSize = findViewById(R.id.textSize);
        textDat = findViewById(R.id.textDat);

        Bundle bundle = getIntent().getExtras();
        if (bundle!= null)
        {
            int res_image = bundle.getInt("my_image");
            imageView1.setImageResource(res_image);

            String dato = getIntent().getStringExtra("dato");
            textSize.setText(dato);//("size" + dato)

            String data = getIntent().getStringExtra("data");
            textDat.setText(data);//("size" + dato)
        }



        textSize = findViewById(R.id.textSize);

        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagePicker.with(photoShirt.this)
                        .crop()	    			//Crop image(Optional), Check Customization for more option
                        .compress(1024)			//Final image size will be less than 1 MB(Optional)
                        .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                        .start();
            }

        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri uri=data.getData();
        imgView.setImageURI(uri);
    }
    //Metodo para el botón anterior
    public void Anterior(View view){
        Intent anterior = new Intent( this, MainActivity.class);
        startActivity(anterior);

    }


}
