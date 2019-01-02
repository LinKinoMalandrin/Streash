package tests.streams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import streash.vars.Number;
import streash.vars.stream.InfiniteIntegersStream;
import streash.vars.stream.RepeatStream.RepeatNumberStream;
import streash.vars.stream.SliceStream.SliceNumberStream;

class RepeatStreamTest {

	@Test
	void testLen() {
		InfiniteIntegersStream s0 = new InfiniteIntegersStream(0, false);
		SliceNumberStream s1 = new SliceNumberStream(s0, 0, 9);
		RepeatNumberStream s = new RepeatNumberStream(s1, (float) 0.5);
		assertEquals(15, s.len());	
	}
	
	@Test
	void testMinMax() {
		InfiniteIntegersStream s0 = new InfiniteIntegersStream(0, false);
		SliceNumberStream s1 = new SliceNumberStream(s0, 0, 9);
		RepeatNumberStream s = new RepeatNumberStream(s1, (float) 0.5);
		assertEquals(new Number(0), s.min());
		assertEquals(new Number(9), s.max());
	}
	
	@Test
	void testAverage() {
		InfiniteIntegersStream s0 = new InfiniteIntegersStream(0, false);
		SliceNumberStream s1 = new SliceNumberStream(s0, 5, 10);
		RepeatNumberStream s = new RepeatNumberStream(s1, (float) 0.5);
		assertEquals(new Number(7), s.average());	
	}
	
	@Test
	void testSum() {
		InfiniteIntegersStream s0 = new InfiniteIntegersStream(0, false);
		SliceNumberStream s1 = new SliceNumberStream(s0, 0, 9);
		RepeatNumberStream s = new RepeatNumberStream(s1, (float) 0.5);
		System.out.println(s.collect());
		assertEquals(new Number(55), s.sum());
	}
}
