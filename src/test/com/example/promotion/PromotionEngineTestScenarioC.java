package test.com.example.promotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.example.promotion.PromotionEngine;

class PromotionEngineTestScenarioC {

	@Test
	void testExecuteCheckoutC() {
		try {
			System.out.println("::Enter Input according to Scenario C::");
			PromotionEngine pe = new PromotionEngine();
			int total = pe.executeCheckout();
			assertEquals(total,280);
		}
		catch(Exception e) {
			System.out.print("Something went wrong!!");
		}
	}

}
