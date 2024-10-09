package com.saucedemo.ahlan.utils;

public enum TestScenarios {


    AR01("User valid login");

    private String testName;

    private TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
