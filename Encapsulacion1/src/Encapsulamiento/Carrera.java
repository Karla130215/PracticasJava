package Encapsulamiento;

public class Carrera {

    private int matricula;
    private String nombreAlumno;
    private String materia;

    //metodos accesores
    public int getMatricula() {
        return matricula;

    }
 

    public void setMatricula(int matricula) {
        this.matricula = matricula;

    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
