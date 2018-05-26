package com.example.marioherrera.seriesherrera;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context mContext;
    private Activity activity;





    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo, descripcion,sinopsis;
        ImageView imgSerie;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            titulo=(TextView)itemView.findViewById(R.id.textView);
            descripcion=(TextView)itemView.findViewById(R.id.textView2);
            imgSerie = (ImageView)itemView.findViewById(R.id.img_serie);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);

        }
    }

    public List<SerieModelo> listaSeries;
    public RecyclerViewAdapter(Activity activity,Context mContext, List<SerieModelo> listaSeries){
        this.listaSeries=listaSeries;
        this.mContext=mContext;
        this.activity=activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_serie,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.titulo.setText(listaSeries.get(position).getTitulo());
        holder.descripcion.setText(listaSeries.get(position).getDescripcion());
        holder.imgSerie.setImageResource(listaSeries.get(position).getImgSerie());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, TemporadaActivity.class);


                intent.putExtra("titulo",listaSeries.get(position).getTitulo());
                intent.putExtra("sinopsis",listaSeries.get(position).getSinopsis());
                intent.putExtra("imgSerie",listaSeries.get(position).getImgSerie());

                activity.getWindow().setExitTransition(new Explode().setDuration(1000));
                activity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(activity, v,"").toBundle());


            }
        });




    }

    @Override
    public void onViewDetachedFromWindow(ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        viewHolder.itemView.clearAnimation();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onViewAttachedToWindow(ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        animateCircularReveal(viewHolder.itemView);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void animateCircularReveal(View view) {
        int centerX = 0;
        int centerY = 0;
        int startRadius = 0;
        int endRadius = Math.max(view.getWidth(), view.getHeight());
        Animator animation = ViewAnimationUtils.createCircularReveal(view, centerX, centerY, startRadius, endRadius);
        view.setVisibility(View.VISIBLE);
        animation.start();
    }

    @Override
    public int getItemCount() {
        return listaSeries.size();
    }
}
