import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4273d1a2-aa25-4499-aebc-cb882ef96bc6")
public class NoeudObservateur extends Noeud implements Observateur {
    @objid ("b0deec29-4520-4982-9bc3-345fde302239")
    public NoeudObservateur(ArrayList<Sujet> s,String nom, int valeur, int capacite) {
    	super(nom, valeur, capacite) ;
		
		for (int i = 0 ; i < s.size() ; i++)
		{	
		s.get(i).setObservateur(this) ;
		}	
    }

    @objid ("195f3ddb-bec4-4eb8-a4ff-32ef8396c63d")
    public void actualiser(int valeur) {
		this.majValeur(valeur);
    }

}
