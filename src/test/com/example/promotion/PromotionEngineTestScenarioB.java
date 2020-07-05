package test.com.example.promotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.example.promotion.PromotionEngine;

class PromotionEngineTestScenarioB {

	@Test
	void testExecuteCheckoutB() {
		try {
			System.out.println("::Enter Input according to Scenario B::");
			PromotionEngine pe = new PromotionEngine();
			int total = pe.executeCheckout();
			assertEquals(total,370);
		}
		catch(Exception e) {
			System.out.print("Something went wrong!!");
		}
	}

}
