package examen_1ra_evaluacion_gingerbread;

import clases_examen.Password;
import clases_examen.Fibonacci;
import clases_examen.FichaBibliografica;
import clases_examen.Pelicula;
import clases_examen.DatosIntegrantes;

/**
 *
 * @author Principal
 */
public class EXAMEN_1RA_EVALUACION_GINGERBREAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //////////////////////1.
        System.out.println("CLASE DATOS DEL EQUIPO");
        System.out.println("- Integrante 1 \n" +DatosIntegrantes.dIntegrante("C22550142\n", "Ingenieria en Sistemas Computacionales\n", "Danna Paola\n", "Lopez Flores\n", "Gingerbread"));
        System.out.println("- Integrante 2 \n" +DatosIntegrantes.dIntegrante("22550320\n", "Ingenieria en Sistemas Computacionales\n", "Danna Paola\n", "Maldonado Sepulveda\n", "Gingerbread"));
        System.out.println("- Integrante 3 \n" +DatosIntegrantes.dIntegrante("C22550143\n", "Ingenieria en Sistemas Computacionales\n", "Alan Dirceu\n", "Rivas Palomino\n", "Gingerbread"));
        System.out.println("- Integrante 4 \n" +DatosIntegrantes.dIntegrante("22550340\n", "Ingenieria en Sistemas Computacionales\n", "Diego Enrique\n", "Vazquez Montañez\n", "Gingerbread"));
        System.out.println("\n");
        System.out.println("- Problemas resueltos: \n"+DatosIntegrantes.problemasResueltos("Clase datos del equipo\n", "Clase contraseña\n", "Clase pelicula\n", "Clase ficha bibliografica\n", "Fibonacci\n"));
        
        //////////////////////2.
        System.out.println("CLASE CONTRASEÑA");
        Password Acceso = new Password();
        System.out.println("- Usuario 1:");
        if (Acceso.verificarAcceso("Tysh4L", "I_LOVEDVA")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        System.out.println("- Usuario 2:");
        Password Acceso2 = new Password("AndresManuel", "0br4d0r");
        if (Acceso2.verificarAcceso("AndresManuel", "0br4d0r")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    
        
        
        System.out.println("\n");
        
        /////////////////////////3.
        System.out.println("CLASE PELICULA");
        Pelicula peli1 = new Pelicula ("Twenty One Pilots", "Jason Zada", 12, 13);
        peli1.imprimirDatos();
        peli1.evaluarEdad();
        System.out.println("\n");
        
        ///////////////////////4.
        System.out.println("CLASE FICHA BIBLIOGRÁFICA");
        FichaBibliografica miFicha = new FichaBibliografica();
        miFicha.imprimirFicha();
        
        FichaBibliografica personaFicha = new FichaBibliografica("Antoine de", "Saint-Exupery", "El Principito", 1943, 
        "Ciudad de Mexico", "Salamandra");
        personaFicha.imprimirFicha1();
        System.out.println("\n");
        
        /////////////////////5.
        System.out.println("FIBONACCI");
         //objetos creados:
       Fibonacci fibA = new Fibonacci ();
       Fibonacci fibB = new Fibonacci();
       Fibonacci fibC = new Fibonacci();
       
        //Objeto fibA
        System.out.println("");
        System.out.println("Objeto con constructor Default: ");
        fibA.getS();
        System.out.println(fibA.getNum());
        System.out.println(fibA.getFib1());
        System.out.println(fibA.getFib2());
        
        //Objeto fibB
        System.out.println("");
        System.out.println("Objeto con Argumentos: ");
        fibB.getS();
        System.out.println(fibB.getNum());
        System.out.println(fibB.getFib1());
        System.out.println(fibB.getFib2());
        
        //Objeto fibC
        System.out.println("");
        System.out.println("Objeto usando Set y get: ");
        fibC.setNum(15);
        fibC.setFib1(2);
        fibC.setFib2(4);
        fibC.getS();
        System.out.println(fibC.getNum());
        System.out.println(fibC.getFib1());
        System.out.println(fibC.getFib2());
    }

}
