package Objects;

import interfaces.IFly;

public class PlaneF45 implements IFly {
    private String string;
    public PlaneF45(){
        setString(" F45 ");
        System.out.print(getString());
    }
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public String showPlaneName() {
        return string;
    }
}
