package gof.factory.abstractFactory;

import gof.factory.method.Mobile;
import gof.factory.method.MobileStore;

public class MobileStoreCentre {

    public static void main(String args[]) {
        MobileStore mobileStore = MobileStoreFactory.getMobileStore("Nokia");
        Mobile mobile = mobileStore.assemble("ASeries");
        mobile.experience();
        System.out.println("");
        mobileStore = MobileStoreFactory.getMobileStore("Nokia");
        mobile = mobileStore.assemble("BSeries");
        mobile.experience();
    }

}
