package com.merveturk.ders2Polimorphizm;

import java.sql.SQLOutput;

public interface BenefitCompany {
     //void transferingEmployee();
     //void foodService();

    default void prepare(){
        System.out.println("prepare interface this class.");
        callPrepare();

    }
    static void callPrepare(){
        System.out.println("callPrepare method is called");
    }

}
