
public class Test {

	public static void main(String[] args) {

		//voiture1
		Voiture v1 = new Ferrari(1, "Ferrari", 2) ;
		System.out.println("Nom v1 = " + v1.getNom()) ;
		Motorisation v2 = new Essence(v1, 1.5f, 2.f) ;
		System.out.print(v2) ;
		System.out.print("Nom v2 = " + v2.getNom()) ;
		System.out.println(" : " + v2.prix() + " euros.") ;

		
		
		//voiture 2
		Voiture p1 = new Porsche(2, "Porsche", 1) ;
		Motorisation p2 = new Diesel(p1, 2f, 3f) ;
		System.out.print(p2) ;
		System.out.println(" : " + p2.prix() + " euros.") ;
		
		//course
		Course c = new Course() ;
		c.inscrireVoitureMotorisee(v2) ;
		c.inscrireVoitureMotorisee(p2) ;
		
		c.simulerCourse(7) ;
		

	}

}
