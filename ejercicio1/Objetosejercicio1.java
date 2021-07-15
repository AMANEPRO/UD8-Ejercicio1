package ejercicio1;

public class Objetosejercicio1 {
	
	private String nombre;
	
	private int edad;
	
	private String DNI;
	
	private char sexo;
	
	private double peso;
	
	private double altura;
	
	final char sex = 'H';

	public Objetosejercicio1() {
		
		this.nombre = "";
		
		this.edad = 0;
		
		this.sexo = sex;
		
		this.peso = 0;
		
		this.altura = 0;
	}
	
	public Objetosejercicio1(String nombre, int edad, char sexo) {
	
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.sexo = sexo;
		
		this.peso = 0;
		
		this.altura = 0;
	}
	
		
	public Objetosejercicio1(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.DNI = DNI;
		
		this.sexo = sexo;
		
		this.peso = peso;
		
		this.altura = altura;
	}
	
	public String getNombre() {
	
		return nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	
	}

	
	public int getEdad() {
	
		return edad;
	
	}

	public void setEdad(int edad) {

		this.edad = edad;
	
	}
	
	public String getDNI() {
	
		return DNI;
	
	}

	public void setDNI(String dNI) {
	
		DNI = dNI;
	
	}

	public char getSexo() {

		return sexo;
	
	}

	public void setSexo(char sexo) {
	
		this.sexo = sexo;
	
	}

	public double getPeso() {
	
		return peso;
	
	}

	public void setPeso(double peso) {
	
		this.peso = peso;
	
	}

	public double getAltura() {
	
		return altura;
	
	}

	public void setAltura(double altura) {
	
		this.altura = altura;
	
	}

}
