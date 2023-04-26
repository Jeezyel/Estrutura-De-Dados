package unitins;

public class Laboratorio {

	public static void main(String[] args) {
		
		System.out.print(Laboratorio.calculoDePotencia(2, 4));
		
	}
	// RECURSIVIDADE 
	public static Integer calculoDePotencia (Integer numero, Integer potenciaDoNumero) {
		
		if(potenciaDoNumero == 1) {
			return numero;
		}
		
		// PROBLEMAS ESTAVA DANDO PUCA MEMORIA N SEI PQ AI LENBREI QUE N TINHA DIMINUIDO O potenciaDoNumero 
		return (numero * Laboratorio.calculoDePotencia(numero, --potenciaDoNumero));
		
		//potenciaDoNumero--;
		//--potenciaDoNumero;
	}
}
