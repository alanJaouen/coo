import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("195a4b26-babf-433c-875f-aace18716e69")
public abstract class Voiture
{
	@objid ("cc0e0962-6cf2-4eb2-8ebc-e60cc5148ebd")
	private String nom ;
	
	@objid ("f5a106eb-e43d-417b-8782-5db9ca213e95")
	private int numero ;
	
	@objid ("d5727ba1-761e-4d29-80b7-d0bfa892ff22")
	private float masse ;
	
	
	@objid ("cf11b273-4c68-4e7b-928e-a850eb3b6a9e")
	public Voiture()
	{
	}
	
	/**
	 *
	 */
	public Voiture(Voiture v)
	{
		this.nom = v.getNom() ;
		this.numero = v.getNumero() ;
		this.masse = v.getMasse() ;
	}
	
	@objid ("7f3559f8-39cd-400f-b79f-12610c64efdd")
	public Voiture(int numero, String nom, float masse)
	{
		this.numero = numero ;
		this.nom = nom ;
		this.masse = masse ;
	}
	
	@objid ("e832b274-d9ba-421a-82ab-c6222e5ca77c")
	public abstract int prix() ;
	
	public int getNumero()
	{
		return this.numero ;
	}
	
	public String getNom()
	{
		return this.nom ;
	}
	
	public float getMasse()
	{
		return this.masse ;
	}
	
	@objid ("03739065-a4f5-4bf8-adcc-a044d354f20d")
	@Override
	public String toString()
	{
		return "modele = " + this.getNom() + " n°" + this.getNumero() + " poids = " + this.getMasse() + "t (" +	this.prix() + "€)" ;
	}
	
}
// fin classe Voiture
