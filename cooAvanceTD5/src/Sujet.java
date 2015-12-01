import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5d383ac2-4c84-4dea-b34f-ed2f709e93ce")
public interface Sujet {
    @objid ("cc358e26-c1e8-47f5-a6c8-f365ee4f679f")
    public void notifierObservateur();

    @objid ("d3e15bad-fa24-40ca-a63e-e07fef2cdbaf")
    public Observateur getObservateur();

    @objid ("c01c5d81-c9bf-4275-86ec-32256a42173d")
    public void setObservateur(Observateur value);

}
