package gof.factory.method;

public class NokiaStore extends MobileStore {

    @Override
    protected Mobile createMobile(String make) {
        Mobile mobile = null;
        if(make.equals("ASeries")) {
            mobile = new NokiaASeries();
        } else if(make.equals("BSeries")) {
            mobile = new NokiaBSeries();
        }
        return mobile;
    }

}
