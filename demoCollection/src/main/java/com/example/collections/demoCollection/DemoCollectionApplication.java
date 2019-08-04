package com.example.collections.demoCollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.spel.ast.OperatorInstanceof;

import java.time.Month;
import java.util.*;

@SpringBootApplication
public class DemoCollectionApplication {

	static HelperMethods helperMethods = new HelperMethods();

	public static void main(String[] args) {
		SpringApplication.run(DemoCollectionApplication.class, args);


		List<Integer> list = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		HashSet<Integer> hashSet = new HashSet<>();
		TreeSet<Integer> treeSetCol = new TreeSet<>();
		HashSet<Integer> hashSetCol = new HashSet<>();


		executionValidationTime(list);
		executionValidationTime(linkedList);
		executionValidationMapsTime(treeMap);
		executionValidationMapsTime(hashMap);
		exampleRemoveIf();
		addingExistentValue();
		validateSortInTreeSet();
		executionTimeSet(hashSet);
		executionTimeSet(treeSetCol);
		executionTimeTreeSet(hashSetCol);
		printNameHashSetCollection();

	}

	private static void executionValidationTime(Collection object){

		int itemsNumber= 10000;
		long startTime = System.currentTimeMillis();

		for (int i=0; i<itemsNumber;i++){
			object.add(Math.random());
		}

		long endTime = System.currentTimeMillis();
		System.out.println(" time " + (endTime - startTime ));
	}

	private static void executionValidationMapsTime(Map object){

		int itemsNumber= 10000;
		long startTime = System.currentTimeMillis();

		for (int i=0; i<itemsNumber;i++){
			object.put(Math.random(),Math.random());
		}

		long endTime = System.currentTimeMillis();
		System.out.println("map time " + (endTime - startTime ));
	}

	private static void exampleRemoveIf (){
		Set<Integer> numbers= helperMethods.createSetList();
		numbers.removeIf(num -> num %5 == 0  );
		System.out.println("after operation"+ numbers);
	}

	private static void addingExistentValue(){
		Set<String> months= helperMethods.createMonths();
		months.add(Month.JULY.toString());
		System.out.println("print after add value"+months);
	}


	private static void validateSortInTreeSet(){
		TreeSet<String> monthsTreeSet= (TreeSet<String>) helperMethods.createTreeMonths();
		System.out.println("print treeSet"+ monthsTreeSet);
	}

	private static void executionTimeSet(Collection object){

		int itemsNumber= 10000;
		long startTime = System.currentTimeMillis();

		for (int i=0; i<itemsNumber;i++){
			object.add(Math.random());
		}

		long endTime = System.currentTimeMillis();
		System.out.println(" time " + object.getClass() +" :"+(endTime - startTime ));
	}

	//https://www.callicoder.com/java-hashset/
	private static void executionTimeTreeSet(Collection object){

		int itemsNumber= 10000;
		long startTime = System.currentTimeMillis();

		for (int i=0; i<itemsNumber;i++){
			object.add(Math.random());
		}

		long endTime = System.currentTimeMillis();
		System.out.println(" time " + (endTime - startTime ));
	}

	private static void printNameHashSetCollection(){
		HashSet<String> namesHasSet=  helperMethods.createTreeNames();
		System.out.println("print treeSet"+ namesHasSet);

	}












}
