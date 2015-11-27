import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3c883d5a-d7f7-41bd-b4e5-d249744e545e")
public class Reacteur {
    @objid ("6be58767-f0da-4488-9a47-d0204f058f1b")
    private String marque;

    @objid ("115c2793-c4fb-4b8e-ab63-5cedf67c70c5")
    private int poids;

    @objid ("17fb6189-12a1-41cb-9cbe-f548b9229a99")
    private int poussee;

    @Override
	public String toString() {
		return "Reacteur [marque=" + marque + ", poids=" + poids + ", poussee=" + poussee + "]";
	}

    public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPoids() {
		return this.poids;
	}
	
	@objid ("a4ba911a-c8df-48eb-b070-7f31a2dbb0f6")
	public Reacteur(String marque, int poids, int poussee) {
		super();
		this.marque = marque;
		this.poids = poids;
		this.poussee = poussee;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getPoussee() {
		return this.poussee;
	}

	public void setPoussee(int poussee) {
		this.poussee = poussee;
	}
}
