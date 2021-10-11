package UsingOO;

public class TreinandoConstrutoresMetodos {
	public static void main(String [] args) {
		String ender;
		
		Casa casa01 = new Casa(5, 10, 3, 25000, "Rua Cruz Abreu, 751", "Cinza");
		System.out.println(casa01.toString());
		
		ender = casa01.getEndereco();		
		System.out.println(ender);
		
		casa01.addPorta();		
		System.out.println(casa01.getNumPortas());
		
		casa01.addVariasPortas(6);
		System.out.println(casa01.getNumPortas());
		
		
	}

}
