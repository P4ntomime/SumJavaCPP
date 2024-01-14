people
    .stream()
    .filter(p -> p.getAge() >= 18)
    .map(p -> p.getName())
    .sorted()
    .forEach(System.out::println);