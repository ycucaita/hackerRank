package com.example.collections.demoCollection;

import org.hamcrest.collection.IsEmptyCollection;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoCollectionApplicationTests {

	List<Integer> numbers= null;
	List <String> names = null;

	@Before
	public void setUp() throws Exception {
		numbers = Arrays.asList( 1, 2, 3, 4, 5 );
		createLinkedList();
	}

	@Test
	public void validateSizeListAndItem() {
		numbers.set(3,7);
		assertThat(numbers, hasSize(5));
		assertThat(numbers, hasItems(7));
	}

	@Test
	public void validateIfListIsEmpty() {
		numbers= null;
		assertThat(numbers, is(nullValue()));
	}

	@Test
	public void validateParallelList() {
		assertThat(names, contains("Juliana","Hanna","Luisa","Paola"));
	}

	private void createLinkedList() {

	    names = new LinkedList();

		names.add("Juliana");
		names.add("Hanna");
		names.add("Luisa");
		names.add("Paola");
	}
}
