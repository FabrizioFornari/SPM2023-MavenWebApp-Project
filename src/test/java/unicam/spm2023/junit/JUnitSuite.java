package org.example;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.platform.suite.api.Suite;
import unicam.spm2023.junit.HelloWorldTest;
import unicam.spm2023.junit.MyClassTest;

@SuiteDisplayName("JUnit Suite Demo")
@SelectClasses({HelloWorldTest.class , MyClassTest.class})
@IncludeTags("display")
@Suite
public class JUnitSuite {

}