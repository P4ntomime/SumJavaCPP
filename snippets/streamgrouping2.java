Map<String, Integer> totalAgeByCity =
    people.stream()
    .collect(Collectors.groupingBy(Person::getCity,
    Collectors.summingInt(Person::getAge)));