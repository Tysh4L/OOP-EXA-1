package clases_examen;

/**
 *
 * @author Principal
 */
public class DatosIntegrantes {
    public static String dIntegrante(String numero, String carrera,String nombre, String apellido, String eq){
        String dIntegrante = "Numero de control: "+ numero + "Carrera: " + carrera + "Nombre: "+ nombre + "Apellidos: "+apellido + "Equipo: "+ eq;
        return dIntegrante;
    }
    
    public static String problemasResueltos(String p1, String p2, String p3, String p4, String p5){
        String problemasResueltos = "1. "+ p1 + "2. "+ p2 + "3. "+ p3 + "4. " + p4 + "5. " + p5;
        return problemasResueltos;
    }
}
