import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("504e14cf-ebc5-4cfd-92e7-bb217b355c2b")
public class Drone extends Robot {
	
	public Drone(Casier unCasier) {
		super(unCasier);
		super.setDep(new Voler());
		super.setManipuler(new Magnetiser());
	}
}
