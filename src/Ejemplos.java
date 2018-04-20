
import javax.swing.JOptionPane;


public class Ejemplos {
    public static void main(String[] args)
    {
        /*int[] edad;
        edad = new int[10];
        
        double[] precio = new double[3];
        
        for(int i=0; i<precio.length; i++)
        {
            double total = 0;
            
            precio[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
            total += precio[i];
        }
        
        JOptionPane.showMessageDialog(null, "Total: " + total);
        */
        
        int seguir;
        String nombre;
        
        do{
            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
            JOptionPane.showMessageDialog(null, "Hola" + nombre);
            seguir = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        }
        while(seguir==JOptionPane.YES_OPTION);
    }
}
