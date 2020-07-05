package test.com.example.promotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.example.promotion.PromotionEngine;

class PromotionEngineTest {

	@Test
	void testExecuteCheckout() {
		try {
			PromotionEngine pe = new PromotionEngine();
			int total = pe.executeCheckout();
			assertEquals(total,100);
		}
		catch(Exception e) {
			System.out.print("Something went wrong!!");
		}
	}

}
