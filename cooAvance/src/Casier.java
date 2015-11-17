
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("efc5ead0-bc1a-4ba5-93f6-107e7c410f15")
public class Casier {
	
	public int n;
	
	public Object[] list;
	
	public Casier(int n)
	{
		super();
		this.n=n;
		this.list= new Object[n];
		
	}
	
	public int nbCases()
	{
		return n;
	}
	
	public void prend_Objet(Objet e, int i)
	{
		this.list[i]=e;
	}
	
	public Objet libere_Objet(int i)
	{
		Objet o = (Objet) list[i];
		this.list[i]=null;
		return o;
	}
	
	public String affiche()
	{
		String str="";
		for(int i=0; i<n;i++)
		{
			if(this.list[i] instanceof Objet)
				str+="O";
			else if(this.list[i] instanceof Drone)
				str+="D";
			else if(this.list[i] instanceof AutoTracteur)
				str+="A";
			else
				str+=" ";
		}
		return str;
	}
}
