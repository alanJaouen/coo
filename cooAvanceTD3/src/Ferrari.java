import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cb639c47-09a8-4db0-ab5a-c4c5b5482d18")
public class Ferrari extends Voiture
{
	
	public Ferrari(int unNumero, String unModele, float uneMasse)
	{
		super(unNumero, unModele, uneMasse) ;
	}
	
	
	@objid ("5c94a81a-21ee-4734-bc73-f28170177c09")
	public int prix()
	{
		return 250000;
	}
	
}