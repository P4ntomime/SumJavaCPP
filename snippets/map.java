Map<Integer, Student> map = new HashMap<>();
// Schl�ssel: Matrikelnummer, Wert: Student
map.put(20000, new Student("Hans", "Kuster"));
map.put(70000, new Student("Lars", "Peter"));
map.put(13000, new Student("Anna", "Meier"));
// Schl�ssel finden:
Student s = map.get(70000);
// Collection aller Werte
for (Student s : map.values()) { //...
}