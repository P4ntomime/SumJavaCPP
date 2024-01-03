class Car implements Vehicle {
    ¦¦@Override
    public void drive() {
        System.out.println("Driving");
    }
    ¦¦@Override
    public int maxSpeed() {
        return 180;
    }
}