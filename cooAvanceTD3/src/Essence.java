import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5c4c5178-7e30-4ca5-8e7b-00fba10a32ce")
public class Essence extends Motorisation
{
	@objid ("dca385f2-9f66-4529-ba0f-2a8a13ba9819")
    private static final int prixMotorisationEssence = 1000 ;
    
    
    public Essence(Voiture uneVoiture, float uneMasseMoteur, float uneForceMoteur)
    {
        super(uneVoiture, uneMasseMoteur, uneForceMoteur) ;
    }
    
    @objid ("c35049a1-251b-426d-a029-7d50f492d614")
    public int prix()
    {
        return Essence.prixMotorisationEssence + this.getVoiture().prix();
    }
    
    @objid ("1d6b30d1-0ddd-4ae6-a8ad-aafd1ea621af")
    public String toString()
    {
        return this.getVoiture() + super.toString() + " essence (" +
             Essence.prixMotorisationEssence + "�)";
    }
}
