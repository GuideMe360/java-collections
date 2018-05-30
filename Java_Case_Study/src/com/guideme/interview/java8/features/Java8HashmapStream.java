/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 30-May-2018
 */
package com.guideme.interview.java8.features;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Arun
 *
 */
public class Java8HashmapStream {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		Map<Integer, String> filteredMap = filterByValue(map, x -> x.contains("o"));
		filteredMap.forEach((k, v) -> System.out.println(String.format("%s - %s", k, v)));
	}

	public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
		return map.entrySet().stream().filter(x -> predicate.test(x.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

	public static void main1(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "map1");
		map.put(2, "map2");

		oldWay(map);
		java8IterateMap(map);
	}

	public static void main2(String[] args) {
		Person p1 = new Person("Arun", "Ammasai");
		Person p2 = new Person("Nancy", "Arulraj");
		Person p3 = new Person("Surya", "Karri");

		Map<Integer, Person> map = new HashMap<>();
		map.put(1, p1);
		map.put(2, p2);
		map.put(3, p3);

		// Way 1
		Map<Integer, Person> collect = map.entrySet().stream().filter(m -> m.getKey() == 1).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

		// Way 2
		Map<Integer, Person> collect1 = map.entrySet().stream().filter(m -> m.getKey() < 4).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		extractDataFromMap(collect1);
		extractMapForeachStream(map);
	}

	private static void extractMapForeachStream(Map<Integer, Person> map) {
		map.forEach((k, v) -> {
			Person pp = (Person) v;
			System.out.println("Person 1:" + pp);
		});
	}

	private static void extractDataFromMap(Map<Integer, Person> map) {
		map.entrySet().stream().forEach(p -> {
			// System.out.println(String.format("Through entrySet %s - %s",
			// p.getKey(),p.getValue()));
			Person pp = p.getValue();
			System.out.println("Person :" + pp);
		});
	}

	private static void java8IterateMap(Map<Integer, String> map) {
		System.out.println("============NEW WAY 1===============");
		map.forEach((k, v) -> System.out.println(String.format("%s - %s", k, v)));

		System.out.println("============NEW WAY 2===============");
		map.entrySet().stream().forEach(e -> System.out.println(String.format("%s - %s", e.getKey(), e.getValue())));

		System.out.println("============NEW WAY 3===============");
		map.entrySet().stream().forEach(e -> {
			System.out.println("Get Key :" + e.getKey() + " Value :" + e.getValue());
		});
	}

	private static void oldWay(Map<Integer, String> map) {
		System.out.println("============OLD WAY===============");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(String.format("%s - %s", entry.getKey(), entry.getValue()));
		}
	}
}

class Person {
	String firstname, lastname;

	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		// return "<data><firstname>" + firstname + "</firstname><lastname>" + lastname
		// + "</lastname>";
		return firstname + " - " + lastname;
	}

}
