import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b2b07458-bcc5-4676-b0f1-147a51e8781b")
public class Fuselage {
    @objid ("82ca9c98-6da6-4191-b23f-12e507368dde")
    private int poids;

    @objid ("03a53449-5fb5-4abc-a41e-449a3b51db12")
    private int capacite;

    @Override
	public String toString() {
		return "Fuselage [poids=" + poids + "t , capacite=" + capacite + "]";
	}

    @objid ("d50db0be-199d-4497-acf4-b944f79788ae")
    public Fuselage(int poids, int capacite) {
    	super();
    	this.poids=poids;
    	this.capacite=capacite;
    }

    @objid ("30832725-e8cd-4f25-aab6-3ae4c1bce398")
    public Fuselage() {
    	this(0,0);
    }

	public int getPoids() {
		return this.poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getCapacite() {
		return this.capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

}
