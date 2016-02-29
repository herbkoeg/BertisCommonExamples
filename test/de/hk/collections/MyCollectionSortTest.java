package de.hk.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MyCollectionSortTest {

	final List<String> names = Arrays.asList("Andy", "Michael", "Max", "Stefan");

	@Test
	public void testSort() {
		Assert.fail("todo");

		// Sortierung mit Comparator
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(final String str1, final String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
		});

		// Iteration und Ausgabe
		final Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().length() + ", "); // 3, 4, 6, 7,

		}
	}
}
