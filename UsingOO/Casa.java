package UsingOO;

public class Casa {
	
	private int numPortas;
	private int numJanelas;
	private int numComodos;
	private double valorCompra;
	private String endereco;
	private String corCasa;
	
	//Construtor padrão
	public Casa() {}
	
	//Construtor com todos os atributos
	public Casa(int numPortas, int numJanelas, int numComodos, double valorCompra, String endereco, String corCasa) {
		this.numPortas = numPortas;
		this.numJanelas = numJanelas;
		this.numComodos = numComodos;
		this.valorCompra = valorCompra;
		this.endereco = endereco;
		this.corCasa = corCasa;
	}
	
	//Construtor com alguns atributos
	public Casa(int numComodos, double valorCompra, String endereco, String corCasa) {
		this.numComodos = numComodos;
		this.valorCompra = valorCompra;
		this.endereco = endereco;
		this.corCasa = corCasa;
	}
	

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	public void addPorta() {
		this.numPortas++;
	}
	
	public void addVariasPortas(int qtdePorta) {
		this.numPortas+=qtdePorta;
	}

	public int getNumJanelas() {
		return numJanelas;
	}

	public void setNumJanelas(int numJanelas) {
		this.numJanelas = numJanelas;
	}

	public int getNumComodos() {
		return numComodos;
	}

	public void setNumComodos(int numComodos) {
		this.numComodos = numComodos;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public String getEndereco() {
		return endereco;
	}
	  
	//Escopo + tipo de retorno + nome + parâmetros
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCorCasa() {
		return corCasa;
	}

	public void setCorCasa(String corCasa) {
		this.corCasa = corCasa;
	}

	@Override
	public String toString() {
		return "A casa possui "+ numPortas + " portas, " + numJanelas + " janelas e " + numComodos + " cômodos.\n"
				+ "Seu valor de compra é de R$" + valorCompra + ", estando situada no endereco " + endereco + " e sua cor é " + corCasa;
	}
	
	

}
