package llanquihue.tour.gui;

import llanquihue.tour.data.*;
import llanquihue.tour.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaLlanquihue extends JFrame {

    private JComboBox<String> cmbTipo;
    private JTextField txtNombre;
    private JTextField txtDato;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JTextArea txtArea;

   public VentanaLlanquihue(){
   super("Llanquihue Tour - Registro de Entidades");

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(950, 650);
   setLocationRelativeTo(null);

       setLayout(new BorderLayout());

       JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));

       panelFormulario.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

       panelFormulario.add(new JLabel("Tipo de entidad:"));
       cmbTipo = new JComboBox<>();
       cmbTipo.addItem("Guía");
       cmbTipo.addItem("Vehículo");
       cmbTipo.addItem("Colaborador");
       panelFormulario.add(cmbTipo);

       panelFormulario.add(new JLabel("Nombre / Patente:"));
       txtNombre = new JTextField();
       panelFormulario.add(txtNombre);

       panelFormulario.add(new JLabel("Especialidad / Tipo / Rol:"));
       txtDato = new JTextField();
       panelFormulario.add(txtDato);

       JPanel panelBotones = new JPanel();
       JPanel panelSuperior = new JPanel(new BorderLayout());

       panelSuperior.add(panelFormulario, BorderLayout.NORTH);
       panelSuperior.add(panelBotones, BorderLayout.SOUTH);

       add(panelSuperior, BorderLayout.NORTH);

       btnGuardar = new JButton("Guardar");
       btnLimpiar = new JButton("Limpiar");

       btnGuardar.addActionListener(e -> guardarEntidad());
       btnLimpiar.addActionListener(e -> limpiarCampos());


       panelBotones.add(btnGuardar);
       panelBotones.add(btnLimpiar);


       JPanel panelLista = new JPanel(new BorderLayout());

       panelLista.setBorder(BorderFactory.createTitledBorder("Entidades registradas"));

       txtArea = new JTextArea();

       txtArea.setEditable(false);

       panelLista.add(new JScrollPane(txtArea), BorderLayout.CENTER);
       add(panelLista, BorderLayout.CENTER);

       setVisible(true);

   }

    private void guardarEntidad() {

        String tipo = cmbTipo.getSelectedItem().toString();
        String nombre = txtNombre.getText();
        String dato = txtDato.getText();

        if (tipo.equals("Guía")) {
            txtArea.append("Guía: " + nombre + " | Especialidad: " + dato + "\n");

        } else if (tipo.equals("Vehículo")) {
            txtArea.append("Patente: " + nombre + " | Tipo: " + dato + "\n");

        } else {
            txtArea.append("Colaborador: " + nombre + " | Rol: " + dato + "\n");
        }
    }

    private void limpiarCampos() {

        txtNombre.setText("");
        txtDato.setText("");
        cmbTipo.setSelectedIndex(0);

    }
}