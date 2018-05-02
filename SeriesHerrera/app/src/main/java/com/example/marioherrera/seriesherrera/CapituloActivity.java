package com.example.marioherrera.seriesherrera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CapituloActivity extends AppCompatActivity implements View.OnClickListener{
private TextView texto1,texto2,texto3,texto4,texto5,texto6;
    private ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulo);

        img2 = (ImageView)findViewById(R.id.imagenCapitulo);

        Intent intent = getIntent();

        int imagen= intent.getExtras().getInt("imagen");
        img2.setImageResource(imagen);

        Button boton1=(Button)findViewById(R.id.boton10);
        boton1.setOnClickListener(this);
        Button boton2=(Button)findViewById(R.id.boton20);
        boton2.setOnClickListener(this);
        Button boton3=(Button)findViewById(R.id.boton30);
        boton3.setOnClickListener(this);
        Button boton4=(Button)findViewById(R.id.boton40);
        boton4.setOnClickListener(this);
        Button boton5=(Button)findViewById(R.id.boton50);
        boton5.setOnClickListener(this);
        Button boton6=(Button)findViewById(R.id.boton60);
        boton6.setOnClickListener(this);

        texto1= (TextView)findViewById(R.id.texto1);
        texto2= (TextView)findViewById(R.id.texto2);
        texto3= (TextView)findViewById(R.id.texto3);
        texto4= (TextView)findViewById(R.id.texto4);
        texto5= (TextView)findViewById(R.id.texto5);
        texto6= (TextView)findViewById(R.id.texto6);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.boton10:
                texto1.setText("Esta es la descripcion del capitulo 1");
                break;

            case R.id.boton20:
                texto2.setText("Esta es la descripcion del capitulo 2");
                break;

            case R.id.boton30:
                texto3.setText("Esta es la descripcion del capitulo 3");
                break;

            case R.id.boton40:
                texto4.setText("Esta es la descripcion del capitulo 4");
                break;

            case R.id.boton50:
                texto5.setText("Esta es la descripcion del capitulo 5");
                break;

            case R.id.boton60:
                texto6.setText("Esta es la descripcion del capitulo 6");
                break;

            default:
                break;
        }

    }
}
