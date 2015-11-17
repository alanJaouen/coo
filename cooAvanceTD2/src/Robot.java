import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aa205be9-fdda-42a2-bffd-bf547e151fa0")
public class Robot {
    @objid ("dc352d8d-e097-44f7-8e73-ec066b47d8cc")
    public Casier monCasier;

    public int numeroCase;
    
    public Objet monObjet;
    
    @objid ("c35adb39-5c1d-4b17-ae7f-b2801f48d74e")
    public Deplacement deplacement;
    
    public Manipuler manipuler;

    @objid ("02cde7ee-4abd-488d-afad-52eadb9103ba")
    public void executerDeplacement(int numeroCaseArrivee) {
    	System.out.println("je suis en "+this.numeroCase);
    	this.deplacement.seDeplacer();
    	this.monCasier.list[this.numeroCase]=null;
    	this.numeroCase=numeroCaseArrivee;
    	this.monCasier.list[this.numeroCase]=this;
    	System.out.println("je suis maintenant en "+this.numeroCase);
    }

    public Robot(Casier unCasier){
    	super();
    	this.monCasier=unCasier;
    	this.monObjet=null;
    	this.numeroCase=0;
    	this.monCasier.list[0]=this;
    }
    
    @objid ("e52ddf99-da69-4c84-8d83-bcd493058773")
    public void setDep(Deplacement d) {
    	this.deplacement=d;
    }

    @objid ("9624b979-a78f-4094-84e8-1c6003b167f1")
    public void setManipuler(Manipuler m) {
    	this.manipuler=m;
    }

    @objid ("ecb72a10-1b66-49fc-8dc6-6a49aa062df6")
    public void manipulerSaisir() {
    	this.manipuler.saisir();
    	this.monObjet=this.monCasier.libere_Objet(this.numeroCase+1);
    	System.out.println("j'ai saisi: "+this.monObjet);
    }

    @objid ("16bf1c90-d124-40c9-a8a0-81d6e98d3d6b")
    public void manipulerRelacher() {
    	this.manipuler.relacher();
    	this.monCasier.prend_Objet(this.monObjet, this.numeroCase+1);
    	this.monObjet=null;
    }

}
