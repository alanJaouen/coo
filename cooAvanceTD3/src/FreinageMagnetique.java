import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f218eee7-2cb0-4e45-8ee6-1b136ab9763e")
public class FreinageMagnetique extends Freinage
{
	@objid ("ecf73eab-916f-44bd-86cd-cc67de6cd3d9")
	private static final int prixFreinageMagnetique = 2000 ;
	
	/**
	 * initialise Abs avec uneVoiture
	*/
	
	public FreinageMagnetique(Voiture uneVoiture)
	{
		super(uneVoiture) ;
	}
	
	@objid ("93c6a94a-54ef-4677-9ab4-89132e08f098")
	public int prix()
	{
		return FreinageMagnetique.prixFreinageMagnetique + this.getVoiture().prix();
	}
	
	@objid ("f9a1a1e0-d5f0-4f6b-8028-bd8f40244658")
	public String toString()
	{
		return this.getVoiture() + " + freinage magnetique (" + FreinageMagnetique.prixFreinageMagnetique + "�)";
	}
	
	public String getModele()
	{
		return this.getVoiture().getNom() ;
	}
}