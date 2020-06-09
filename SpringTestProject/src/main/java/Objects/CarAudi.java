package Objects;

import interfaces.IDrive;

public class CarAudi implements IDrive {
    private String string;
    public CarAudi(){
        setString(" audi ");
        System.out.print(getString());
    }
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public String showCarName() {
        return string;
    }
}
