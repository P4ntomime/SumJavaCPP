Random random = new Random();
Stream.generate(random::nextInt)
    .forEach(System.out::println);