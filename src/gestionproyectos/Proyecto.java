package gestionproyectos;
public class Proyecto {
    private String nombre;
    private String descripcion;
    private Tarea[] tareas;

    public Proyecto(String nombre, String descripcion, Tarea[] tareas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tareas = tareas;
    }
}