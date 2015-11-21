import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a4710fcb-ad49-4373-b797-03a5e25d0e11")
public abstract class Motorisation extends Voiture
{
	@objid ("f567c083-cdb6-4c26-b749-394a95b14181")
	private float masse ;
	
	@objid ("73b7c3b3-3778-44ad-9ad2-a7d5c6c6cc72")
	private float force ;
	
	@objid ("edd36889-6cd3-4fd1-9010-2a869c3d9140")
	private Voiture voiture ;
	
	public Motorisation(Voiture voiture, float masse, float force)
	{
		super() ;
		this.masse = masse ;
		this.force = force ;
		this.voiture = voiture ;
	}
	
	public abstract int prix() ;
	

	public float getMasseMoteur()
	{
		return this.masse ;
	}
	
	public float getForceMoteur()
	{
		return this.force ;
	}

	public float getMasse()
	{
		return this.getMasseMoteur() + this.getVoiture().getMasse() ;
	}
	
	@objid ("09c7efe5-01dd-4cf7-8184-68a3ebc86154")
	public Voiture getVoiture()
	{
		return this.voiture ;
	}
	
	@objid ("a020ef71-5eb3-42bd-be74-3299560c66bc")
	public float acceleration()
	{
		return this.getForceMoteur() / (this.getVoiture().getMasse() + this.getMasse()) ;
	}
	
	
	@objid ("e48d0cfc-13af-471c-bee4-39aee2f48af0")
	public float distanceParcourue(float t)
	{
		return 0.5f * this.acceleration() * t * t ;
	}
	
	public String getNom()
	{
		return this.getVoiture().getNom() ;
	}
	
	public String toString()
	{
		return " moteur : poids = " + this.getMasseMoteur() + "t, force = " + this.getForceMoteur() + "N" ;
	}
	
}	