import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("035d37cf-c45e-43be-92be-3c5bfc0a1a2e")
public class CommandeAfficherAuRevoir implements Commande {
    @objid ("a791a2fb-e534-41fd-b7c8-324c237178d9")
    public Afficheur afficheur;

    @objid ("0bc0ab44-fc80-4f4a-906f-0381b3998316")
    public void executer() {
        this.afficheur.setMessage("Au revoir");
        this.afficheur.affiche() ;
    }

    @objid ("55a59851-cef6-4550-9a5a-09f01095a9f4")
    public CommandeAfficherAuRevoir(Afficheur unAfficheur) {
    	super();
        this.afficheur = unAfficheur ;
    }

}