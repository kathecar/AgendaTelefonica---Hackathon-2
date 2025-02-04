import java.util.ArrayList;

public class Agenda extends Contacto{

    ArrayList<Contacto> agenda = new ArrayList<>();



    public Agenda(String nombre, String apellido, String telefono, ArrayList<Contacto> agenda) {
        super(nombre, apellido, telefono);
        this.agenda = agenda;
    }

   // agenda.add=("ana");

   public void anadirContacto(){
    // Kate

   }
    public void existeContacto(){
    // Kate

    }
    public void listarContacto(){
    //Juan
    }
    public void buscarContacto(){
        //Juan
    }
    public void eliminarContacto(String nombre, String apellido) {
        for (Contacto c : agenda) {
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                agenda.remove(c);
                System.out.println("Contacto eliminado correctamente.");
                return;
            }
        }
        System.out.println("El contacto no existe.");
    }

    public void modificarContacto(String nombre, String apellido, String nuevoTelefono) {
        for (Contacto c : agenda) {
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                c.setTelefono(nuevoTelefono);
                System.out.println("Teléfono modificado correctamente.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void agendaLlena(){
        //Brandon

    }
    public void espaciosLibres(){
    //Brandon
    }
}
