package test.com.example.promotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.com.example.promotion.PromotionEngineTestScenarioA;

@RunWith(Suite.class)

@SuiteClasses({PromotionEngineTestScenarioA.class})
class PromotionEngineTestSuite {

}
