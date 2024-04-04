package Practica1;
import java.util.Scanner;

/**
 * Clase Notas
 * Declara las variables y el objeto Scanner para la entrada de notas
 * @author Carlos Valles
 * @version 2.0
 * @since 02.04.24
 * 
 */
public class notas {
	//declaramos la variables que nos hacen falta
	/**
	 * Variables para introducir las notas
	 */
	double nota1, nota2, nota3;
	
	/**
	 * Variables que calculan el porcentaje de las notas
	 */
	double acu1, acu2, acu3, def;
	

	/**
	 * Se utiliza Scanner para que el usuario inserte las notas
	 */
	Scanner entradaDatos = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
	
	/**
	 * Metodo para que el usuario inserte las notas
	 */
	
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		nota1= entradaDatos.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		nota2= entradaDatos.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		nota3= entradaDatos.nextDouble();
		
	
	}
	
	/**
	 * Metodo que comprueba las notas introducidas
	 * No se pueden introducir notas mayores a 10
	 */
	public void comprobarcion(){
		
		if (nota1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (nota2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (nota3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	/**
	 * Metodo para calcular las notas segun su porcentaje total
	 * Tambien calcula la suma de todas
	 */
	
	public void Calculonotas() {
		acu1= nota1*0.40;
		acu2 = nota2 * 0.40;
		acu3 = nota3 * 0.20;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	
	/**
	 *Metodo para mostar las notas y la nota defitiniva
	 */
	
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		/**
		 * Muestra las notas introducidas por el usuario
		 */
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + nota1);
		System.out.println(" nota2 = " + nota2);
		System.out.println(" nota3 = " + nota3);
		
		/**
		 * Muestra el porcentaje de cada nota
		 */
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		/**
		 * Muestra la nota final
		 */
		System.out.println(" su nota final es = "+ def);
		
	}
	
	/**
	 * Metodo que comprueba si el alumno es aprobado o suspendido
	 */

	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		/**
		 * Se instancia la clase Notas y se usan sus metodos
		 * @param args
		 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
