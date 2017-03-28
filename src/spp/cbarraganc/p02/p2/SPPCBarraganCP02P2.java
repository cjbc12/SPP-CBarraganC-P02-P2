
package spp.cbarraganc.p02.p2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author
 * José Eduardo De Llano Barragán   A01410712   IC
 * Alberto Barnetche Suarez         A01411570   ISS
 * Carlos Barragán Carrión          A01410357   IMT
 * Carlos Miguel De León García     A01410399   IMA
 * 
 */
public class SPPCBarraganCP02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int tamaño=Int("el tamaño de los arreglos: ");

        int [][] a = crearMatriz("A",tamaño);

        int [][] b = crearMatriz("B",tamaño);

        print(a,b);

        

    }

    

      public static int Int(String mensaje){

        Scanner teclado = new Scanner (System.in);

        int varEntera = 0;

        boolean flag;

        

        do{

        System.out.print("Introduzca " + mensaje);

        try{

        varEntera = teclado.nextInt();

        flag=false;

    }catch (Exception ex){

            System.out.println("Introdujo una variable incorrecta!" + ex);

            flag=true;

            teclado.nextLine();

    } 

  } while (flag); 

    return varEntera;

    

    }

       public static int [][] crearMatriz(String mensaje, int tamaño){

        System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);

        int[][]Matrix=new int[tamaño][tamaño];

        int valor;

        System.out.println("El tamaño de la matriz es "+Matrix.length);

        for (int i=0; i<Matrix.length; i++){

            for (int j=0; j<Matrix[i].length; j++){

            Matrix[i][j]=Int("el valor ("+i+","+j+"): ");

            }

        }

        return Matrix;

        }

       

    public static void print(int [][]a,int [][]b){

        if(Arrays.deepEquals(a,b)){

            System.out.println("Las matrices son iguales.");}

        else{

            System.out.println("Las matrices no son iguales.");}

    }

    }
