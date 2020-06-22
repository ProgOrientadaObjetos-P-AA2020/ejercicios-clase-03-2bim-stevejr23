package paquetedos;

public abstract class Docente {

    private String nombre;
    private double sueldo;

    public Docente(String n) {
        nombre = n;
    }

    public void establecerDocente(String n) {
        nombre = n;
    }

    public String obtenerDocente() {
        return nombre;
    }

    public abstract void obtenerSueldo() ;
//    }
//        //sueldo = d;
//    }
}
