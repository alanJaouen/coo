import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Casier casier=new Casier(20);
		casier.list[3]=new Objet("tractopelle",3000);
		Robot bob=new AutoTracteur(casier);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1:bouger\n"
				+ "2:prendre\n"
				+ "3:lacher");
		while (true)
		{
			System.out.println(bob.monCasier.affiche());
			switch(sc.nextInt())
			{
			case 1:
				bob.executerDeplacement(sc.nextInt());
				break;
			case 2:
				bob.manipulerSaisir();
				break;
			case 3:
				bob.manipulerRelacher();
			}
			
		}
		
	}

}
