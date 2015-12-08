import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bd304859-dabe-4cc7-b52a-1b5909ce374a")
public class NoeudSujetObservateur extends NoeudSujet implements Observateur {
	
    @objid ("710072f1-23df-405e-afc4-edbf684a7c04")
    public NoeudSujetObservateur(ArrayList<Sujet> s,String nom, int valeur, int capacite) {
    	super(nom, valeur, capacite) ;
		
			for (int i = 0 ; i < s.size(); i++)
			{
				s.get(i).setObservateur(this) ;
			}
    }

    @objid ("26e63f1c-fa3a-43c6-94f4-ec173372d40d")
    public void actualiser(int valeur) {
    	this.majValeur(this.getValeur()+(valeur*this.getCapacite()));
		this.notifierObservateur() ;
    }

}
