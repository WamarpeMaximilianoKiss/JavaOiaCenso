import java.util.Scanner;

public class NivelUno {
	public static void main(String[] args) {
		int respuesta = 0;
		int fecha,edad,cantEdades;
		String nombre, apellido;
		int[] edades;
		do {
			System.out.println("Ingrese la accion que desea realizar."); 
			System.out.println("1)Devolver utlimos 2 digitos de una fecha");
			System.out.println("2)Consulta mayor de edad");
			System.out.println("3)Obtener nombre y apellido completo");
			System.out.println("4)Contar mayores de edad");
		    Scanner entrada = new Scanner( System.in );
		    respuesta = entrada.nextInt();
		    switch(respuesta) {
		    	case 1:
					System.out.println("Ingrese un año de cuatro digitos que sea mayor o igual a 1900 y menor o igual a 2020:");
					fecha = entrada.nextInt();
					if(fecha>=1900 && fecha<=2020) 
						System.out.println("Año:" + decada(fecha));
					else
						System.out.println("Formato incorrecto");
		    		break;
		    	case 2:
		    		System.out.println("Consulta mayor de edad");
		    		edad=entrada.nextInt();
		    		if(edad>0 && edad<=120)
		    		{
		    			if(esmayor(edad))
				    		System.out.println("Es mayor de edad");
		    			else
				    		System.out.println("Es menor de edad");
		    		}
		    		else
		    			System.out.println("Ingrese una edad entre 0 y 120 años");
		    		break;
		    	case 3:
		    		System.out.println("Ingrese nombre");
		    		nombre = entrada.next();
		    		System.out.println("Ingrese apellido");
		    		apellido = entrada.next();
		    		System.out.println("Su nombre y apellido es: ");
	    			System.out.println(nombrecompleto(apellido, nombre));
		    		break;
		    	case 4:
	    			System.out.println("Ingrese cantidad de elementos en la lista edades");
	    			cantEdades = entrada.nextInt();
	    			edades = new int[cantEdades];
	    			for(int x=0;x<cantEdades;x++) {
		    			System.out.println("["+x+"] Ingrese edad: ");
		    			edades[x] = entrada.nextInt();
	    			}
	    			System.out.println("Cantidad: " + cantidadmayores(edades));
		    		break;
		    	default:
		    		break;
		    }
		}while(respuesta!=0);
		
	}
	public static int decada(int fecha) {
		int d=Math.abs(fecha)%100;
		return d;
	}
	public static boolean esmayor(int edad) {
		if(edad>=18)
			return true;
		else
			return false;
	}
	public static String nombrecompleto(String apellido, String nombre) {
			return apellido + ", " + nombre;
	}
	public static int cantidadmayores(int[] edades) {
		int cantidad=0;
		for(int x=0; x<edades.length;x++) {
			System.out.println(edades[x]);
			if(edades[x]>=18)
				cantidad++;
			
		}
		return cantidad;
	}

}


