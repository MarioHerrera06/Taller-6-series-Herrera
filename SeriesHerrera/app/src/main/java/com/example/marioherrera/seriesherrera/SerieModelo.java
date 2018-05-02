package com.example.marioherrera.seriesherrera;

public class SerieModelo {
    private String titulo, descripcion,sinopsis;
    private int imgSerie;

    public SerieModelo() {
    }

    public SerieModelo(String titulo, String descripcion, int imgSerie,String sinopsis) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgSerie = imgSerie;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImgSerie() {
        return imgSerie;
    }

    public void setImgSerie(int imgSerie) {
        this.imgSerie = imgSerie;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
