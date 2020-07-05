package test.com.example.promotion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


import test.com.example.promotion.PromotionEngineTestScenarioA;
import test.com.example.promotion.PromotionEngineTestScenarioB;
import test.com.example.promotion.PromotionEngineTestScenarioC;

@RunWith(Suite.class)

@SuiteClasses({PromotionEngineTestScenarioA.class, PromotionEngineTestScenarioB.class, PromotionEngineTestScenarioC.class})
class PromotionEngineTestSuite {

}
