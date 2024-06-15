package com.example.mock;

import org.mockserver.mock.Expectation;
import org.mockserver.server.initialize.ExpectationInitializer;

public class MyExpectationInitializer implements ExpectationInitializer {
    @Override
    public Expectation[] initializeExpectations() {
        return new Expectation[0];
    }



}
