package model;

import java.util.ArrayList;

public class Conjunto<T> implements IConjunto<T> {

	private ArrayList<T> elemento;


	public Conjunto (){
		
	}

	@Override
	public void createSet() {
		elemento = new ArrayList<T>();
	}

	@Override
	public void addElements(T newElement) {
		elemento.add(newElement);
	}

	public T union(Conjunto<T> a) {
		
		for(int i=0;i<a.getElemento().size();i++) {
			
		}
		return null;
	}

	@Override
	public T intersection(IConjunto<T> a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T diferencia(IConjunto<T> a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T diferenciaSimetrica(IConjunto<T> a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mostrarConjunto() {
		String elementos ="[ ";
		for(int i=0;i<elemento.size();i++) {
			if(elemento.get(i)!=null) {
				elementos+=elemento.get(i)+" ";
				if(i<elemento.size()&&elemento.get(i)!=null) {
					elementos+=", ";
				}
			}
		}
		elementos =" ]";
		return elementos;
	}

	public ArrayList<T> getElemento() {
		return elemento;
	}
	
	public void setElemento(ArrayList<T> elemento) {
		this.elemento = elemento;
	}



}
