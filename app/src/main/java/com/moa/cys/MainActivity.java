package com.moa.cys;

import static com.moa.cys.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //EditText etEleccion;
    TextView IdTxtv_1, IdTxtv_2, IdTxtv_3, textDissp, textSize;
    Button IdBtn_01, IdBtn_012, IdBtn_2, IdBtn_3, IdBtn_4, IdBtn_5, IdBtn_6, IdBtn_7, IdBtn_8, IdBtn_9, IdBtn_10, IdBtn_11, IdBtn_14, IdBtn_15, IdBtn_16;
    ImageView img;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.main_activity);

        IdTxtv_1 = (TextView) findViewById(id.IdTxtv_1);
        IdTxtv_2 = (TextView) findViewById(id.IdTxtv_2);
        IdTxtv_3 = (TextView) findViewById(id.IdTxtv_3);
        textDissp = (TextView) findViewById(id.textDissp);
        textSize = (TextView) findViewById(id.textSize);

        IdBtn_01 = (Button) findViewById(id.IdBtn_01);
        IdBtn_012 = (Button) findViewById(id.IdBtn_012);
        IdBtn_2 = (Button) findViewById(id.IdBtn_2);
        IdBtn_3 = (Button) findViewById(id.IdBtn_3);
        IdBtn_4 = (Button) findViewById(id.IdBtn_4);
        IdBtn_5 = (Button) findViewById(id.IdBtn_5);
        IdBtn_6 = (Button) findViewById(id.IdBtn_6);
        IdBtn_7 = (Button) findViewById(id.IdBtn_7);
        IdBtn_8 = (Button) findViewById(id.IdBtn_8);
        IdBtn_9 = (Button) findViewById(id.IdBtn_9);
        IdBtn_10 = (Button) findViewById(id.IdBtn_10);
        IdBtn_11 = (Button) findViewById(id.IdBtn_11);
        IdBtn_14 = (Button) findViewById(id.IdBtn_14);
        IdBtn_15 = (Button) findViewById(id.IdBtn_15);
        IdBtn_16 = (Button) findViewById(id.IdBtn_16);
        img = (ImageView) findViewById(id.img);




        IdBtn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 IdTxtv_1.setText("Woman"); IdTxtv_2.setText("CHOOSE THE COLOR");
                 img.setImageResource(drawable.silwom);
                textDissp.setText("");
                 String StrTexto_1 = IdTxtv_1.getText().toString();
                 Toast.makeText(getBaseContext(),StrTexto_1, Toast.LENGTH_SHORT).show();

                IdBtn_2.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        IdTxtv_2.setText("White");
                        img.setImageResource(drawable.whitwho);
                        textDissp.setText("");
                        textSize.setText("Choose Size Now!");

                        String StrTexto_1 = IdTxtv_1.getText().toString();
                        String StrTexto_2 = IdTxtv_2.getText().toString();

                        Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
                        IdBtn_7.setOnClickListener(new View.OnClickListener() {


                            @Override
                            public void onClick(View view) {

                                IdTxtv_3.setText("Small");
                                textDissp.setText("Size: S");
                                textSize.setText("");
                                IdBtn_15.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(), ShirtFromGalleryActivity.class);
                                        intent.putExtra("my_image", drawable.whitwho);
                                        Intent intent1 = intent.putExtra("dato", "S");
                                        Intent intent2 = intent.putExtra("data", "White color. size:S. Woman shirt");
                                        startActivity(intent);
                                    }
                                });
                                IdBtn_14.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(), ShirtFromDrawingActivity.class);

                                        intent.putExtra("my_image", drawable.whitwho);
                                        Intent intent1 = intent.putExtra("dato", "S");
                                        Intent intent2 = intent.putExtra("data", "White color. size:S. Woman shirt");
                                        startActivity(intent);
                                    }
                                });


                                String StrTexto_1 = IdTxtv_1.getText().toString();
                                String StrTexto_2 = IdTxtv_2.getText().toString();
                                String StrTexto_3 = IdTxtv_3.getText().toString();

                                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();


                                //IdTxtv_1.setText("  ");
                            }


                        });
                    }


                    //IdTxtv_1.setText("  ");
                    //IdTxtv_2.setText("  ");


                });
                IdBtn_3.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        IdTxtv_2.setText("Black");
                        img.setImageResource(drawable.blawho);
                        textDissp.setText("");
                        textSize.setText("Choose Size Now!");
                        IdBtn_7.setOnClickListener(new View.OnClickListener() {


                            @Override
                            public void onClick(View view) {

                                IdTxtv_3.setText("Small");
                                textDissp.setText("Size: S");
                                textSize.setText("");
                                IdBtn_15.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(), ShirtFromGalleryActivity.class);
                                        intent.putExtra("my_image", drawable.blawho);
                                        Intent intent1 = intent.putExtra("dato", "S");
                                        startActivity(intent);
                                    }
                                });


                                String StrTexto_1 = IdTxtv_1.getText().toString();
                                String StrTexto_2 = IdTxtv_2.getText().toString();
                                String StrTexto_3 = IdTxtv_3.getText().toString();

                                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();


                                //IdTxtv_1.setText("  ");
                            }


                        });

                        String StrTexto_1 = IdTxtv_1.getText().toString();
                        String StrTexto_2 = IdTxtv_2.getText().toString();

                        Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
                    }

                    //IdTxtv_1.setText("  ");


                });

            }
        });




        IdBtn_012.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                
                //Toast.makeText(getBaseContext(),"Se a presionado el boton 2", Toast.LENGTH_SHORT).show();
                IdTxtv_1.setText("Man"); IdTxtv_2.setText("CHOOSE THE COLOR");
                img.setImageResource(drawable.silman);
                String StrTexto_1 = IdTxtv_1.getText().toString();
                Toast.makeText(getBaseContext(),StrTexto_1, Toast.LENGTH_SHORT).show();
                textDissp.setText("");

                IdBtn_2.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        IdTxtv_2.setText("White");
                        img.setImageResource(drawable.whitman);
                        textDissp.setText("");
                        textSize.setText("Choose Size Now!");
                        IdBtn_7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                IdTxtv_3.setText("Small");
                                textDissp.setText("Size: S");
                                textSize.setText("");
                                IdBtn_15.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(), ShirtFromGalleryActivity.class);
                                        intent.putExtra("my_image", drawable.whitman);
                                        Intent intent1 = intent.putExtra("dato", "S");
                                        startActivity(intent);
                                    }
                                });


                                String StrTexto_1 = IdTxtv_1.getText().toString();
                                String StrTexto_2 = IdTxtv_2.getText().toString();
                                String StrTexto_3 = IdTxtv_3.getText().toString();

                                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();


                                //IdTxtv_1.setText("  ");
                            }


                        });



                    }



                });
                IdBtn_3.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        IdTxtv_2.setText("Black");
                        textDissp.setText("");
                        textSize.setText("Choose Size Now!");
                        img.setImageResource(drawable.blacman);
                        IdBtn_7.setOnClickListener(new View.OnClickListener() {


                            @Override
                            public void onClick(View view) {

                                IdTxtv_3.setText("Small");
                                textDissp.setText("Size: S");
                                textSize.setText("");
                                IdBtn_15.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(), ShirtFromGalleryActivity.class);
                                        intent.putExtra("my_image", drawable.blacman);
                                        Intent intent1 = intent.putExtra("dato", "S");
                                        startActivity(intent);
                                    }
                                });


                                String StrTexto_1 = IdTxtv_1.getText().toString();
                                String StrTexto_2 = IdTxtv_2.getText().toString();
                                String StrTexto_3 = IdTxtv_3.getText().toString();

                                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();


                                //IdTxtv_1.setText("  ");
                            }


                        });

                        String StrTexto_1 = IdTxtv_1.getText().toString();
                        String StrTexto_2 = IdTxtv_2.getText().toString();

                        Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
                    }

                    //IdTxtv_1.setText("  ");


                });

            }
        });




        IdBtn_4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                IdTxtv_2.setText("Red");

                String StrTexto_1 = IdTxtv_1.getText().toString();
                String StrTexto_2 = IdTxtv_2.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();
            }

            //IdTxtv_1.setText("  ");


        });

        IdBtn_5.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                IdTxtv_2.setText("Blue");

                String StrTexto_1 = IdTxtv_1.getText().toString();
                String StrTexto_2 = IdTxtv_2.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();

                //IdTxtv_1.setText("  ");
            }
        });

        IdBtn_6.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                IdTxtv_2.setText("Grey");

                String StrTexto_1 = IdTxtv_1.getText().toString();
                String StrTexto_2 = IdTxtv_2.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_2 + StrTexto_1, Toast.LENGTH_SHORT).show();

                //IdTxtv_1.setText("  ");
            }
        });

        IdBtn_8.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                IdTxtv_3.setText("Medium");

                String StrTexto_1 = IdTxtv_1.getText().toString();
                String StrTexto_2 = IdTxtv_2.getText().toString();
                String StrTexto_3 = IdTxtv_3.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();


            }
        });
        IdBtn_9.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                IdTxtv_3.setText("Long");

                String StrTexto_1 = IdTxtv_1.getText().toString();
                String StrTexto_2 = IdTxtv_2.getText().toString();
                String StrTexto_3 = IdTxtv_3.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();


            }
        });
        IdBtn_10.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                IdTxtv_3.setText("X.Long");

                String StrTexto_1 = IdTxtv_1.getText().toString();
                String StrTexto_2 = IdTxtv_2.getText().toString();
                String StrTexto_3 = IdTxtv_3.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1, Toast.LENGTH_LONG).show();

            }
        });
        IdBtn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IdTxtv_3.setText("XX.Long");

                String StrTexto_1 = IdTxtv_1.getText().toString();
                String StrTexto_2 = IdTxtv_2.getText().toString();
                String StrTexto_3 = IdTxtv_3.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_3 + StrTexto_2 + StrTexto_1 , Toast.LENGTH_LONG).show();
            }


        });
        IdBtn_15.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

               // String StrTexto_1 = IdTxtv_1 .getText().toString();
                //String StrTexto_2 = IdTxtv_2.getText().toString();
                //String StrTexto_3 = IdTxtv_3.getText().toString();



            }


        });


    }


    //public void irPhotoActivity2(View vista){
      //  Intent miPhoto = new Intent(this, PhotoActivity2.class);
        //startActivity(miPhoto);
    //}
}