public class Tema8 {

    public static void main(String[] args){

        Persona objPersona = new Persona();

        objPersona.setEdad(20);
        objPersona.setNombre("Tatiana");
        objPersona.setTelefono(1234567);

        System.out.println("Edad: "+" "+objPersona.getEdad()+" "+ "Nombre:"+" "+ objPersona.getNombre()+" "+ "Telefono:"+" "+objPersona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
