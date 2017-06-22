package gof.factory.simple;

public class SystemFactory {

    public System createSystem(String type) {
        System system = null;
        if (type.equals("WIN")) {
            system = new WindowsSystem();
        } else if (type.equals("LIN")) {
            system = new LinuxSystem();
        } else if (type.equals("SOL")) {
            system = new SolarisSystem();
        } else if (type.equals("MAC")) {
            system = new MacSystem();
        } else {
            system = new UnixSystem();
        }
        return system;
    }

}
