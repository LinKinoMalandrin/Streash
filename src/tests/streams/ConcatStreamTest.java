package tests.streams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import streash.vars.Number;
import streash.vars.StreamVar;
import streash.vars.functions.use.Concat;
import streash.vars.stream.InfiniteIntegersStream;
import streash.vars.stream.SliceStream.SliceNumberStream;

class ConcatStreamTest {

	@Test
	void testGetConsoleString() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 0, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		StreamVar s = Concat.Stream.NumberStream.getVar(s1, s2);
		assertEquals(
				"Slice of Numbers from 0 to plus infinity from the 0th to the 9th element concatened with Slice of Numbers from 0 to plus infinity from the 10th to the 19th element",
				s.getConsoleString());
	}

	@Test
	void testPrint() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 0, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		StreamVar s = Concat.Stream.NumberStream.getVar(s1, s2);
		assertEquals(20, s.print());
	}

	@Test
	void testLen() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 0, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		StreamVar s = Concat.Stream.NumberStream.getVar(s1, s2);
		assertEquals(20, s.len());
	}

	@Test
	void testAverage() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 1, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		StreamVar s = Concat.Stream.NumberStream.getVar(s1, s2);
		assertEquals(new Number(10), s.average());
	}

	@Test
	void testMinMax() {
		SliceNumberStream s1 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 0, 9);
		SliceNumberStream s2 = new SliceNumberStream(new InfiniteIntegersStream(0, false), 10, 19);
		StreamVar s = Concat.Stream.NumberStream.getVar(s1, s2);
		assertEquals(new Number(0), s.min());
		assertEquals(new Number(19), s.max());
	}

}
