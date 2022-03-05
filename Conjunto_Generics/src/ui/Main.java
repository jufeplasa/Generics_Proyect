package ui;
import model.*;

import java.util.Set;

public class Main {
    static Calculator option = new Calculator();
    
    public static void main(String[] args) {
        Set<String> a = option.nameSet();
        Set<String> b = option.nameSet();
        option.menu(a, b);
    }
    
}
