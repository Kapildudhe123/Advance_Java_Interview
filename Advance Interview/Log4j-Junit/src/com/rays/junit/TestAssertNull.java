package com.rays.junit;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertNull extends TestCase {

	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(1); 

		assertNull("user is not null", bean);
		// assertTrue(bean == null);
		//assertTrue("is not true", bean == null);

	}
}