import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7b2bb344-cc79-4ebe-a09a-3f8d72fd6434")
public class Noeud {
    @objid ("41db5a92-5f71-4fbb-907f-51adc4e0126b")
    private String nom;

    @objid ("8a046468-e029-4eaf-a0c5-dde2c62e9153")
    private int valeur;

    @objid ("9042c8c4-1b22-4332-8f5b-0a623eb1d0b9")
    private int capacite;
    
    public Noeud(String unNom, int uneValeur, int uneCapacite) 
	{
		this.setNom(unNom);
		this.majValeur(uneValeur);
		this.setCapacite(uneCapacite);
	}

    @objid ("5f9f3032-903c-4bee-a65e-28e07c2f4880")
    public String getNom() {
        return this.nom;
    }

    @objid ("88f81e94-4218-4d3f-8db1-c4d4decb1b36")
    public int getValeur() {
    	return this.valeur;
    }

    @objid ("fd6ccaae-b1d6-48a1-9fd3-e2aecf0d8647")
    public int getCapacite() {
    	return this.capacite;
    }

    @objid ("dc2e6b4a-3a6f-4892-b627-5c561e377d31")
    public void setNom(String value) {
    	this.nom = value;
    }

    @objid ("a3c3d10f-0417-43ed-a61c-af4f97161831")
	public void majValeur(int value) {
		this.valeur = value;
	}



    public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Noeud [nom=" + nom + ", valeur=" + valeur + ", capacite=" + capacite + "]";
	}

	@objid ("c65d0106-e8f2-4a20-ad03-17f9881adcc1")
    public void setCapacite(int value) {
    	this.capacite = value;
    }

}
