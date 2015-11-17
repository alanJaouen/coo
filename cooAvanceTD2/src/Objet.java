
public class Objet {
	
	public String nom;
	
	public int poid;
	
	public Objet(String unNom, int unPoid)
	{
		super();
		this.nom=unNom;
		this.poid=unPoid;
	}

	@Override
	public String toString() {
		return "Objet [nom=" + nom + ", poid=" + poid + "]";
	}

	public String getNom() {
		return nom;
	}

	public int getPoid() {
		return poid;
	}
}
