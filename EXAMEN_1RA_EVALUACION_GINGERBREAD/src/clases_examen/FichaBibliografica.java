package clases_examen;

/**
 *
 * @author Principal
 */
public class FichaBibliografica {
    private String autorNom;
    private String autorAp;
    private String titulo;
    private int año;
    private String ciudad;
    private String estado;
    private String pais;
    private String editorial;
    private int volumen;
    private int numVol;
    private String traductorNom;
    private String traductorAp;
    private String shortTitle;
    private int standardNum;
    private int paginas;
    private String edicion;
    private String comentarios;
    private String medium;
    private int añoAccessed;
    private String mesAccessed;
    private int diaAccessed;
 //metodos set
    public void setAutorNom(String autorNomLib){
        autorNom = autorNomLib;
    }
    public void setAutorAp(String autorApLib){
        autorAp = autorApLib;
    }
    public void setTitulo(String tituloLib){
        titulo = tituloLib;
    }
    public void setAño(int añoLib){
        año = añoLib;
    }
    public void setCiudad(String ciudadLib){
        ciudad = ciudadLib;
    }
    public void setEstado(String estadoLib){
        estado = estadoLib;
    }
    public void setPais(String paisLib){
        pais = paisLib;
    }
    public void setEditorial(String editorialLib){
        editorial = editorialLib;
    }
    public void setVolumen(int volumenLib){
        volumen = volumenLib;
    }
    public void setNumVol(int numVolLib){
        numVol = numVolLib;
    }
    public void setTraductorNom(String traductorNomLib){
        traductorNom = traductorNomLib;
    }
    public void setTraductorAp(String traductorApLib){
        traductorAp = traductorApLib;
    }
    public void setShortTitle(String shortTitleLib){
        shortTitle = shortTitleLib;
    }
    public void setStandardNum(int standardNumLib){
        standardNum = standardNumLib;
    }
    public void setPaginas(int paginasLib){
        paginas = paginasLib;
    }
    public void setEdicion(String edicionLib){
        edicion = edicionLib;
    }
    public void setComentarios(String comentariosLib){
        comentarios = comentariosLib;
    }
    public void setMedium(String mediumLib){
        medium = mediumLib;
    }
    public void setAñoAccessed(int añoAccessedLib){
        añoAccessed = añoAccessedLib;
    }
    public void setMesAccessed(String mesAccessedLib){
        mesAccessed = mesAccessedLib;
    }
    public void setDiaAccessed(int diaAccessedLib){
        diaAccessed = diaAccessedLib;
    }
    //metodos get
    public String getAutorNom(){
        return autorNom;
    }
    public String getAutorAp(){
        return autorAp;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAño(){
        return año;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getEstado(){
        return estado;
    }
    public String getPais(){
        return pais;
    }
    public String getEditorial(){
        return editorial;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getNumVol(){
        return numVol;
    }
    public String getTraductorNom(){
        return traductorNom;
    }
    public String getTraductorAp(){
        return traductorAp;
    }
    public String getShortTitle(){
        return shortTitle;
    }
    public int getStantardNum(){
        return standardNum;
    }
    public int getPaginas(){
        return paginas;
    }
    public String getEdicion(){
        return edicion;
    }
    public String getComentarios(){
        return comentarios;
    }
    public String getMedium(){
        return medium;
    }
    public int getAñoAccessed(){
        return añoAccessed;
    }
    public String getMesAccessed(){
        return mesAccessed;
    }
    public int getDiaAccessed(){
        return diaAccessed;
    }
public FichaBibliografica(){
    autorNom = "Michael";
    autorAp = "Ende";
    titulo = "La historia interminable";
    año = 1982;
    ciudad = "Madrid";
    estado = "--";
    pais = "España";
    editorial = "Alfaguara";
    volumen = 1;
    numVol = 1;
    traductorNom = "Miguel";
    traductorAp = "Saenz";
    shortTitle = "La historia sin fin";
    standardNum = 978607313;
    paginas = 420;
    edicion =  "1ra";
    comentarios = "Es una historia repleta de fantasia";
    medium = "PDF";
    añoAccessed = 2023;
    mesAccessed = "enero";
    diaAccessed =10;
}
public FichaBibliografica(String autorNomLib, String autorApLib, String tituloLib, int añoLib, String ciudadLib, String editorialLib){
    autorNom = autorNomLib;
    autorAp = autorApLib;
    titulo = tituloLib;
    añoAccessed = añoLib;
    ciudad = ciudadLib;
    editorial = editorialLib;
}   
public void imprimirFicha(){
        String auNom = autorNom.charAt(0) + "";
        String traNom = traductorNom.charAt(0) + "";
        String ficha = autorAp + ", " + auNom + ". " + año + ". " + titulo + ". " + edicion + " ed.," + "Vol. " + volumen + ". " + traNom + ". " + 
        traductorAp + " Trad. " + ciudad + ", " + pais + ": " + editorial + "." + "\nRecuperado el " + diaAccessed + " de " + mesAccessed + " del " + añoAccessed + "";
        System.out.println("- Ficha bibliografica de mi libro:");
        System.out.println(ficha);
        
     }
public void imprimirFicha1(){
        String ficha1 = autorAp + "," + añoAccessed;
        System.out.println("- Ficha bibliografica del libro de otra persona");
        System.out.println(ficha1);
     }
}    
