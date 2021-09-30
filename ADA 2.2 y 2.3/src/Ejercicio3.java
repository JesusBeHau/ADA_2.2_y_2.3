import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        String dominio;

        dominio=JOptionPane.showInputDialog("Ingrese un nombre de dominio: ");

        JOptionPane.showMessageDialog(null,"El dominio generado es: www."+dominio + ".com");
    }
}
