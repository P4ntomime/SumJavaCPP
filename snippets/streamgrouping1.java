Map<Integer, List<Person>> peopleByAge =
    people.stream()
    .collect(Collectors.groupingBy(Person::getAge));