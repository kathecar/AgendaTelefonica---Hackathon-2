import java.util.ArrayList;
<<<<<<< HEAD

public class Agenda {

    private ArrayList<Contacto> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();


    }





    public void anadirContacto(){
        // Kate

    }
    public boolean existeContacto(Contacto contactoAgenda){
        // Kate
        for (Contacto contacto : agenda) {
            if (contacto.equals(contactoAgenda)) {
                return true;
            }
        }
        return false;
=======
import java.util.Collections;
import java.util.Comparator;


public class Agenda{
    private ArrayList<Contacto> agenda;

    private int capacidad;

    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.agenda = new ArrayList<Contacto>();
    }
    public boolean agendaLlena(){
        if (agenda.size() >= capacidad) {
            System.out.println("\n" + Lineas());
            System.out.println("La agenda esta llena.");
            System.out.println(Lineas() + "\n");
        } else {
            System.out.println("\n" + Lineas());
            System.out.println("La agenda tiene espacio.");
            System.out.println(Lineas() + "\n");
        }

        return false;
    }
    public boolean existeContacto(Contacto contactoAgenda){
        for (Contacto contacto : agenda) {
            if (contacto.equals(contactoAgenda)) {
                System.out.println(" El contacto, ya existe en la agenda 📔");
                return true;
            }
        }
        System.out.println(" El contacto, no existe en la agenda 📔");
        return false;

    }

    public void anadirContacto(String nombre, String apellido, String telefono){
        if (agendaLlena()){
            System.out.println(" ⚠ Lo sentimos la Agenda esta llena, por lo tanto no puedes añadir ❌ ");
        } else {
            if ( nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty()){
                System.out.println("❌ El nombre, apellido y telefono son obligatorios");
            } else {

                // Aqui instancio el objeto contacto, con un constriuctor me traigo los datos

                Contacto nuevoContacto = new Contacto(nombre, apellido, telefono);
>>>>>>> Kathe

                // Verificar que haya nombre apellido y telefono

                if (existeContacto(nuevoContacto)){
                System.out.println("⚠ El contacto ya existe.");
                }
                else {
                    // dentro del parametro coloco el nuevo contacto
                    agenda.add(nuevoContacto);
                    System.out.println("✅ El contacto se ha añadido con exito 😁 ");
                }
            }
        }
    }
<<<<<<< HEAD
    public void listarContacto(){
        //Juan
=======

// Método para listar todos los contactos

    public void listarContactos() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            // Ordenar la lista por nombre y apellido
            Collections.sort(agenda, Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido));
            for (Contacto c : agenda) {
                System.out.println(c);
            }
        }
>>>>>>> Kathe
    }

    // Método para buscar un contacto por nombre y apellido
    public void buscarContacto(String nombre, String apellido) {
        Contacto temp = new Contacto(nombre, apellido, "");
        if (agenda.contains(temp)) {
            for (Contacto c : agenda) {
                if (c.equals(temp)) {
                    System.out.println("Teléfono: " + c.getTelefono());
                    return;
                }
            }
        }
        System.out.println("Contacto no encontrado.");
    }
    public void eliminarContacto(){
        //Amalia
    }
    public void modificarContacto(){
        //Amalia
    }

    public void espaciosLibres(){
        //Brandon
<<<<<<< HEAD
    }
=======
        int espaciosLibres = capacidad - agenda.size();
        System.out.println("\n" + Lineas());
        System.out.println("Espacios libres en la agenda: " + espaciosLibres);
        System.out.println(Lineas() + "\n");
    }

    String Lineas() {
        return "========================================";
    }


>>>>>>> Kathe
}