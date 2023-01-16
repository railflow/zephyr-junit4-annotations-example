package io.demo.railflow;

import static io.demo.railflow.Utils.runTest;

import org.junit.Test;

/**
 * @author Sergey Oplavin
 */
public class HomeCabinetTest {

	@Test
	public void change_password() {
		runTest();
	}

	@Test
	public void change_password_fail_on_incorrect_confirmation() {
		runTest();
	}

	@Test
	public void change_password_fail_on_incorrect_password() {
		runTest();
	}

	@Test
	public void change_email() {
		runTest();
	}

	@Test
	public void change_email_fail_on_invalid_email() {
		runTest();
	}
}
