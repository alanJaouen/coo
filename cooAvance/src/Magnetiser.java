import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("106fb295-f0aa-45f7-bdb1-0f84ffe16fdf")
public class Magnetiser implements Manipuler {
    @objid ("3cc1bcd3-693c-47af-b91b-14add2112646")
    public void saisir() {

    	System.out.println("je magnetise");
    }

    @objid ("c0d3e356-3087-4198-8ea9-923ed853cabb")
    public void relacher() {
    	System.out.println("je démagnetise");
    }

}
