package com.moa.cys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    Button btnOrder, btnph;
    ImageView imageView1, imageView;
    //ImageView imageView1;
    TextView  textSize, textDat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);
        //imgView = findViewById(R.id.imgView1);
        imageView1 = findViewById(R.id.imageView1);
        imageView = findViewById(R.id.imgView1);
        //textView = findViewById(R.id.textView);
        textSize = findViewById(R.id.textSize);
        textDat = findViewById(R.id.textDat);
        btnph = findViewById(R.id.btnph);

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


        Bundle b = getIntent().getBundleExtra("bundle");
        //encadeno imagen

        //fin
        byte[] bytearry = b.getByteArray("photo");

        Bitmap bmp = BitmapFactory.decodeByteArray(bytearry, 0,bytearry.length);
        imageView.setImageBitmap(bmp);



        // intent.putExtra("my_image", drawable.whitwho);





        // Bundle extras = getIntent().getExtras();
        // int res_image = bundle.getInt("my_image");
        // imageView1.setImageResource(res_image);
        // String bitmap=extras.getString("ImagePath");
        // String ImageName= extras.getString("ImageName");



    }
    //Metodo botón anterior
    public void Anterior(View view){
        Intent anterior = new Intent( this, MainActivity.class);
        startActivity(anterior);

    }

}