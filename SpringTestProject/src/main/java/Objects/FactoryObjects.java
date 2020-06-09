package Objects;

import interfaces.IDrive;
import interfaces.IFly;

public class FactoryObjects implements IDrive, IFly {
    private IDrive car;
    private IFly plane;
    public  FactoryObjects(){

    }
    public FactoryObjects(IDrive car, IFly plane){
        this.car = car;
        this.plane = plane;
    }

    public String showCarName() {
        return "drive";
    }

    public String showPlaneName() {
        return "fly";
    }
}
