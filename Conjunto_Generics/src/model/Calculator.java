package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Calculator implements IConjunto<String> {
    
    static Scanner sc = new Scanner(System.in);
    public Set<String> nameSet() {

        String conjunto1 = "";
        System.out.println("Ingrese los elementos del conjunto (separados por comas)");
        conjunto1 = sc.nextLine();
        String[] partsa = conjunto1.split(",");
        Set<String> a = new HashSet<String>();
        for (int i = 0; i < partsa.length; i++) {
            a.addAll(Arrays.asList(new String[]{partsa[i]}));
        }
        return a;
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


    

    

}
