import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c7a7afb6-bd33-4903-9415-bc6c2223f5e4")
public abstract class Jet {
 

	@objid ("c08d0bc2-0faf-4e99-8659-d3fc016ff2a8")
    public String marque;

	@objid ("114f1ef4-a494-4c5f-ab2a-ab58141c6544")
    public String modele;

    @objid ("ff93ac8d-94eb-46bd-8b14-b6f68f6ed054")
    public Fuselage fuselage;

    @objid ("471b212b-afbf-4c67-9ee8-053d33932e0d")
    public List<Reacteur> reacteur = new ArrayList<Reacteur> ();
    
    @objid ("e0a67e65-66dd-4d7d-a5c6-cd6a3bc7df05")
    public Jet(String marque, String modele, Fuselage fuselage, ArrayList<Reacteur> reacteur) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.fuselage = fuselage;
		this.reacteur = reacteur;
	}
    
    @Override
 	public String toString() {
    	String str="";
    	for(int i=0; i<this.reacteur.size();i++)
    		str+=("\n\t-"+this.reacteur.get(i).toString());
    	
 		return "Jet [marque=" + marque + ", modele=" + modele + ", fuselage=" + fuselage + ", reacteur=" + str
 				+ "]";
 	}

}
