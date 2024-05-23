package vista;

import com.toedter.calendar.JCalendar;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VistaEquipos extends JFrame{
    private JComboBox cbEquipos;
    private JTextArea taDatos;
    private JButton bEditar;
    private JButton bBorrar;
    private JTextField tfNombre;
    private JPanel pFecha;
    private JPanel panelPrincipal;
    private JPanel panelComboBox;
    private JPanel panelDatos;
    private JPanel panelCrear;
    private JButton bAceptar;
    private JButton bSalir;
    private JCalendar cFecha;

    public VistaEquipos() {
        super("Equipos");
        setContentPane(panelPrincipal);
        setSize(500,500);
        setLocationRelativeTo(null);
        cFecha = new JCalendar();
        pFecha.add(cFecha);
    }
    public void addBEditarAl (ActionListener al){
        bEditar.addActionListener(al);
    }
    public void addBBorrarAl (ActionListener al){
        bBorrar.addActionListener(al);
    }
    public void addBAceptarAl (ActionListener al){
        bAceptar.addActionListener(al);
    }
    public void addCbEquiposAl (ActionListener al){
        cbEquipos.addActionListener(al);
    }
    public void addBSalirAl (ActionListener al){
        bSalir.addActionListener(al);
    }

    public JComboBox getCbEquipos() {
        return cbEquipos;
    }

    public void setCbEquipos(JComboBox cbEquipos) {
        this.cbEquipos = cbEquipos;
    }

    public JTextArea getTaDatos() {
        return taDatos;
    }

    public void setTaDatos(JTextArea taDatos) {
        this.taDatos = taDatos;
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public void setTfNombre(JTextField tfNombre) {
        this.tfNombre = tfNombre;
    }

    public JPanel getpFecha() {
        return pFecha;
    }

    public void setpFecha(JPanel pFecha) {
        this.pFecha = pFecha;
    }

    public JPanel getPanelComboBox() {
        return panelComboBox;
    }

    public void setPanelComboBox(JPanel panelComboBox) {
        this.panelComboBox = panelComboBox;
    }

    public JPanel getPanelDatos() {
        return panelDatos;
    }

    public void setPanelDatos(JPanel panelDatos) {
        this.panelDatos = panelDatos;
    }

    public JPanel getPanelCrear() {
        return panelCrear;
    }

    public void setPanelCrear(JPanel panelCrear) {
        this.panelCrear = panelCrear;
    }


    public JCalendar getcFecha() {
        return cFecha;
    }

    public void setcFecha(JCalendar cFecha) {
        this.cFecha = cFecha;
    }

    public void limpiar()
    {
        tfNombre.setText("");
        taDatos.setText("");
        tfNombre.requestFocus();
    }
    public void mostrarMensaje(String m)
    {

        JOptionPane.showMessageDialog(null, m);
    }



}
