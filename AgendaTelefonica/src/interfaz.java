
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class interfaz {
    private JFrame frame;
    private Agenda agenda;
    private JTextArea textArea;

    public interfaz() {
        agenda = new Agenda(10);
        frame = new JFrame(" ✏️ MENÚ AGENDA TELEFÓNICA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Panel principal para la interfaz
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        // Área de texto para mostrar la información de la agenda
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        // Botones de la interfaz
        JButton agregarButton = new JButton("1️⃣ Agregar Contacto");
        JButton verificarexistenciaButton = new JButton("2️⃣ Existe el contacto");
        JButton listarButton = new JButton("3️⃣ Mostrar Contactos");
        JButton eliminarButton = new JButton("4️⃣ Buscar Contacto");
        JButton modificarButton = new JButton("5️⃣ Eliminar Contacto");
        JButton revisarAgendaButton = new JButton("6️⃣ Modificar Teléfono");
        JButton disponibilidadButton = new JButton("7️⃣ Revisar si la Agenda está llena");
        JButton agendallenaButton = new JButton("8️⃣ Verificar si tengo espacio en la Agenda");
        JButton salirAgendaButton = new JButton("9️⃣ Salir");
        panel.add(agregarButton);
        panel.add(verificarexistenciaButton);
        panel.add(listarButton);
        panel.add(eliminarButton);
        panel.add(modificarButton);
        panel.add(revisarAgendaButton);
        panel.add(disponibilidadButton);
        panel.add(agendallenaButton);
        panel.add(salirAgendaButton);

        agregarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = JOptionPane.showInputDialog("💡 Nombre: ");
            String apellido = JOptionPane.showInputDialog("💡 Apellido: ");
            String telefono = JOptionPane.showInputDialog("📞 Teléfono: ");
            agenda.anadirContacto(nombre, apellido, telefono);
        }
    });
}
//    // Se agregan los botones al panel
//        for (JButton button : buttons) {
//        panel.add(button);
//    }