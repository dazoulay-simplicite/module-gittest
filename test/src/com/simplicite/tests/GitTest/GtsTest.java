package com.simplicite.tests.GitTest;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests
 */
public class GtsTest {
	@Test
	public void test() {
		try {
			AppLog.info("This is a unit test (branch2)", null);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
