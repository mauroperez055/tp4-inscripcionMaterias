
package Clases;

import java.util.HashSet;
import java.util.Objects;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materiasInscripto = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMateriasInscripto() {
        return materiasInscripto;
    }
    
    public void agregarMateria(Materia m) {
        materiasInscripto.add(m);
    }
    
    public int cantidadMaterias() {
        System.out.print("Cantidad de materias de " + apellido + ": ");
        return materiasInscripto.size();
    }
    
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Alumno otro = (Alumno) obj;

        return legajo == otro.legajo
                && Objects.equals(apellido, otro.apellido)
                && Objects.equals(nombre, otro.nombre);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(legajo, apellido, nombre);
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materiasInscripto=" + materiasInscripto + '}';
    }
    
}
