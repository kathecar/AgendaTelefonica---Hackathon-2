import java.util.ArrayList;

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

    }
    public void listarContacto(){
    //Juan
    }
    public void buscarContacto(){
        //Juan
    }
    public void eliminarContacto(){
        //Amalia
    }
    public void modificarContacto(){
        //Amalia
    }
    public void agendaLlena(){
        //Brandon

    }
    public void espaciosLibres(){
    //Brandon
    }
}
