import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("911a65ae-43de-495c-9441-6091e0e14ec5")
public abstract class UsineJet {
    @objid ("15f30590-dcd8-468a-b64d-eab45b90b5d7")
    private String constructeur;

    @objid ("2cd7bb24-5688-4f94-81e5-287f04014704")
    private String ville;

    @Override
	public String toString() {
		return "UsineJet [constructeur=" + constructeur + ", ville=" + ville + "]";
	}

    @objid ("8c81686c-0098-4dda-977e-1c32354405b8")
    public abstract Jet fabriqueJet(String modele, String marque);

    @objid ("3ced41f8-30ca-4eb8-bc67-4a95f584d14c")
	public UsineJet(String constructeur, String ville) {
		super();
		this.constructeur = constructeur;
		this.ville = ville;
	}

    


}
