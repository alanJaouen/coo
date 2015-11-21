import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9620aceb-1e5f-441d-8e0b-6237f401f026")
public class Abs extends Freinage
{
	@objid ("944d52dc-2958-4ea5-8495-a9fe315cf851")
	private static final int prixABS = 2000 ;
	
	public Abs(Voiture uneVoiture)
	{
		super(uneVoiture) ;
	}
	
	@objid ("944d52dc-2958-4ea5-8495-a9fe315cf851")
	public int prix()
	{
		return Abs.prixABS + this.getVoiture().prix();
	}
	
	@objid ("e49303e5-fa06-497b-89bb-7ed52f03660a")
	public String toString()
	{
		return this.getVoiture() + " + ABS (" + Abs.prixABS + "€)";
	}
}