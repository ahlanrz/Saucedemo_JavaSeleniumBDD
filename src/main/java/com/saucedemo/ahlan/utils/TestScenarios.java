package com.saucedemo.ahlan.utils;

public enum TestScenarios {

    /*
        AHLAN REZKI
     */
    //Modul Login Invalid Klik Sign In


    AR01("TCC.PTP.007 User Approve Data");

    private String testName;

    private TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
