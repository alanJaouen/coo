import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9ee60bcb-5928-4e91-b6bb-c77218497726")
public class Motorisation extends Voiture {
    @objid ("4a54425e-0755-4919-a56a-33cd1cb54f1a")
    public float masse;

    @objid ("fafb5473-9b19-4700-b13f-b4248b106d18")
    public float force;

    @objid ("507ef2b6-4b3b-43e2-b232-aef808983e55")
    public Voiture voiture;

    @objid ("37b2da63-0180-4629-9b2c-3401ce6d8c17")
    public Voiture getVoiture() {
    }

    @objid ("59a460d4-2ce4-450a-a809-244da6edc33e")
    public float acceleration() {
    }

    @objid ("db822376-d7d2-48ed-a22e-54b2e3377d2f")
    public float distanceParcourue(int n) {
    }

    @objid ("369f05f2-5aa2-4848-b6c2-cab5733799b2")
    public Motorisation(Voiture v) {
    }

    @objid ("1cc0c57a-65e6-40e5-b466-07945f3625ff")
    public int prix() {
    }

}
