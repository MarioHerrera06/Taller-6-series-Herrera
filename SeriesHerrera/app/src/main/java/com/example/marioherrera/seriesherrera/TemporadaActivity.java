package com.example.marioherrera.seriesherrera;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
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


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporada);


        Animation fromleft = AnimationUtils.loadAnimation(this,R.anim.fromleft);
        Animation fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);


        Slide slideTop = new Slide(Gravity.LEFT);
        slideTop.setDuration(1000);
        slideTop.setInterpolator(new DecelerateInterpolator());

        getWindow().setEnterTransition(slideTop);

        tvtitulo= (TextView)findViewById(R.id.txtSerieTemporada);
        tvtitulo.setAnimation(fromtop);
        img = (ImageView)findViewById(R.id.imgSerieTemporada);
        img.setAnimation(fromtop);
        txtdescripcion=(TextView)findViewById(R.id.txtDescripcion);
        txtdescripcion.setAnimation(fromleft);

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
        boton1.setAnimation(fromleft);
        Button boton2=(Button)findViewById(R.id.boton2);
        boton2.setOnClickListener(this);
        boton2.setAnimation(fromleft);
        Button boton3=(Button)findViewById(R.id.boton3);
        boton3.setOnClickListener(this);
        boton3.setAnimation(fromleft);
        Button boton4=(Button)findViewById(R.id.boton4);
        boton4.setOnClickListener(this);
        boton4.setAnimation(fromleft);
        Button boton5=(Button)findViewById(R.id.boton5);
        boton5.setOnClickListener(this);
        boton5.setAnimation(fromleft);
        Button boton6=(Button)findViewById(R.id.boton6);
        boton6.setOnClickListener(this);
        boton6.setAnimation(fromleft);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, CapituloActivity.class);
        intent.putExtra("imagen", img2);
        this.getWindow().setExitTransition(new Explode().setDuration(1000));
        this.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());

    }
}
