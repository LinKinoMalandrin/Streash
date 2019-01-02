package tests.streams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import streash.vars.Number;
import streash.vars.stream.AddStream.AddNumberStream;
import streash.vars.stream.InfiniteIntegersStream;
import streash.vars.stream.SliceStream.SliceNumberStream;

class AddStreamTest {

	@Test
	void testLen() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 0, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		AddNumberStream s = new AddNumberStream(s1, s2);
		assertEquals(10, s.len());
	}
	
	@Test
	void testAverage() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 0, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		AddNumberStream s = new AddNumberStream(s1, s2);
		assertEquals(new Number(19), s.average());
	}
	
	@Test
	void testMinMax() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 0, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		AddNumberStream s = new AddNumberStream(s1, s2);
		assertEquals(new Number(10), s.min());
		assertEquals(new Number(28), s.max());
	}
	
	@Test
	void testProduct() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 1, 3);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 1, 3);
		AddNumberStream s = new AddNumberStream(s1, s2);
		assertEquals(new Number(2 * 4 * 6), s.product());
	}
	
	@Test
	void testSum() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 1, 3);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 1, 3);
		AddNumberStream s = new AddNumberStream(s1, s2);
		assertEquals(new Number(12), s.sum());
	}
}
