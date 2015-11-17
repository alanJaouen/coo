import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b45d8e69-a8a8-44c7-8028-31b8d413f35e")
public abstract class Voiture {
    @objid ("0fdba40c-55df-4fa2-b827-11ae998065c7")
    public String model;

    @objid ("a483c9cf-de3b-466f-95c9-565ab8075795")
    public float masse;

    @objid ("c20bd213-3dcb-4a76-8d5d-7e0183d3dff0")
    public int numero;

    @objid ("68dbbeb3-f856-4421-be5a-cc6e1864c148")
    public abstract int prix();

    @objid ("6eacfa4a-0fa5-4061-b24c-ed3eb0a422b8")
    public Voiture() {
    }

    @objid ("489b852d-b24b-4d8b-bc77-eb317d02c925")
    public Voiture(String modele) {
    }

    @objid ("72cd4f36-bbf7-46be-a2f1-c41ca51d0eba")
    public String toString() {
    }

}
