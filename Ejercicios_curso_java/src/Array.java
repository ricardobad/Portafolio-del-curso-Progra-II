import javax.swing.JOptionPane;

public class Array {

    int ingreso;
    int numeros []= new int[10];

    for (int i=0;i<numeros.length;i++){
    ingreso= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero : "));
    numeros [i] = ingreso;}



    for (int i=4;i>=0;i--){
//System.out.print("\n "+numeros[i]);
    JOptionPane.showMessageDialog(null,"Los numeros son : "+ numeros[i]);
    }



    
}
