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
		System.out.println(newElement);
		elemento.add(newElement);
	}
	
	public boolean elementoRepetido(T element) {
		boolean repetido=false;
		for(int i=0;i<elemento.size()&&!repetido;i++ ) {
			if(elemento.get(i)==element) {
				repetido=true;
			}
		}
		return repetido;
	}
	
	

	@Override
	public void union(IConjunto<T> a, IConjunto<T> b) {
		for(int i=0;i<a.getElemento().size();i++) {
			if(!elementoRepetido(a.getElemento().get(i))) {
				addElements(a.getElemento().get(i));
			}
		}
		for(int i=0;i<b.getElemento().size();i++) {
			if(!elementoRepetido(b.getElemento().get(i))) {
				addElements(b.getElemento().get(i));
			}
		}
	}

	@Override
	public void intersection(IConjunto<T> a, IConjunto<T> b) {
		for(int i=0;i<a.getElemento().size();i++) {
			for(int j=0;j<b.getElemento().size();j++) {
				if(a.getElemento().get(i)==b.getElemento().get(j)) {
					if(!elementoRepetido(a.getElemento().get(i))) {
						addElements(a.getElemento().get(i));
					}
				}
			}
		}
	}

	@Override
	public void diferencia(IConjunto<T> a, IConjunto<T> b) {
		// TODO Auto-generated method stub
		Conjunto<T> universal = new Conjunto<T>();
		universal.union(a, b);
		for(int i=0;i<universal.getElemento().size();i++) {
			if(a.getElemento().contains(universal)&&!b.getElemento().contains(universal)) {
				if(!elementoRepetido(a.getElemento().get(i))) {
					addElements(a.getElemento().get(i));
				}
			}
		}
	}

	@Override
	public void diferenciaSimetrica(IConjunto<T> a, IConjunto<T> b) {
		union(a, b);
		for(int i=0;i<a.getElemento().size();i++) {
			for(int j=0;j<b.getElemento().size();j++) {
				if(a.getElemento().get(i)==b.getElemento().get(j)) {
					elemento.remove(a.getElemento().get(i));
				}
			}
		}	
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
