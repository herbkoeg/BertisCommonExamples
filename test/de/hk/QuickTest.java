package de.hk;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.junit.Assert;
import org.junit.Test;

public class QuickTest {

	@Test
	public void testIsStringEmpty() {

		Assert.assertTrue(new String("").isEmpty());

		Assert.assertTrue(new String().isEmpty());
	}

	@Test
	public void testMath() throws Exception {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		String foo = "40.123+2+8+90";
		System.out.println(engine.eval(foo));

	}

}
