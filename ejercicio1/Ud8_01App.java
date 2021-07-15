package ejercicio1;

public class Ud8_01App {

	public static void main(String[] args) {
		
		Objetosejercicio1 persona1 = new Objetosejercicio1();
		
		Objetosejercicio1 persona2 = new Objetosejercicio1("Eduardo", 14, 'M');
		
		Objetosejercicio1 persona3 = new Objetosejercicio1("Pedro", 22, "9999999F", 'M', 45, 55);
		
		System.out.println(persona2.getNombre());
		System.out.println(persona3.getNombre());
		
		persona1.setNombre("Fran");
		
		System.out.println(persona1.getNombre());

	}

}
