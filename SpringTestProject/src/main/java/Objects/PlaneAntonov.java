package Objects;

import interfaces.IFly;

public class PlaneAntonov implements IFly {
    private String string;
    public PlaneAntonov(){
        setString(" Antonov ");
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
