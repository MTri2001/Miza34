/**
* Ime datoteke: ZlozljivaMiza.java
* @author  Matic Trilar
*/
	
/** Deklariramo javni razred ZlozljivaMiza */
public class ZlozljivaMiza extends Miza{
	
	private boolean jeZlozena;
	/**
   * Javno metoda za podaljšanje mize 
   * @param dolzina int za koliko se spremeni dolžina zložene mize
   * @param meaterial String izpise material zložene mize
   * @param visina int za koliko se spremeni VIŠINA zložene mize
   * @return boolean Ali so je zložena miza zložena ali razširjena
   */
	public ZlozljivaMiza(int dolzina, int visina, String material, boolean jeZlozena){
		
		super(dolzina, visina, material);
		this.jeZlozena = jeZlozena;
	}
	/**
	* Javno metoda za zlozi
    * @return void da je predalna miza zložena
   */
	public void zlozi(){
		
		this.jeZlozena = true;
		System.out.println("Miza je zložena");
		
	}
	/**
	* Javno metoda za rasširi
   * @return void da je predalna miza razširjena
   */
	public void razsiri(){
		
		this.jeZlozena = false;
		System.out.println("Miza je razširjena");
		
	}
	
}