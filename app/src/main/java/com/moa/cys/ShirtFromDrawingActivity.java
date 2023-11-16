package com.moa.cys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;


public class ShirtFromDrawingActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ImageView imageView1,imageView2, button2;
    ImageView imageView, imgView3;
    Button button, btnRed, btnOran, btnYello, btnGreen, btnPink, btnBor, btnImgPaint, btnBrowse;
    private Paint drawPaint, canvasPaint;
    private Spinner spinnerStroke;
    //private StrokeAdapter adapter;

    private float floatStartX = -1, floatStartY = -1,
            floatEndX = -1, floatEndY = -1;

    private Bitmap bitmap;
    private Canvas canvas;
    private Paint paint = new Paint();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shirt_from_drawing_activity);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        btnRed = findViewById(R.id.btnRed);
        btnPink = findViewById(R.id.btnPink);
        btnOran = findViewById(R.id.btnOran);
        btnYello = findViewById(R.id.btnYello);
        btnGreen = findViewById(R.id.btnGreen);
        btnBor = findViewById(R.id.btnBrw);
        btnImgPaint = findViewById(R.id.btnImgPaint);
        btnBrowse = findViewById(R.id.btnBrowse);



        imageView2 = findViewById(R.id.imageView2);

        // del paint
        // imgView3 = findViewById(R.id.imageView);



        //Bundle c = getIntent().getBundleExtra("bundle");
        // byte[] bytearry = c.getByteArray("photo");

        //Bitmap bmp = BitmapFactory.decodeByteArray(bytearry, 0,bytearry.length);
        // imgView3.setImageBitmap(bmp);



        spinnerStroke = findViewById(R.id.spinnerStroke);
        // StrokeAdapter adapter1 = new StrokeAdapter();
        // spinnerStroke.setAdapter(adapter1);
        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, 1);
            }
        });
        btnImgPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bitmap bitmap1 = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap1.compress(Bitmap.CompressFormat.PNG,100,stream);
                byte[] bytearray = stream.toByteArray();




                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                Bundle bundle = new Bundle();
                bundle.putByteArray("photo",bytearray);
                intent.putExtra("bundle",bundle);
                startActivity(intent);
                finish();





                // String ImageName = getText().toString();
                //Intent i = new Intent(MainActivity.this, paintShirt.class);
                // i.putExtra("ImageName", ImageName);
                // i.putExtra("ImagePath", bitmap);
                //startActivity(i);

            }




        });


        spinnerStroke.setOnItemSelectedListener(this);

        String[] strokeList = getResources().getStringArray(R.array.stroke_sizes);
        //adapter = new StrokeAdapter(this, Data.getStrokeList());
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, strokeList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStroke.setAdapter(adapter);


        ActivityCompat.requestPermissions(this
                , new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);

        imageView = findViewById(R.id.imageView);
    }

    public void redColor(View view) {
        paint.setColor(Color.RED);
    }

    public void pinkColor(View view) {
        paint.setColor(Color.rgb(255, 192, 203));
    }

    public void oranColor(View view) {
        paint.setColor(Color.rgb(255, 165, 0));
    }

    public void yelloColor(View view) {
        paint.setColor(Color.YELLOW);
    }

    public void grnColor(View view) {
        paint.setColor(Color.GREEN);
    }

    public void blackColor(View view) {
        paint.setColor(Color.rgb(0, 0, 0));
    }
    public void greenColor(View view) {
        paint.setColor(Color.rgb(56, 142, 60));
    }
    public void skyColor(View view) {
        paint.setColor(Color.rgb(135, 206, 235));
    }
    public void blueColor(View view) {
        paint.setColor(Color.BLUE);
    }
    public void violetColor(View view) {
        paint.setColor(Color.rgb(98, 0, 234));
    }
    public void purpleColor(View view) {
        paint.setColor(Color.rgb(160, 32, 240));
    }
    public void lilacColor(View view) {
        paint.setColor(Color.rgb(200, 162, 200));
    }
    public void ocherColor(View view) {
        paint.setColor(Color.rgb(101, 120, 23));
    }
    public void abanoColor(View view) {
        paint.setColor(Color.rgb(166, 158, 82));
    }
    public void cyanColor(View view) {
        paint.setColor(Color.rgb(0, 191, 165));
    }
    public void graydColor(View view) {
        paint.setColor(Color.rgb(80, 80, 80));
    }
    public void grayColor(View view) {
        paint.setColor(Color.rgb(128, 128, 128));
    }
    public void silverColor(View view) {
        paint.setColor(Color.rgb(192, 192, 192));
    }
    public void whiteColor(View view) {
        paint.setColor(Color.rgb(255, 255, 255));
    }
    public void creamColor(View view) {
        paint.setColor(Color.rgb(248, 248, 187));
    }
    public void brwColor(View view) {
        paint.setColor(Color.rgb(129, 92, 50));
    }







    public void setErase(View view) { paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR)); }
    public void pencil(View view) { paint.setXfermode(null); }

    //stroke size


    //public void fineMarker (View view) { paint.setStrokeWidth(5);}


    private void drawPaintSketchImage() {

        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(imageView.getWidth(),
                    imageView.getHeight(),
                    Bitmap.Config.ARGB_8888);
            canvas = new Canvas(bitmap);
            paint.setColor(Color.BLUE); //(Color.parseColor(String colorString));
            // paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));


            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(4);
        }
        canvas.drawLine(floatStartX,
                floatStartY - 220,
                floatEndX,
                floatEndY - 220,
                paint);
        imageView.setImageBitmap(bitmap);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            floatStartX = event.getX();
            floatStartY = event.getY();
        }

        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            floatEndX = event.getX();
            floatEndY = event.getY();
            drawPaintSketchImage();
            floatStartX = event.getX();
            floatStartY = event.getY();
        }
        if (event.getAction() == MotionEvent.ACTION_UP) {
            floatEndX = event.getX();
            floatEndY = event.getY();
            drawPaintSketchImage();
        }
        return super.onTouchEvent(event);
    }
    public void imgPaint(View view) {
        paint.setColor(Color.rgb(129, 92, 50));
    }
    // mando imageView

    //guardo imageView paint
    public void buttonSaveImage(View view) {
        File fileSaveImage = new File(this.getExternalFilesDir(Environment.DIRECTORY_PICTURES),
                Calendar.getInstance().getTime().toString() + ".jpg");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileSaveImage);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Toast.makeText(this,
                    "File Saved Successfully",
                    Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinnerStroke) {
            String valueFromSpinner = parent.getItemAtPosition(position).toString();
            paint.setStrokeWidth(Float.parseFloat(valueFromSpinner));
            //paint.setXfermode(null);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}