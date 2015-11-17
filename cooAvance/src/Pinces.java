import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("365ed00c-ab30-4124-89ce-bc789721f2b2")
public class Pinces implements Manipuler {
    @objid ("144bf9ea-a6ab-484a-866a-cb3eb5a6b4d4")
    public void saisir() {
    	System.out.println("je serre la pince");
    }

    @objid ("eb9c4f3a-b783-48db-a62f-8dc6bff468b7")
    public void relacher() {
    	System.out.println("je deserre la pince");
    }

}
