package com.juaracoding.utils;

public enum TestCases {
    T1("User access invalid url"),
    T2("User access valid url"),
    T3("Login admin no username and password"),
    T4("Login admin with valid username and invalid password"),
    T5("Login admin with invalid username and valid password"),
    T6("Login admin with valid username"),
    T7("Login admin with invalid username"),
    T8("Login admin with valid password"),
    T9("Login admin with invalid password"),
    T10("Login admin with valid username and password"),
    T11("Logout admin"),
    T12("User access invalid url"),
    T13("User access valid url"),
    T14("Login sales no username and password"),
    T15("Login sales with valid username and invalid password"),
    T16("Login sales with invalid username and valid password"),
    T17("Login sales with valid username"),
    T18("Login sales with invalid username"),
    T19("Login sales with valid password"),
    T20("Login sales with invalid password"),
    T21("Login sales with valid username and password"),
    T22("Logout sales"),;

    private String testCaseName;
    TestCases(String value){

        testCaseName = value;
    }

    public String getTestCaseName(){

        return testCaseName;
    }
}
