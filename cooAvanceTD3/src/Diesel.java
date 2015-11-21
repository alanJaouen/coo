import com.modeliosoft.modelio.javadesigner.annotations.objid;


@objid ("06e6a946-9101-419c-a410-3ac8a07b4225")
public class Diesel extends Motorisation
{
	@objid ("1818e264-d2f1-45d5-bc80-66dc2825597b")
	private static final int prixMotorisationDiesel = 1500 ;
	
	public Diesel(Voiture uneVoiture, float uneMasseMoteur, float uneForceMoteur)
	{
		super(uneVoiture, uneMasseMoteur, uneForceMoteur) ;
	}
	
	
	@objid ("15f59737-69c9-4c5c-a4a8-ee494ccc7139")
	public int prix()
	{
		return Diesel.prixMotorisationDiesel + this.getVoiture().prix();
	}
	
	@objid ("366d1aa7-7e24-4f68-aada-adfbe804c1c9")
	public String toString()
	{
		return this.getVoiture() + super.toString() + " diesel (" + Diesel.prixMotorisationDiesel + "€)";
	}
}