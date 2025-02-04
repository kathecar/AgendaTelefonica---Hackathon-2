import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    //Secuencias de escape ANSI: Se usan para aplicar colores y estilos al texto en la consola

    public static final String ROJO = "\033[0;31m";
    public static final String VERDE = "\033[0;32m"; //El código 32 en ANSI es para el color verde
    public static final String AZUL = "\033[0;34m";
    public static final String RESET = "\033[0m"; // restablece el color

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Agenda agenda = new Agenda(10);

        do {
            System.out.println(AZUL + "*********************************" + RESET);
            System.out.println(AZUL + " ✏️ MENÚ AGENDA TELEFÓNICA" + RESET);
            System.out.println(AZUL + "*********************************" + RESET);
            System.out.println(VERDE + "1️⃣ Agregar Contacto" + RESET);
            System.out.println(VERDE + "2️⃣ Existe el contacto" + RESET);
            System.out.println(VERDE + "3️⃣ Mostrar Contactos" + RESET);
            System.out.println(VERDE + "4️⃣ Buscar Contacto" + RESET);
            System.out.println(VERDE + "5️⃣ Eliminar Contacto" + RESET);
            System.out.println(VERDE + "6️⃣ Modificar Teléfono" + RESET);
            System.out.println(VERDE + "7️⃣ Revisar si la Agenda está llena" + RESET);
            System.out.println(VERDE + "8️⃣ Verificar si tengo espacio en la Agenda" + RESET);
            System.out.println(ROJO + "9️⃣ Salir" + RESET);
            System.out.println(AZUL + "*********************************" + RESET);

            try {
                System.out.print("👉 Por favor, ingrese la opción que desea: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer de scanner

                switch (opcion) {
                    case 1:
                        System.out.print("💡 Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("💡 Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("📞 Teléfono (+57) : ");
                        String telefono = scanner.nextLine();

                        agenda.anadirContacto(nombre, apellido, telefono);
                        break;
                    case 2:
                        System.out.print("⁉️ Nombre del contacto: ");
                        String verificacionNombre = scanner.nextLine();
                        System.out.print("⁉️ Apellido del contacto: ");
                        String verificacionApellido = scanner.nextLine();

                        // Crear un nuevo contacto temporal con el nombre y apellido
                        Contacto contactoParaVerificar = new Contacto(verificacionNombre, verificacionApellido, "");

                        // Verificar si el contacto ya existe en la agenda
                        boolean existe = agenda.existeContacto(contactoParaVerificar);

                        // Mostrar si existe o no
                        if (existe) {
                            System.out.println("✅ El contacto existe en la agenda.");
                        } else {
                            System.out.println("❌ El contacto no existe en la agenda.");
                        }
                        break;
                    case 3:
                        agenda.listarContactos();
                        break;
                    case 4:
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        apellido = scanner.nextLine();
                        agenda.buscarContacto(nombre, apellido);
                        break;
                    case 5:
                        System.out.println("-----------------------------------");
                        System.out.println("| SISTEMA ELIMINACIÓN DE CONTACTO |");
                        System.out.println("-----------------------------------");
                        System.out.println("🗑 Por favor ingresa el nombre del contacto a eliminar");
                        String nombreAEliminar = scanner.nextLine();

                        System.out.println("🗑 Por favor ingresa el apellido del contacto a eliminar");
                        String apellidoAEliminar = scanner.nextLine();
                        agenda.eliminarContacto(nombreAEliminar, apellidoAEliminar);
                        break;

                    case 6:
                        System.out.println("-----------------------------------");
                        System.out.println("| SISTEMA MODIFICACIÓN DE CONTACTO |");
                        System.out.println("-----------------------------------");
                        System.out.println("⁉️ Por favor, ingresa el nombre del contacto");
                        String nombreAModificar = scanner.nextLine();

                        System.out.println("⁉️ Por favor, ingresa el apellido del contacto");
                        String apellidoAModificar = scanner.nextLine();

                        System.out.println("📞 Por favor, ingresa el nuevo número de teléfono");
                        String numeroAModificar = scanner.nextLine();

                        agenda.modificarContacto(nombreAModificar, apellidoAModificar, numeroAModificar);
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
                    default:
                        System.out.println("❌ Opción no válida. Por favor, ingresa una opción del 1 al 9.");
                        break;
                }
            } catch (InputMismatchException e) { //captura los errores cuando el usuario ingresa algo que no es un numero
                System.out.println("⚠️ Error: Por favor ingresa un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        } while(opcion != 9);
    }
}
