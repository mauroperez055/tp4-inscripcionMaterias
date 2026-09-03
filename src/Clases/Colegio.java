package Clases;

public class Colegio {

    public static void main(String[] args) {
        Materia web2 = new Materia(1, "Web 2", 2);
        Materia mate = new Materia(2, "Matemáticas", 1);
        Materia lab1 = new Materia(3, "Laboratorio 1", 1);
        Alumno alu1 = new Alumno(1001, "López", "Martin");
        Alumno alu2 = new Alumno(1002, "Martínez", "Brenda");
        
        alu1.agregarMateria(web2);
        alu1.agregarMateria(mate);
        alu1.agregarMateria(lab1);
        
        alu2.agregarMateria(web2);
        alu2.agregarMateria(mate);
        alu2.agregarMateria(lab1);
        alu2.agregarMateria(lab1);
        
        System.out.println(alu1.cantidadMaterias());
        System.out.println(alu2.cantidadMaterias());
    }
    
}
