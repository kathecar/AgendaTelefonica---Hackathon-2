
import java.util.ArrayList;
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
    public boolean existeContacto(Contacto contactoAgenda) {
        for (Contacto contacto : agenda) {
            // Comparar solo nombre y apellido de los contactos
            if (contacto.getNombre().equals(contactoAgenda.getNombre()) &&
                    contacto.getApellido().equals(contactoAgenda.getApellido())) {
                System.out.println("El contacto existe en la agenda.😊");
                return true;
            }
        }
        System.out.println(" El contacto no existe en la agenda 😒");
        return false;
    }

    public void anadirContacto(String nombre, String apellido, String telefono){
        if (agendaLlena()){
            System.out.println(" ⚠ Lo sentimos la Agenda esta llena, por lo tanto no puedes añadir ❌ ");
        } else {
            if ( nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty()){
                System.out.println("❌ El nombre, apellido y telefono son obligatorios");
            } else {

                //regex es de 0 a 9 los digitos que usa            }
                if( telefono.length() != 10 ||  !telefono.matches("[0-9]+")) {
                    System.out.println("🛑 El número de teléfono debe tener exactamente 10 caracteres.");
                    return;
                }
                // Aqui instancio el objeto contacto, con un constriuctor me traigo los datos

                Contacto nuevoContacto = new Contacto(nombre, apellido, telefono);

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

                if (c.getTelefono().equals(nuevoTelefono)) {
                    System.out.println("El nuevo número es el mismo que el actual, por favor, verifique.");
                    return;
                }

                c.setTelefono(nuevoTelefono);
                System.out.println("Teléfono modificado correctamente.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }


    public void espaciosLibres(){
        //Brandon
        int espaciosLibres = capacidad - agenda.size();
        System.out.println("\n" + Lineas());
        System.out.println("Espacios libres en la agenda: " + espaciosLibres);
        System.out.println(Lineas() + "\n");
    }

    String Lineas() {
        return "========================================";
    }


}
