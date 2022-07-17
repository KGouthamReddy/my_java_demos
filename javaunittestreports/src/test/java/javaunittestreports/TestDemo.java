package junittestreports;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestDemo {
	@Test
	public void testinstanceOfTest() {
		assertThat(new ArrayList(), instanceOf(List.class));
	}

}
