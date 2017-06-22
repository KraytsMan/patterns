package gof.factory.method;

public class MobileStoreCentre {

    public static void main(String args[]) {
        MobileStore mobileStore01 = new NokiaStore();
        Mobile mobile01 = mobileStore01.assemble("ASeries");
        Mobile mobile02 = mobileStore01.assemble("BSeries");
    }

}
