
package video87;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float primer[],segundo[],tercer[];
        float sumaPrimer=0,sumaSegundo=0,sumaTercer=0,sumaAlumno=0;
        float promedioPrimer=0,promedioSegundo=0,promedioTercer=0,promedioAlumno=0;
        int posicion;
        
        primer = new float[5];
        segundo = new float[5];
        tercer = new float[5];
        
        System.out.println("Digite las notas del primer trimestre: ");
        for (int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            primer[i] = teclado.nextInt();
            
            sumaPrimer += primer[i]; // Sumamos todas las notas del primer trimestre
        }
        
        System.out.println("Digite las notas del segundo trimestre: ");
        for (int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            segundo[i] = teclado.nextInt();
            
            sumaSegundo += segundo[i]; // Sumamos todas las notas del segundo trimestre
        }
        
        System.out.println("Digite las notas del tercer trimestre: ");
        for (int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            tercer[i] = teclado.nextInt();
            
            sumaTercer += tercer[i]; // Sumamos todas las notas del tercer trimestre
        }
        
        // Sacamos los promedios de cada uno de los trimestres
        promedioPrimer = sumaPrimer/5;
        promedioSegundo = sumaSegundo/5;
        promedioTercer = sumaTercer/5;
        
        // Pedimos la posicion del alumno N para sacar su promedio
        do{
            System.out.print("\nDigite la posicion del alumno(0-4) para sacar el promedio");
            posicion= teclado.nextInt();
        }while(posicion<0 || posicion>4);
        
        
        // Sacamos la suma de las notas del alumno
        sumaAlumno = primer[posicion] + segundo[posicion] + tercer[posicion];
        promedioAlumno = sumaAlumno/3;
        
        System.out.println("\nMostrando los datos requeridos");
        System.out.println("Promedio primer trimestre: "+promedioPrimer);
        System.out.println("Promedio segundo trimestre: "+promedioSegundo);
        System.out.println("Promedio tercer trimestre: "+promedioTercer);
        System.out.println("Promedio del alumno: "+promedioAlumno);
    }
    
}
