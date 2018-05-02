package com.example.marioherrera.seriesherrera;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context mContext;




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
    public RecyclerViewAdapter(Context mContext, List<SerieModelo> listaSeries){
        this.listaSeries=listaSeries;
        this.mContext=mContext;
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
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, TemporadaActivity.class);


                intent.putExtra("titulo",listaSeries.get(position).getTitulo());
                intent.putExtra("sinopsis",listaSeries.get(position).getSinopsis());
                intent.putExtra("imgSerie",listaSeries.get(position).getImgSerie());

                mContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return listaSeries.size();
    }
}
