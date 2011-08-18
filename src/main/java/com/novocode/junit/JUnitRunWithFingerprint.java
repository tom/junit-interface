package com.novocode.junit;

import org.scalatools.testing.AnnotatedFingerprint;

public class JUnitRunWithFingerprint implements AnnotatedFingerprint {
    public boolean isModule() {
        return false;
    }

    public String annotationName() {
        return "org.junit.runner.RunWith";
    }
}
