import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("56644127-3f22-4e44-a96f-a4f4f15a3693")
public class UsineJetAirbus extends UsineJet {
    @objid ("2235d55c-7656-4754-b868-a6864b083607")
    public Jet fabriqueJet(String modele, String marque) {
    	Jet j= null;
    	Fuselage f= null;
    	ArrayList<Reacteur> r = new ArrayList<Reacteur>();
    	
    	
    	if(modele.equals("320"))
    	{
    		f= new Fuselage(30,120);
    		for(int i=0;i<2;i++)
    		{
    			if(marque.equals("RollRoyce"))
    				r.add(new RollRoyce(5,10));
    			else if(marque.equals("Trent"))
    				r.add(new RollRoyce(6,9));
    		}
    		
    		j=new A320(f,r);
    	}	
    	
    	else if(modele.equals("380"))
    	{
    		f= new Fuselage(110,550);
    		for(int i=0;i<4;i++)
    		{
    			if(marque.equals("RollRoyce"))
    				r.add(new RollRoyce(8,12));
    			else if(marque.equals("Trent"))
    				r.add(new RollRoyce(9,13));
    		}
    		
    		j=new A380(f,r);
    	}	
    	
    	
    	return j;
    }

    @objid ("3541fca9-5f57-4bee-a37e-0cece0f23fd8")
    public UsineJetAirbus(String ville) {
    	super("Airbus",ville);
    }

}
