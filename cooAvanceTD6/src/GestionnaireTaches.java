import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("572982ca-2ce7-4fc9-8c82-5c0eefd231f9")
public class GestionnaireTaches {
    @objid ("367847b8-9426-41ab-8cf9-9e030a03315d")
    private ArrayList<Commande> taches;


    @objid ("38004a7c-a7d8-4db5-8ac4-d64c16a2bb35")
    public GestionnaireTaches() {
        this.taches = new ArrayList<Commande>() ;
    }

    @objid ("244ff5b1-8b0a-4d0b-8512-3d1738934599")
    public void retirerTache(Commande t) throws Exception {
        if (!this.taches.remove(t))
            throw new Exception("impossible de retirer la commande : pas de commande " + t) ;
    }


    @objid ("7cd4bd05-cc58-46ab-9a17-27fdf1b1e74f")
    public void executerLaTache(Commande t) {
        int i = this.taches.indexOf(t) ;
        
        if (i >= 0)    
            this.taches.get(i).executer() ;
    }

    @objid ("83fa1415-3da5-4146-ad10-d189990cc4d8")
    public void executerUneTache() {
        if (!this.taches.isEmpty())
        {
            this.taches.get(0).executer() ;
        }
    }

    @objid ("d6adcabb-ca0c-43e9-83ba-7b334cf9024c")
    public void executerToutesTaches() {
        while(!this.taches.isEmpty())
        {
            this.taches.remove(0).executer() ;
        }
    }

    @objid ("2a816f68-b8cd-4db7-8934-0c257ee3f9a8")
    public void ajouterTache(Commande c1) {
        this.taches.add(c1);
    }

}