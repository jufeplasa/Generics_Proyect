package model;

public interface IConjunto<T>  {
    public void createSet();
    public void addElements(T newElement);
    public T union(Conjunto<T> a); 
    public T intersection(IConjunto<T> a);
    public T diferencia(IConjunto<T> a);
    public T diferenciaSimetrica(IConjunto<T> a);
    public String mostrarConjunto();
    
    
}
