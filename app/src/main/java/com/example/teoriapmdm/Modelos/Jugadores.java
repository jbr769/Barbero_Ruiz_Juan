package com.example.teoriapmdm.Modelos;
public class Jugadores {
    private String nombre;
    private String descripcion;
    private int imageId;
    public Jugadores(String nombre, String descripcion, int imagenId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imageId = imagenId;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public int getImageId() {return imageId;}
    public void setImageId(int imageId) {this.imageId = imageId;}
}
