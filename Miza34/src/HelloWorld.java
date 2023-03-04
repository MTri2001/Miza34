import java.util.*;

	/*
			Ime datoteke: Miza.java
			Avtor: Matic Trilar
			Vhodni podatki: /
			Opis: 
			Izhodni 
			:)
	*/

// Deklarariramo javni razred
public class HelloWorld{
	
	
	// Deklarariramo array statično metodo, ki izpisuje informacije mize
	public static ArrayList mize = new ArrayList<Miza>();
	// Deklarariramo javno statično metodo, ki se izvede programa
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Izberemo katero mizo bi izbrali s številkami in potem vnesemo višino, dolžino in material(pa tudi velikost in booleane)
		while(true){
			System.out.println("Izberite tip mize: ");
			System.out.println(" * 1: Navadna miza");
			System.out.println(" * 2: Predalna miza");
			System.out.println(" * 3: Zlozljiva miza");
			System.out.println(" * 4: Koncaj");
			
			System.out.println("Vnesi število tipa mize:");
			int tipMize = scanner.nextInt();
			
			if(tipMize == 1){
				
				
				System.out.print("Vnesi informacije mize(dolzina,višina in material):");
				Miza miza = new Miza(scanner.nextInt(),scanner.nextInt(), scanner.nextLine());
				mize.add(miza);
				
				
				
			}		
			else if(tipMize == 2){
				
				
				System.out.println("Vnesi informacije predalne mize(dolzina,višina in material, velikost predala, ali je zaklenjena):");
				PredalnaMiza miza = new PredalnaMiza(scanner.nextInt(),scanner.nextInt(), scanner.next(),scanner.nextInt(), scanner.nextBoolean());
				mize.add(miza);
				
				
				
			}
			else if(tipMize == 3){
				
				
				System.out.println("Vnesi informacije zložljive mize(dolzina,višina in material, ali je zložena):");
				ZlozljivaMiza miza = new ZlozljivaMiza(scanner.nextInt(),scanner.nextInt(), scanner.next(),scanner.nextBoolean());
				mize.add(miza);
				
				
				
			} else if(tipMize == 4){
				System.out.println("Končaj vnos program");
				break;
			}
			else {
				
				System.out.println("Napaka, izberite še enkrat prosim");
				
				
			}
			
		}
		System.out.println("Vnesene mize: ");
		for(int i=0; i<mize.size(); i++){
			System.out.println(mize.get(i));
		}
		
	}
	
}