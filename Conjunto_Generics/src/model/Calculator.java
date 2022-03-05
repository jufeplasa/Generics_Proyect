package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Calculator implements Conjunto {
    static Scanner sc = new Scanner(System.in);
    public Set<String> readInfo_a() {

        String conjunto1 = "";
        System.out.println("Ingrese los datos del conjunto 1:");
        conjunto1 = sc.nextLine();
        String[] partsa = conjunto1.split(",");
        Set<String> a = new HashSet<String>();
        for (int i = 0; i < partsa.length; i++) {
            a.addAll(Arrays.asList(new String[]{partsa[i]}));
        }
        return a;
    }

    //----------------------------------------------------------------
    public Set<String> readInfo_b() {

        String conjunto2 = "";
        System.out.println("Ingrese los datos del conjunto 2:");
        conjunto2 = sc.nextLine();
        String[] partsb = conjunto2.split(",");
        Set<String> b = new HashSet<String>();
        for (int i = 0; i < partsb.length; i++) {
            b.addAll(Arrays.asList(new String[]{partsb[i]}));
        }
        return b;
    }

    public void union(Set<String> a, Set<String> b) {

        Set<String> union = new HashSet<String>(a);
        union.addAll(b);
        System.out.println("Union de los dos conjuntos: " + union + "\n");

    }

    public void diferencia_1(Set<String> a, Set<String> b) {

        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        Set<String> diferencia_a_b = new HashSet<>(a);
        diferencia_a_b.removeAll(intersection);

        Set<String> diferencia_b_a = new HashSet<>(b);
        diferencia_b_a.removeAll(intersection);

        Set<String> union = new HashSet<String>(diferencia_a_b);
        union.addAll(diferencia_b_a);

        System.out.println("Diferencia Simétrica de los dos conjuntos: " + union + "\n");

    }

    public void intersection(Set<String> a, Set<String> b) {

        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Interseccion de los dos conjuntos: " + intersection + "\n");
    }

    public int message_menu() {
        int option;
        System.out.println("*********MENU**********" + "\n1.Union               *" + "\n2.Intersección        *" + "\n3.Diferencia simétrica*" + "\n0.salir               *" + "\n***********************");
        option = sc.nextInt();
        return option;
    }

    public void menu(Set<String> a, Set<String> b) {

        int option;
        option = message_menu();

        while (option != 0) {

            if (option == 1) {
                union(a, b);
                option = message_menu();
            } else if (option == 2) {
                intersection(a, b);
                option = message_menu();
            } else if (option == 3) {
                diferencia_1(a, b);
                option = message_menu();
            } else if (option >= 4 || option <= -1) {
                System.out.println("Porfavor, dijite una opción correcta.");
                option = message_menu();
            }
        }
    }

}
