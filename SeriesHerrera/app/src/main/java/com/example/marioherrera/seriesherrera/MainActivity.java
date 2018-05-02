package com.example.marioherrera.seriesherrera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.marioherrera.seriesherrera.R;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewSerie;
    private RecyclerViewAdapter adaptadorSerie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewSerie = (RecyclerView) findViewById(R.id.recyclerSeries);
        recyclerViewSerie.setLayoutManager(new GridLayoutManager(this, 2));

        adaptadorSerie = new RecyclerViewAdapter(this,obtenerSerie());
        recyclerViewSerie.setAdapter(adaptadorSerie);

    }

    public List<SerieModelo> obtenerSerie() {
        List<SerieModelo> serie = new ArrayList<>();
        serie.add(new SerieModelo("La Casa De Papel", "2017", R.drawable.casa_de_papel,"La serie empieza con el atraco a la Fábrica Nacional de Moneda y Timbre. Todo el atraco está planeado por El Profesor (Álvaro Morte) con una ejecución perfecta de los atracadores Tokio (Úrsula Corberó), Nairobi (Alba Flores), Río (Miguel Herrán), Moscú (Paco Tous), Berlín (Pedro Alonso), Denver (Jaime Lorente), Helsinki (Darko Peric) y Oslo (Roberto García)."));
        serie.add(new SerieModelo("American Gods", "2017", R.drawable.american_gods,"La serie se centra en Shadow Moon, quien se encuentra con un hombre extraño llamado Sr. Wednesday después de ser liberado de la prisión, pronto se ve envuelto en un conflicto a gran escala entre los Viejos Dioses y los Nuevos Dioses, que se fortalecen cada día."));
        serie.add(new SerieModelo("The Big Bang Theory", "2009", R.drawable.big_bang,"La serie comienza con la llegada de Penny, aspirante a actriz, al apartamento vecino, que comparten Sheldon y Leonard, dos físicos que trabajan en el Instituto Tecnológico de California (Caltech). Leonard se enamora desde el primer momento de Penny."));
        serie.add(new SerieModelo("The Flash", "2016", R.drawable.flash,"Cuando Barry Allen solo tenía 10 años, su madre fue asesinada en un extraño y terrorífico incidente, en el cual estuvo involucrado un hombre en un traje amarillo y su padre fue falsamente culpado del asesinato"));
        serie.add(new SerieModelo("The Walking Dead", "2010", R.drawable.the_walking_dead,"Tras despertar de un coma en un hospital abandonado, el oficial de policía Rick Grimes (Andrew Lincoln) se da cuenta que el mundo que conocía ya no existe y de que el caos se ha apoderado de la ciudad debido a que inexplicablemente los muertos caminantes dominan las calles."));
        serie.add(new SerieModelo("Stranger Things", "2016", R.drawable.stranger_things,"La historia arranca durante la década de los 80, en Hawkins, Indiana, cuando un niño llamado Will Byers desaparece, hecho que destapa los extraños sucesos que tienen lugar en la zona, producto de una serie de experimentos que realiza el gobierno en un laboratorio científico. Además, en la ciudad aparecen fuerzas sobrenaturales inquietantes y una niña muy extraña"));
        serie.add(new SerieModelo("Juego de tronos", "2008", R.drawable.juego_de_tronos,"Juego de tronos sigue las múltiples líneas argumentales de Canción de hielo y fuego. La mayor parte de la historia tiene lugar en Poniente, un continente ficticio donde las estaciones pueden durar años, y se centra en las violentas luchas dinásticas que surgen entre varias familias nobiliarias por el control del Trono de Hierro."));
        serie.add(new SerieModelo("La Casa De Papel", "2017", R.drawable.casa_de_papel,"La serie empieza con el atraco a la Fábrica Nacional de Moneda y Timbre. Todo el atraco está planeado por El Profesor (Álvaro Morte) con una ejecución perfecta de los atracadores Tokio (Úrsula Corberó), Nairobi (Alba Flores), Río (Miguel Herrán), Moscú (Paco Tous), Berlín (Pedro Alonso), Denver (Jaime Lorente), Helsinki (Darko Peric) y Oslo (Roberto García)."));
        serie.add(new SerieModelo("American Gods", "2017", R.drawable.american_gods,"La serie se centra en Shadow Moon, quien se encuentra con un hombre extraño llamado Sr. Wednesday después de ser liberado de la prisión, pronto se ve envuelto en un conflicto a gran escala entre los Viejos Dioses y los Nuevos Dioses, que se fortalecen cada día."));
        serie.add(new SerieModelo("The Big Bang Theory", "2009", R.drawable.big_bang,"La serie comienza con la llegada de Penny, aspirante a actriz, al apartamento vecino, que comparten Sheldon y Leonard, dos físicos que trabajan en el Instituto Tecnológico de California (Caltech). Leonard se enamora desde el primer momento de Penny."));
        serie.add(new SerieModelo("The Flash", "2016", R.drawable.flash,"Cuando Barry Allen solo tenía 10 años, su madre fue asesinada en un extraño y terrorífico incidente, en el cual estuvo involucrado un hombre en un traje amarillo y su padre fue falsamente culpado del asesinato"));
        serie.add(new SerieModelo("The Walking Dead", "2010", R.drawable.the_walking_dead,"Tras despertar de un coma en un hospital abandonado, el oficial de policía Rick Grimes (Andrew Lincoln) se da cuenta que el mundo que conocía ya no existe y de que el caos se ha apoderado de la ciudad debido a que inexplicablemente los muertos caminantes dominan las calles."));
        serie.add(new SerieModelo("Stranger Things", "2016", R.drawable.stranger_things,"La historia arranca durante la década de los 80, en Hawkins, Indiana, cuando un niño llamado Will Byers desaparece, hecho que destapa los extraños sucesos que tienen lugar en la zona, producto de una serie de experimentos que realiza el gobierno en un laboratorio científico. Además, en la ciudad aparecen fuerzas sobrenaturales inquietantes y una niña muy extraña"));
        serie.add(new SerieModelo("Juego de tronos", "2008", R.drawable.juego_de_tronos,"Juego de tronos sigue las múltiples líneas argumentales de Canción de hielo y fuego. La mayor parte de la historia tiene lugar en Poniente, un continente ficticio donde las estaciones pueden durar años, y se centra en las violentas luchas dinásticas que surgen entre varias familias nobiliarias por el control del Trono de Hierro."));


        return serie;

    }


}
