package ui;
import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
    public static Scanner sc;
	private static IConjunto<String> A;
	private static IConjunto<String> B;
	
	
    public static void main(String[] args) throws IOException {
    	sc=new Scanner(System.in);
    	A= new Conjunto<String>();
    	B= new Conjunto<String>();
    	crearConjuntos(A);
    	crearConjuntos(B);
    	menu();
    }
    
    public static int message_menu() {
        int option;
        System.out.println("*********MENU**********" + "\n1.Union               *" + "\n2.Interseccion        *" + "\n3.Diferencia          *" +"\n4.Diferencia simetrica*" + "\n0.salir               *" + "\n***********************");
        option = sc.nextInt();
        return option;
    }
    
    public static void crearConjuntos(IConjunto<String> conjunto) throws IOException {
    	BufferedReader br= new BufferedReader( new InputStreamReader(System.in));

		String [] setElement;
		System.out.println ("Escriba elementos para el conjunto, separados por espacio:");
		
		String values=br.readLine();
		setElement=values.split("\\ ");
		for(int i=0;i<setElement.length;i++) {
			conjunto.addElements(setElement[i]);
		}	
		System.out.println(conjunto.mostrarConjunto());
    }
    
    public static void menu() {

        int option=1;
        

        while (option != 0) {
        	option = message_menu();
            if (option == 1) {
               Conjunto<String> union =new Conjunto<String>();
               union.union(A, B);
               System.out.println ("A U B: "+union.mostrarConjunto());
            } else if (option == 2) {
            	 Conjunto<String> interseccion =new Conjunto<String>();
            	 interseccion.intersection(A, B);
                 System.out.println ("A n B: "+interseccion.mostrarConjunto());
            } else if (option == 3) {
            	Conjunto<String> diferenciaAB =new Conjunto<String>();
            	diferenciaAB.diferencia(A, B);
                System.out.println ("A-B : "+diferenciaAB.mostrarConjunto());
                Conjunto<String> diferenciaBA =new Conjunto<String>();
                diferenciaBA.diferencia(B, A);
                System.out.println ("B-A : "+diferenciaBA.mostrarConjunto());
                
            }
            else if(option==4) {
            	 Conjunto<String> diferenciaS =new Conjunto<String>();
                 diferenciaS.diferenciaSimetrica(A,B);
                 System.out.println ("Diferencia simetrica: "+diferenciaS.mostrarConjunto());
            }
            else if (option >= 4 || option <= -1) {
                System.out.println("Porfavor, dijite una opcion correcta.");
            }
        }
	}
    
}
