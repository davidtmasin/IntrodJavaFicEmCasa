package IntrodJavaFicEmCasa;

import java.util.ArrayList;

public class UsandoArrayList {

	public static void main(String[] args) {
	    
	    ArrayList lista = new ArrayList();
		
		lista.add("Jubileu");
		lista.add("Jailson Mendes");
		lista.add("Paulo Guina");
		lista.add(24);
		lista.add(11);
		lista.remove(4);
		
		System.out.println(lista.size());
		for(int i = 0; i < lista.size(); i++){
		    
		    System.out.println(lista.get(i));
		}
	}
	
}
