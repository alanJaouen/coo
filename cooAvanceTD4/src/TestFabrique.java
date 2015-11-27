
public class TestFabrique {

	public static void main(String[] args) {
		// test fuselage
		
		System.out.println(new Fuselage(110,600)+"\n\n");
		
		//test reacteur
		System.out.println(new RollRoyce(5,10));
		System.out.println(new Trent(5,10)+"\n\n");
		
		//test usine
		UsineJetAirbus usiA= new UsineJetAirbus("Villetaneuse");
		System.out.println(usiA);
		UsineJetBoeing usiB= new UsineJetBoeing("New York");
		System.out.println(usiB+"\n\n");
		
		//test fabication avion Airbus
		System.out.println(usiA.fabriqueJet("320", "RollRoyce"));
		System.out.println(usiA.fabriqueJet("320", "Trent"));
		System.out.println(usiA.fabriqueJet("380", "RollRoyce"));
		System.out.println(usiA.fabriqueJet("380", "Trent")+"\n\n");
		
		//test fabication avion Boeing
				System.out.println(usiB.fabriqueJet("737", "RollRoyce"));
				System.out.println(usiB.fabriqueJet("737", "Trent"));
				System.out.println(usiB.fabriqueJet("747", "RollRoyce"));
				System.out.println(usiB.fabriqueJet("747", "Trent"));

	}

}
