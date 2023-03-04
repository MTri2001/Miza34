/**
* Ime datoteke: MizaInterface.java
* @author  Matic Trilar
*/
	
/** Deklariramo javni razred MizaInterface */
public interface MizaInterface{
	public void spremeniD(int dX, int vY) throws NemogocaSprembaError;
	public float cena();
	public float teza();
}