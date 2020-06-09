package Objects;

import interfaces.IDrive;

public class CarChevrolet implements IDrive {
    private String string;
    public CarChevrolet(){
        setString(" aveo ");
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
