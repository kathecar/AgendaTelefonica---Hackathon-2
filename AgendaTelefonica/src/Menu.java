import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
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


            Agenda capacidad = new Agenda(10);

            switch (opcion) {
                case 1:
                    System.out.print("💡 Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("💡 Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("📞 Teléfono: ");
                    String telefono = scanner.nextLine();

                    capacidad.anadirContacto(nombre, apellido, telefono);
                    break;
                case 2:
                    System.out.print("⁉ Nombre del contacto: ");
                    String verificacionNombre = scanner.nextLine();
                    break;


                case 5:
                    System.out.println("-----------------------------------");
                    System.out.println("| SISTEMA ELIMINACIÓN DE CONTACTO |");
                    System.out.println("-----------------------------------");
                    System.out.println("Por favor ingresa el nombre del contacto a eliminar");
                    String nombreAEliminar = scanner.nextLine();

                    System.out.println("Por favor ingresa el apellido del contacto a eliminar");
                    String apellidoAEliminar = scanner.nextLine();

                    Agenda agenda1 = new Agenda();
                    agenda1.eliminarContacto(nombreAEliminar, apellidoAEliminar)

                    break;

                case 6:
                    System.out.println("-----------------------------------");
                    System.out.println("| SISTEMA MODIFICACIÓN DE CONTACTO |");
                    System.out.println("-----------------------------------");
                    System.out.println("Por favor ingresa el nombre del contacto a modificar");
                    String nombreAModificar = scanner.nextLine();

                    System.out.println("Por favor ingresa el apellido del contacto a eliminar");
                    String apellidoAModificar = scanner.nextLine();

                    System.out.println("Por favor ingresa el numero del contacto a eliminar");
                    String numeroAModificar = scanner.nextLine();

                    Agenda agenda2 = new Agenda();
                    agenda2.modificarContacto(nombreAModificar, apellidoAModificar, nombreAModificar)

                    break;

            }
        }while (opcion!=9)
    }
}
