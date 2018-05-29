package com.guideme.collection.adhoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {

		List<Double> temperatureList = new ArrayList<Double>();

		temperatureList.add(40.5);
		temperatureList.add(33.9);
		temperatureList.add(37.8);
		temperatureList.add(15.3);
		temperatureList.add(25.6);

		// Print elements of temperatureList
		System.out.println(temperatureList);

		// Sorting List in ascending order according to the natural ordering
		Collections.sort(temperatureList);
		System.out.println("Sorted List: " + temperatureList);

		// Searching a temperature from list
		int searchIndex = Collections.binarySearch(temperatureList, 37.8);
		if (searchIndex >= 0) {
			System.out.println("Temperature found.");
		} else {
			System.out.println("Temperature not found.");
		}

		// Shuffles the list
		Collections.shuffle(temperatureList);
		System.out.println("Shuffled List: " + temperatureList);

		// Fill temperatureList.
		// Collections.fill(temperatureList, 0.0);
		// System.out.println("Filled List: " + temperatureList);

		Double max = Collections.max(temperatureList);
		System.out.println("Maximun temperature: " + max);

		Collections.reverse(temperatureList);
		System.out.println("Reversed List: " + temperatureList);

		List<Double> newTemperatureList = new ArrayList<Double>(temperatureList.size() + 1);
		System.out.println("New temperature list: " + newTemperatureList);
		// Collections.copy(newTemperatureList, temperatureList);
		// System.out.println("New temperature list after copy: " + newTemperatureList);

		// Replaces all occurrences of one specified value in a list with another.
		Collections.replaceAll(temperatureList, 40.5, 0.0);
		System.out.println("After replaceAll: " + temperatureList);
	}
}