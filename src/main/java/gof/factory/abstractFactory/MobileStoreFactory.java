package gof.factory.abstractFactory;

import gof.factory.method.MobileStore;
import gof.factory.method.NokiaStore;

public class MobileStoreFactory {

    public static MobileStore getMobileStore(String mobileStore) {
        MobileStore mStore = null;
        if ("Nokia".equalsIgnoreCase(mobileStore))
            mStore = new NokiaStore();
        return mStore;
    }

}
