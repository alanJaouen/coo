import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * @author dominique Bouthinon
 * Resoud une equation du second degre
 */
@objid ("f1a9235b-72e4-44c9-843d-7c3d2e46cfad")
public class Equation2 {
    @objid ("9c1474af-f522-4d6d-820f-716f487fad50")
    private double a;

    @objid ("1836063d-ee31-4aa2-bb28-ebe7e1c4eb05")
    private double b;

    @objid ("038802c9-1a3a-4a37-a426-2f615ac7a0ac")
    private double c;

    @objid ("c2d77ff1-0596-461d-9c80-bf7e4778d240")
    private double delta = -1;

    @objid ("0e2d1661-f38c-4cc9-912e-b2d4a08dc2b9")
    private double x1;

    @objid ("b9136b17-1c06-4ba3-a1f5-3bc6866280e5")
    private double x2;

    @objid ("ec14bafb-8dfd-42b9-bc35-8b10ffd4f02d")
    private int nb_racines;

    @objid ("dbbbf80c-b8a9-4c55-8dd1-ebe75045edab")
    public Equation2() {
    }

    /**
     * demande interactivement les coefficients a, b et c de l'Equation
     */
    @objid ("a06ee86d-48e2-4167-819a-b2b09ff2e985")
    public void init() {
        Scanner s = new Scanner(System.in) ;
        
        System.out.println("saisie des coefficients a,b, c d'une equation du second degre :") ;
        System.out.println("a ? ") ;
        this.a = s.nextDouble() ;
        
        System.out.println("b ? ") ;
        this.b = s.nextDouble() ;
        
        System.out.println("c ? ") ;
        this.c = s.nextDouble() ;
    }

    /**
     * calcule le determinant de l'Equation
     */
    @objid ("31eedb4d-9f12-48c7-a7c0-6204333db7c1")
    public void calculeDeterminant() {
        this.delta = this.b * this.b - 4 * this.a * this.c ;
    }

    /**
     * Calcule les racines de l'Equation
     */
    @objid ("de39aded-5959-446b-9282-182577343e57")
    public void calculeRacines() {
        if (delta < 0.0)
        {    
            this.nb_racines = 0 ;
        }    
        else
        {
            this.x1 = -this.b + Math.sqrt(delta) / (2.0 * this.a) ; 
            
            if (delta > 0.0)
            {
                this.nb_racines = 2 ;
                this.x2 = -this.b - Math.sqrt(delta) / (2.0 * this.a) ; 
            }
            else
            {
                this.nb_racines = 2 ;
            }
        }
    }

    /**
     * affiche l'equation et ses racines
     */
    @objid ("02396b99-1ba5-405b-9dae-2b088dc95fa8")
    public void afficheSolutions() {
        String s = this.a * this.a + "x^2 + " + this.b  + "x + " + 
                   this.c + "\n" ;
        s = s + "possede " + this.nb_racines + " racine(s) \n" ;
        
        if (this.nb_racines > 0)
        {
            s = s + "x1 = " + this.x1 + "\n" ;
            
            if (this.nb_racines == 2)
            {
                s = s + "x2 = " + this.x2 + "\n" ;
            }
        }
        
              System.out.println(s) ;
    }

}
