import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("90a442df-347d-4eda-bb1a-0d30b702f7c1")
public class CommandeResoudreEquation2 implements Commande {
    @objid ("3cfed7b0-1cee-42b0-aa9f-ff895669f385")
    public Equation2 equation2;

    
	public CommandeResoudreEquation2(Equation2 uneEquation) 
	{
		this.equation2 = uneEquation ;
	}
	
    @objid ("2498e48e-eb89-4e08-a5ee-136efb59b596")
    public void executer() {
    	equation2.init() ;
		equation2.calculeDeterminant() ;
		equation2.calculeRacines();
		equation2.afficheSolutions() ;
    }

}