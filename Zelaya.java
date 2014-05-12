import java.util.Scanner;
public class Zelaya {

	public static void main(String[] args){
	Scanner s = new Scanner (System.in);
	System .out.print("The Hangover");
	System.out.println ("Ingrese una calificacion)(1,2,3,4,5)");
	int calificacion = s.nextInt();
	
	switch (calificacion)
	{
	case 1: 
		System.out.println("Pesima");
	break;
	case 2:
		System.out.println("Mala");
		break;
	case 3:
		System.out.print("Regular");
	break;
	case 4:
		System.out.print("Buena");
		break;
	case 5:
		System.out.print("Excelente");
		break;
		
	}
	}
	
	
	
	
	}
