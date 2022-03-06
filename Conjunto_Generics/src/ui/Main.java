package ui;
import model.*;

import java.util.Scanner;

public class Main {
    public static Calculator option = new Calculator();
    public static Scanner sc;
    public static void main(String[] args) {
    	sc=new Scanner(System.in);
    	menu();
    }
    
    public static int message_menu() {
        int option;
        System.out.println("*********MENU**********" + "\n1.Union               *" + "\n2.Interseccion        *" + "\n3.Diferencia simetrica*" + "\n0.salir               *" + "\n***********************");
        option = sc.nextInt();
        return option;
    }
    
    public static void menu() {

        int option=1;
        

        while (option != 0) {
        	option = message_menu();
            if (option == 1) {
                //union(a, b);
            } else if (option == 2) {
               // intersection(a, b);
            } else if (option == 3) {
              //  diferencia_1(a, b);
            } else if (option >= 4 || option <= -1) {
                System.out.println("Porfavor, dijite una opcion correcta.");
            }
        }
	}
    
}
