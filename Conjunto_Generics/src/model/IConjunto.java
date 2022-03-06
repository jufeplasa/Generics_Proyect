package model;

import java.util.ArrayList;

public interface IConjunto<T>  {
    public void createSet();
    public void addElements(T newElement);
    public void union(IConjunto<T> a,IConjunto<T> b); 
    public void intersection(IConjunto<T> a, IConjunto<T> b);
    public void diferencia(IConjunto<T> a, IConjunto<T> b);
    public void diferenciaSimetrica(IConjunto<T> a, IConjunto<T> b);
    public String mostrarConjunto();
    public ArrayList<T> getElemento();
    
}
