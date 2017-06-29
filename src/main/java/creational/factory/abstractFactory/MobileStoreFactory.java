package creational.factory.abstractFactory;

import creational.factory.method.MobileStore;
import creational.factory.method.NokiaStore;

public class MobileStoreFactory {

    public static MobileStore getMobileStore(String mobileStore) {
        MobileStore mStore = null;
        if ("Nokia".equalsIgnoreCase(mobileStore))
            mStore = new NokiaStore();
        return mStore;
    }

}
