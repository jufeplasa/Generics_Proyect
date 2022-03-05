package ui;
import model.*;

import java.util.Set;

public class Main {
    static Calculator option = new Calculator();
    
    public static void main(String[] args) {
        Set<String> a = option.readInfo_a();
        Set<String> b = option.readInfo_a();
        option.menu(a, b);
    }
    
}
