package com.example.teoriapmdm.Modelos;
public class Jugadores {
    private String nombre;
    private String descripcion;
    private int imageId;
    public Jugadores(int imageId, String descripcion, String nombre) {
        this.imageId = imageId;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public int getImageId() {return imageId;}
    public void setImageId(int imageId) {this.imageId = imageId;}
}
