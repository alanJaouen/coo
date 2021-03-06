import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2c2ca239-3f9b-4900-9a0f-3e9ccb955898")
public abstract class Freinage extends Voiture
{
	 @objid ("0037fdce-345a-43b7-a12b-1f10e7c62434")
	private Voiture voiture ;
	
	public Freinage(Voiture uneVoiture)
	{
		super() ;
		this.voiture = uneVoiture ;
	}
	
	public abstract int prix() ;
	
		@objid ("06060254-0e1f-46f1-bdf1-c94e242d7ee5")
	public Voiture getVoiture()
	{
		return this.voiture ;
	}
	
	
	public String getModele()
	{
		return this.getVoiture().getNom() ;
	}
	
}