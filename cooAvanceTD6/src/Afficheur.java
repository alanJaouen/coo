/**
 * 
 */
/**
 * @author dominique 
 * Receveur
 *
 */
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("66543e16-2771-4995-a717-a3e788058a4e")
public class Afficheur {
    @objid ("8a8cc2f9-a9eb-4420-8ccb-a76637fae077")
    private String message;

    @objid ("d3ff2a64-511b-4ee0-97d7-52c821ee6651")
    public Afficheur() {
    }

    @objid ("3c35fb41-91b4-4e4a-b88d-958b24043a72")
    public void setMessage(String unMessage) {
        this.message = unMessage ;
    }

    @objid ("326241e3-164f-40b3-9b73-02b7aa929c70")
    public void affiche() {
        System.out.println(this.message) ;
    }

}
