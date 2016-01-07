import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9d123eee-dc34-4e30-8583-5e126db1ca29")
public class NoeudSujet extends Noeud implements Sujet {
	
	private ArrayList<Observateur> observateurs ; 
	
    @objid ("d6283a04-ed22-482a-bf08-71c1dc530073")
    public NoeudSujet(String nom, int valeur, int capacite) {
    	super(nom, valeur, capacite) ;
		this.observateurs = new ArrayList<Observateur>() ;
    }

   
	public void enregistrerObservateur(Observateur o) 
	{
		this.observateurs.add(o) ;
	}
	
    
	public void supprimerObservateur(Observateur o)
	{
		this.observateurs.remove(o) ;
	}
	
	
	public void notifierObservateur()
	{
		for(int i = 0 ; i < this.observateurs.size(); i++)
		{
			this.observateurs.get(i).actualiser(this.getValeur());
		}
	}

    @objid ("2eeb74c8-79c2-4e7e-8b3d-b924ef85eafc")
    public void changementValeur(int valeur) {
    	this.majValeur(valeur);
    	this.notifierObservateur() ;
    	
    }

	@Override
	public Observateur getObservateur() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setObservateur(Observateur value) {
		this.observateurs.add(value);
		
	}

	


}
