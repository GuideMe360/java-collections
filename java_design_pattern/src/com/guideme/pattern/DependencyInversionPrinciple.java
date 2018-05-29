package com.guideme.pattern;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Triplet;

public class DependencyInversionPrinciple {
	public static void main(String[] args) {
		Person parent = new Person("John");
		Person child1 = new Person("Chris");
		Person child2 = new Person("Matt");

		Relationships rs = new Relationships();
		rs.addParentandChild(parent, child1);
		rs.addParentandChild(parent, child2);

		new Research(rs);
	}
}

enum Relationship {
	PARENT, CHILD, SIBLIN;
}

class Person {
	public String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "<Data><name>" + name + "</name></Data>";
	}
}

class Relationships {
	private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<Triplet<Person, Relationship, Person>>();

	public void addParentandChild(Person parent, Person child) {
		relations.add(new Triplet<>(parent, Relationship.PARENT, child));
		relations.add(new Triplet<>(child, Relationship.CHILD, parent));
	}

	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

}

class Research {
	public Research(Relationships relationships) {
		List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
		relations.stream().filter(p -> p.getValue0().name.equals("John") && p.getValue1() == Relationship.PARENT)
				.forEach(ch -> System.out.println("John has a child called :" + ch.getValue2().name));
	}
}