package clases_examen;

/**
 *
 * @author Principal
 */
public class Fibonacci {
private int [] fib = new int [200];

private int n;
private int a1;
private int a2;
private int conjunto;
private int suma;

//Constructor en  -Default-
public Fibonacci(){
    n = 15;
    a1 = 1;
    a2 = 1;
    conjunto = 10;
    suma = 1;
}

//Constructor que contiene argumentos
public Fibonacci (int num,int fib1,int fib2){
    n = num;
    a1 = fib1;
    a2 = fib2;
    
    //Metodos SET para el objeto fibC
}
public void setFib1 (int fb){
    a1 = fb;
}
public void setFib2 (int fb) {
    a2 = fb;
}
public void setNum (int num){
    n = num;
}
    //Metodos GET para el objeto fibC
public int getNum(){
    return n;
}
public int getFib1(){
    return a1;
}
public int getFib2(){
    return a2;
}

//formula usada para conseguir la secuencia, return suma.

public int getS(){
    System.out.println(a1);
    for (int s = 1; s < conjunto; s++){
        System.out.println(suma);
        
        suma = a1 + a2;
        a1 = a2;
        a2 = suma;
    }
    return suma;
}    
}
