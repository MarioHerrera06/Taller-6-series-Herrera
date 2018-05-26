package com.example.marioherrera.seriesherrera;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private Transition transition;
    public static final long DURACION = 2000;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Fade fadeIn = new Fade(Fade.IN);
        fadeIn.setDuration(DURACION);
        fadeIn.setInterpolator(new DecelerateInterpolator());

        getWindow().setAllowReturnTransitionOverlap(false);
        getWindow().setReenterTransition(fadeIn);

        Animation fromBottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        Animation fromTop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        TextView texto1 = (TextView)findViewById(R.id.textoInicio1);
        texto1.setAnimation(fromTop);

        TextView texto2 = (TextView)findViewById(R.id.textoInicio2);
        texto2.setAnimation(fromBottom);

        transition= new Explode();
        transition.setDuration(DURACION);
        transition.setInterpolator(new DecelerateInterpolator());
        getWindow().setExitTransition(transition);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent intent = new Intent(Splash.this,MainActivity.class);
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(Splash.this).toBundle());
            }
        },4000);


    }
}
