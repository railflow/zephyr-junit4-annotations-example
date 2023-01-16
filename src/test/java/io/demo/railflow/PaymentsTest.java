package io.demo.railflow;

import static io.demo.railflow.Utils.runTest;

import java.util.Arrays;

import org.junit.Test;

import io.railflow.zephyr.annotations.junit.CurrentTest;

/**
 * @author Sergey Oplavin
 */
public class PaymentsTest {

	@Test
	public void user_has_valid_cc() {
		CurrentTest.setName("User had valid CC");
		CurrentTest.setLabels(Arrays.asList("CC"));
		System.out.println("Checking if the user has valid CC");
		runTest();
	}

	@Test
	public void user_has_invalid_cc() {
		runTest();
	}

	@Test
	public void an_error_occurred_during_transaction() {
		runTest();
	}

	@Test
	public void user_cancels_transaction() {
		runTest();
	}

	@Test
	public void notification_message_is_correct() {
		runTest();
	}
}