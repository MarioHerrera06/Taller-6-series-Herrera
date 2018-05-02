package com.example.marioherrera.seriesherrera;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;

public class TemporadaActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvtitulo, tvdescripcion,txtdescripcion;
    private ImageView img;
    private int img2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporada);

        tvtitulo= (TextView)findViewById(R.id.txtSerieTemporada);
        img = (ImageView)findViewById(R.id.imgSerieTemporada);
        txtdescripcion=(TextView)findViewById(R.id.txtDescripcion);

        Intent intent = getIntent();
        String titulo = intent.getExtras().getString("titulo");
        int imagen= intent.getExtras().getInt("imgSerie");
        img2=imagen;
        String descripcion= intent.getExtras().getString("sinopsis");

        tvtitulo.setText(titulo);
        txtdescripcion.setText(descripcion);
        img.setImageResource(imagen);

        Button boton1=(Button)findViewById(R.id.boton1);
        boton1.setOnClickListener(this);
        Button boton2=(Button)findViewById(R.id.boton2);
        boton2.setOnClickListener(this);
        Button boton3=(Button)findViewById(R.id.boton3);
        boton3.setOnClickListener(this);
        Button boton4=(Button)findViewById(R.id.boton4);
        boton4.setOnClickListener(this);
        Button boton5=(Button)findViewById(R.id.boton5);
        boton5.setOnClickListener(this);
        Button boton6=(Button)findViewById(R.id.boton6);
        boton6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, CapituloActivity.class);
        intent.putExtra("imagen", img2);
        this.startActivity(intent);

    }
}
