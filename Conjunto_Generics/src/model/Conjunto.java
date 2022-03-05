package model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public interface Conjunto {
    
    public Set<String> nameSet();
    
    public void union(Set<String> a, Set<String> b); 
    public void intersection(Set<String> a, Set<String> b);
    public void diferencia_1(Set<String> a, Set<String> b);
    
    
    public void menu(Set<String> a, Set<String> b);
    public int message_menu();
    
}
