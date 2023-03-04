/**
* Ime datoteke: PredalnaMiza.java
* @author Matic Trilar
*/
	
/** Deklariramo javni razred PredalnaMiza */
public class PredalnaMiza extends Miza{
	//Deklariramo zasebne lastnosti razrede PredalnaMiza
	private String[] predal;
	private int stObjektov;
	private boolean jeZakljenena;
	private int velikostPredala;
	/**
   * Javno metoda za podaljšanje mize 
   * show the usage of various javadoc Tags.
   * @param dolzina int za koliko se spremeni dolžina mize
   * @param meaterial String izpise material predalne mize
   * @param velikost predala int za koliko velikost je predalna mize
   * @param visina int za koliko se spremeni VIŠINA mize
   * @return boolean Ali so je predalna miza zaklenjena
   */
	public PredalnaMiza(int dolzina, int visina, String material, int velikostPredala, boolean jeZakljenena){
		
		super(dolzina, visina, material);
		this.velikostPredala = velikostPredala;
		this.predal = new String[velikostPredala];
		this.jeZakljenena = jeZakljenena;
		this.stObjektov = 0;
	}
	/**
   * Javno metoda za odkleni
   * @return void da je predalna miza odklenjena
   */
	public void odkleni(){
		
		this.jeZakljenena= false;
		System.out.println("Predalna miza je odklenjena");
		
	}
	/**
	* Javno metoda za zakleni
   * @return void da je predalna miza zaklenjena
   */
	public void zakleni(){
		
		this.jeZakljenena = true;
		System.out.println("Predalna miza je zaklenjena");
		
	}
	/**
	* Javno metoda za zakleni
   * @return void izpisuje shranjenih objektov v predalni mizi
   */
	public void shrani(String objekt) throws PolnPredalError {
		if(this.stObjektov ==this.velikostPredala) throw new PolnPredalError();
		
		this.predal[this.stObjektov] = objekt;
		this.stObjektov ++;
		
		
	}
	
}