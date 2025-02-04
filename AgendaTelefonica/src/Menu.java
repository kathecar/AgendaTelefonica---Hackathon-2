import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Agenda agenda = new Agenda(10);
        do {
            System.out.println("\n 📞 MENÚ AGENDA TELEFÓNICA");
            System.out.println("1️⃣ Agregar Contacto");
            System.out.println("2️⃣ Existe el contacto");
            System.out.println("3️⃣ Mostrar Contactos");
            System.out.println("4️⃣ Buscar Contacto");
            System.out.println("5️⃣ Eliminar Contacto");
            System.out.println("6️⃣ Modificar Teléfono");
            System.out.println("7️⃣ Revisar si la Agenda está llena");
            System.out.println("8️⃣ Verificar si tengo espacio en la Agenda");
            System.out.println("9️⃣ Salir");


            System.out.print("👉 Por favor, ingrese la opción que desea");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar

            switch (opcion) {
                case 1:
                    System.out.print("💡 Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("💡 Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("📞 Teléfono: ");
                    String telefono = scanner.nextLine();

                    agenda.anadirContacto(nombre,apellido,telefono);
                    break;
                case 2:
                    System.out.print("⁉ Nombre del contacto: ");
                    String verificacionNombre = scanner.nextLine();

                case 3:
                    agenda.listarContactos();
                    break;
                case 7:
                    agenda.agendaLlena();
                    break;
                case 8:
                    agenda.espaciosLibres();
                    break;
                case 9:
                    System.out.println("👋 ¡Hasta pronto!");
                    break;
            }
        } while();
    }
}
