import javax.swing.JOptionPane;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class App {
    public static void main(String[] args) throws Exception {
       
    int ingreso,ingreso1;
    int resultado =0,resultado1=1 ;
    int numeros []= new int[8];
    int numeros1 []=new int [8];
    int arreglo3[]=new int [16];
//alimentacion primera lista
    for (int i=0;i<numeros.length;i++){
        
    ingreso= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numeros(primer arreglo) : "));
    numeros [i] = ingreso;    
    arreglo3[resultado]=numeros[i];
    resultado=resultado+2;
    //JOptionPane.showMessageDialog(null, "Los numeros son : "+ arreglo3[0]+"---"+arreglo3[1]);
    
   
}//alimentacion segunda  lista
for (int i=0;i<numeros1.length;i++){
    ingreso1= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numeros(segundo arreglo) : "));
    numeros1 [i] = ingreso1;
    arreglo3[resultado1]=numeros1[i];
    resultado1=resultado1+2;
    //JOptionPane.showMessageDialog(null, "Los numeros son : "+ arreglo3[2]+"---"+arreglo3[3]);
}    
    for (int i=0;i<15 ;i++){

        JOptionPane.showMessageDialog(null, "Los numeros son : "+ arreglo3[i]);
        

    }    

   
   }
        
         }     

    
    


    

