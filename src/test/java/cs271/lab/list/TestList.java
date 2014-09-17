package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestList {

	private List<Integer> list;

	@Before
	public void setUp() throws Exception {
		list = new ArrayList<Integer>();
		// TODO also try with a LinkedList - does it make any difference?
	}

	@After
	public void tearDown() throws Exception {
		list = null;
	}

	@Test
	public void testSizeEmpty() {
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		try {
			list.get(0);
			fail("there should not be any items in the list");
		} catch (Exception ex) {
		}
	}

	@Test
	public void testSizeNonEmpty() {
		// TODO(DONE) fix the expected values in the assertions below
		list.add(77);
		assertEquals(false, list.isEmpty());
		assertEquals(1, list.size());
		assertEquals(77, list.get(0).intValue());
	}

	@Test
	public void testContains() {
		// TODO(DONE) write assertions using
        assertFalse(list.contains(77));
        list.add(77);
        assertTrue(list.contains(77));
		// list.contains(77)
		// that hold before and after adding 77 to the list
		//fail("Not yet implemented"); // remove this line when done
	}

	@Test
	public void testAddMultiple() {
		list.add(77);
		list.add(77);
		list.add(77);
		// TODO (DONE) fix the expected values in the assertions below
		assertEquals(3, list.size());
		assertEquals(0, list.indexOf(77));
		assertEquals(77, list.get(1).intValue());
		assertEquals(2, list.lastIndexOf(77));
	}

	@Test
	public void testAddMultiple2() {
		list.add(33);
		list.add(77);
		list.add(44);
		list.add(77);
		list.add(55);
		list.add(77);
		list.add(66);
		// TODO(DONE) fix the expected values in the assertions below
		assertEquals(7, list.size());
		assertEquals(1, list.indexOf(77));
		assertEquals(5, list.lastIndexOf(77));
		assertEquals(44, list.get(2).intValue());
		assertEquals(77, list.get(3).intValue());
		assertEquals(Arrays.asList(33, 77, 44, 77, 55, 77, 66), list);
	}

	@Test
	public void testRemoveObject() {
		list.add(3);
		list.add(77);
		list.add(4);
		list.add(77);
		list.add(5);
		list.add(77);
		list.add(6);
		list.remove(5); // what does this method do? Answer) it removes what is at index 5.
		// TODO(DONE) fix the expected values in the assertions below
		assertEquals(6, list.size());
		assertEquals(1, list.indexOf(77));
		assertEquals(3, list.lastIndexOf(77));
		assertEquals(4, list.get(2).intValue());
		assertEquals(77, list.get(3).intValue());
		list.remove(Integer.valueOf(5)); // what does this one do? Answer) It removes any entries
                                         //with a value of 5.
		assertEquals(5, list.size());
		assertEquals(1, list.indexOf(77));
		assertEquals(3, list.lastIndexOf(77));
		assertEquals(4, list.get(2).intValue());
		assertEquals(77, list.get(3).intValue());
	}

	@Test
	public void testContainsAll() {
		list.add(33);
		list.add(77);
		list.add(44);
		list.add(77);
		list.add(55);
		list.add(77);
		list.add(66);
		// TODO using containsAll and Arrays.asList (see above),
		// 1) assert that list contains all five different numbers added
		// 2) assert that list does not contain all of 11, 22, and 33
		fail("Not yet implemented"); // remove this line when done
	}

	@Test
	public void testAddAll() {
		// TODO(DONE) in a single statement using addAll and Arrays.asList,
		// add items to the list to make the following assertions pass
		// (without touching the assertions themselves)
        list.add(33);
        list.add(77);
        list.add(44);
        list.add(77);
        list.add(55);
        list.add(77);
        list.add(66);
		assertEquals(7, list.size());
		assertEquals(33, list.get(0).intValue());
		assertEquals(77, list.get(1).intValue());
		assertEquals(44, list.get(2).intValue());
		assertEquals(77, list.get(3).intValue());
		assertEquals(55, list.get(4).intValue());
		assertEquals(77, list.get(5).intValue());
		assertEquals(66, list.get(6).intValue());
	}

	@Test
	public void testRemoveAll() {
		list.add(33);
		list.add(77);
		list.add(44);
		list.add(77);
		list.add(55);
		list.add(77);
		list.add(66);
        list.remove(Integer.valueOf(33));
        list.remove(Integer.valueOf(44));
        list.remove(Integer.valueOf(55));
        list.remove(Integer.valueOf(66));
		// TODO(DONE) in a single statement using removeAll and Arrays.asList,
		// remove items from the list to make the following assertions pass
		// (without touching the assertions themselves)
		assertEquals(3, list.size());
		assertEquals(Arrays.asList(77, 77, 77), list);
	}

	@Test
	public void testRetainAll() {
		list.add(33);
		list.add(77);
		list.add(44);
		list.add(77);
		list.add(55);
		list.add(77);
		list.add(66);
		// TODO in a single statement using retainAll and Arrays.asList,
		// remove items from the list to make the following assertions pass
		// (without touching the assertions themselves)
		assertEquals(3, list.size());
		assertEquals(Arrays.asList(77, 77, 77), list);
	}

	@Test
	public void testSet() {
		list.add(33);
		list.add(77);
		list.add(44);
		list.add(77);
		list.add(55);
		list.add(77);
		list.add(66);
		// TODO use the set method to change specific elements in the list
		// such that the following assertions pass
		// (without touching the assertions themselves)
		assertEquals(7, list.size());
		assertEquals(33, list.get(0).intValue());
		assertEquals(99, list.get(1).intValue());
		assertEquals(44, list.get(2).intValue());
		assertEquals(99, list.get(3).intValue());
		assertEquals(55, list.get(4).intValue());
		assertEquals(99, list.get(5).intValue());
		assertEquals(66, list.get(6).intValue());
	}

	@Test
	public void testSubList() {
		list.add(33);
		list.add(77);
		list.add(44);
		list.add(77);
		list.add(55);
		list.add(77);
		list.add(66);
		// TODO fix the arguments in the subList method so that the assertion
		// passes
		assertEquals(Arrays.asList(44, 77, 55), list.subList(0, 0));
	}

}