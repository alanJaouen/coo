import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e6633a6d-1670-4459-9da8-a872ae76ecf6")
public class UsineJetBoeing extends UsineJet {
    @objid ("3577a72b-2b50-4332-8304-73d3b50c9ba0")
    public Jet fabriqueJet(String modele, String marque) {
    	Jet j= null;
    	Fuselage f= null;
    	ArrayList<Reacteur> r = new ArrayList<Reacteur>();
    	
    	
    	if(modele.equals("737"))
    	{
    		f= new Fuselage(28,110);
    		for(int i=0;i<2;i++)
    		{
    			if(marque.equals("RollRoyce"))
    				r.add(new RollRoyce(4,8));
    			else if(marque.equals("Trent"))
    				r.add(new RollRoyce(7,9));
    		}
    		
    		j=new B737(f,r);
    	}	
    	
    	else if(modele.equals("747"))
    	{
    		f= new Fuselage(100,375);
    		for(int i=0;i<4;i++)
    		{
    			if(marque.equals("RollRoyce"))
    				r.add(new RollRoyce(20,38));
    			else if(marque.equals("Trent"))
    				r.add(new RollRoyce(22,41));
    		}
    		
    		j=new B747(f,r);
    	}	
    	
    	
    	return j;
    }

    @objid ("a714c70b-2dc7-48f6-9a4d-b8bc4267ebb5")
    public UsineJetBoeing(String ville) {
    	super("Boeing",ville);
    }

}
