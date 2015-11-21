import com.modeliosoft.modelio.javadesigner.annotations.objid;
import java.util.ArrayList;

@objid ("f7a76448-689f-4690-af64-a1e5c6f0e9b9")
public class Course
{

	@objid ("bc22678b-13a5-4234-a5e9-9483eebf6661")
	private ArrayList<Motorisation> voitures ;

	public Course()
	{
		this.voitures = new ArrayList<Motorisation>() ;
	}


	@objid ("93359f7b-3f42-4a24-a4bc-6b7a7365ac63")
	 public void inscrireVoitureMotorisee(Motorisation voiture)
	 {
		this.voitures.add(voiture) ;
	 }


	@objid ("04fdc6dd-1798-45f2-a438-c6017ef9e242")
	public void simulerCourse(float d)
	{
	
		System.out.println("\n\nla course est partie ") ;
		for (int t = 1 ; t <= d ; t++)
		{
			System.out.println(t + " seconde(s) :") ;
			for (int i = 0 ; i < this.voitures.size() ; i ++)
				{	
					Motorisation m = this.voitures.get(i) ;
					float dis = m.distanceParcourue(t) ;
					System.out.println(m.getNom() + " a parcourue " + dis + "km") ;
				}
		}
		System.out.println("la course est finie") ;
	}

}