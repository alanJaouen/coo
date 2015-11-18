import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5462b322-5f4b-4672-b8a6-54aabc18ad1f")
public abstract class Voiture {
    @objid ("a3219f2f-c5e1-4487-a61b-db88bb516a4c")
    public String model;

    @objid ("0930d5bf-0efa-41e5-9299-889da6f012b1")
    public float masse;

    @objid ("d7e986b8-3cf8-4e9a-96e1-bc6ef16ee9f4")
    public int numero;

    @objid ("110eee2e-fa51-414e-b037-a7da7afe2734")
    public abstract int prix();

    @objid ("d052b740-69f8-4992-8ad8-a47edaaba999")
    public String toString() {
    }

    @objid ("6ff54ac5-64df-4c68-bc5b-ab21de3a6ffb")
    public Voiture() {
    }

    @objid ("66e904e5-fbc2-41c3-af41-2432e7162207")
    public Voiture(String model) {
    }

}
