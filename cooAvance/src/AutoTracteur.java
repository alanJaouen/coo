import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e75e6c46-6660-4993-a9dc-613cd78c6968")
public class AutoTracteur extends Robot {
	
	public AutoTracteur(Casier unCasier) {
		super(unCasier);
		super.setDep(new Rouler());
		super.setManipuler(new Pinces());
	}
	

}
