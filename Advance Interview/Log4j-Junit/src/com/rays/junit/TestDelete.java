package com.rays.junit;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestDelete {

	@Test
	public void delete() throws Exception {

		UserModel.delete(26);

		UserBean bean = UserModel.findByPk(27);

		assertNull(bean);

	}
}