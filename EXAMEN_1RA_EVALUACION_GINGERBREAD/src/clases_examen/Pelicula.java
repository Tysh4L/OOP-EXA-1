package clases_examen;

/**
 *
 * @author Principal
 */
public class Pelicula {
    private String titulo;
    private String estudio;
    private int rating;
    private int edad;
    
    public Pelicula(){ //constructor default
        titulo = "---";
        estudio = "---";
        rating = 13;
        edad = 0;
    }
    public Pelicula(String tituloPeli, String estudioPeli, int edadPeli, int ratingPeli){ //constructor con parametros
        titulo = tituloPeli;
        estudio = estudioPeli;
        edad = edadPeli;
        rating = ratingPeli;
    }
 //metodos set
    public void setEdad(int edadPeli){
        edad = edadPeli;
    }
    public void setTitulo(String tituloPeli){
        titulo = tituloPeli;
    }
    public void setEstudio(String estudioPeli){
        estudio = estudioPeli;
    }
    public void setRating(int  num){
        rating = num;
    }

//metodos get 
    public int getEdad(){
        return edad;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getEstudio(){
        return estudio;
    }
    public int getRating(){
        return rating;
    }
    //metodo evaluarEdad
public String evaluarEdad(){
    String resu = " ";
    if (edad >= 13){
        resu = "Puedes ver la pelicula";
    }else {
        resu = "No puedes ver la pelicula";
    }
    return resu;
}
    //metodo imprimirDatos
public void imprimirDatos(){
    System.out.println("PELICULA");
    System.out.println("Titulo: "+ titulo);
    System.out.println("Estudio: "+ estudio);
    System.out.println("Rating: "+ rating);
    //
    System.out.println(evaluarEdad());
    
    } 
}
   
    