package junittestreports;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class TestDemo2 {
	@Test
	public void testinstanceOfTest() {
		assertThat(new ArrayList(), instanceOf(List.class));
	}
	@Test
	public void testinstanceOfTest1() {
		assertTrue(true);
	}

}
