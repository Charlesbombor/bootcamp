package demo_stream.src.demoStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import demo_stream.src.demoStream.Cat;

public class DemoStream {
    public static void main(String[] args) throws Exception {

        List<String> strings =
                new ArrayList<>(List.of("hello", "world", "vincent", "oscar"));
        List<String> result = new ArrayList<>();
        // filter out string with length <= 5,
        for (String str : strings) {
            if (str.length() > 5)
                result.add(str);
        }
        System.out.println(result);

        // stream()
        // list object can invoke stream() method
        List<String> result2 = strings.stream() // similar to loop
                .filter(s -> s.length() > 5) // Predicate: "s -> s.length() > 5"
                .collect(Collectors.toList());
        System.out.println(result2);

        List<Cat> cats = new ArrayList<>(List.of(new Cat("ABC", 2),
                new Cat("DEF", 3), new Cat("IJK", 1)));

        // stream(), name starsWith "D" && age < 2

        List<Cat> catNames = cats.stream()
                .filter(e -> e.getName().startsWith("I") && e.getAge() < 2)
                .collect(Collectors.toList());
        System.out.println(catNames);

        List<Cat> catAge = cats.stream().filter(e -> e.getAge() > 1)
                .collect(Collectors.toList());

        System.out.println(catAge);
        System.out.println(cats);

        // Convert List<Cat> to List<Dog>
        List<Dog> dogs = cats.stream() //
                .filter(e -> {
                    if (e.getAge() < 3)
                        return true;
                    return false;
                }).map(e -> {
                    return new Dog(e.getAge());
                }).collect(Collectors.toList());

        List<Dog> dogs2 = new ArrayList<>();
        for (Cat cat : cats) {
            Dog dog = new Dog(cat.getAge());
            dogs2.add(dog);
        }

        List<Staff> staffs = new ArrayList<>(List
                .of(new Staff("John", 20000.0d), new Staff("John", 15000.0d)));

        double sum = 0.0d;
        for (Staff staff : staffs) {
            sum += staff.getSalary();
        }
        System.out.println(sum);

        double max = -1;
        for (Staff staff : staffs) {
            if (staff.getSalary() > max)
                max = staff.getSalary();
        }
        System.out.println("max salary=" + max);

        // stream

        List<Double> total = staffs.stream() //
                .map(e -> e.getSalary()) //
                .collect(Collectors.toList()); // terminate operation

        double sumOfSalary = staffs.stream() //
                .map(e -> e.getSalary()).mapToDouble(d -> d) // intermediate operation
                .sum(); // terminate operation
        System.out.println(sumOfSalary);

        long countOfStaff = staffs.stream() //
                .map(e -> { // intermediate operation
                    System.out.println("hello");
                    return e;
                }).count(); // terminate operation
        System.out.println("count=" + countOfStaff);

        // toSet()
        List<Cat> cats2 = new ArrayList<>(List.of(new Cat("DEF", 3),
                new Cat("DEF", 3), new Cat("IJK", 1)));
        Set<Cat> result4 = cats2.stream() //
                .collect(Collectors.toSet());

        System.out.println("*4" + result4);

        // distinct -> remove duplicated elements
        List<Cat> result5 = cats2.stream() //
                .distinct().filter(e -> e.getAge() >= 3) //
                .collect(Collectors.toList());
        System.out.println("*5 " + result5);

        // Prepare 2 customers, each of them has his own addresses
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.addAddress("Simple Address Line 1", "Simple Address Line 2");
        customer1.addAddress("ABCD EFG", "XYZ IJK");

        Customer customer2 = new Customer();
        customer2.addAddress("123456", "78910");

        customers.add(customer1);
        customers.add(customer2);

        // Retrieve all addresses from a list of customers
        List<Customer.Address> addresses = customers.stream() //
                .flatMap(c -> c.getAddresses().stream()) // [...,...,...] From Stream<Customer> to Stream<Address>
                .collect(Collectors.toList()); // .flatMap() likely merge two list in one
        System.out.println(addresses);

        List<List<Customer.Address>> listOfAddress = customers.stream() //
                .map(c -> c.getAddresses()) // [[], [], []......]
                .collect(Collectors.toList());
        System.out.println(listOfAddress);

        // List<List>>
        List<List<Integer>> integersList =
                new ArrayList<>(List.of(new ArrayList<>(List.of(1, 3, 5)),
                        new ArrayList<>(List.of(2, 4, 6))));

        // List <Integer>
        List<Integer> integers = integersList.stream() //
                .flatMap(e -> e.stream()) //
                .sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());
        System.out.println(integers);

        // List<String>
        List<Cat> catList = new ArrayList<>(List.of(new Cat("Jenny", 10),
                new Cat("Karis", 8), new Cat("Andy", 14)));

        // Return a list of cat names, with age > 9, order by the age of cats,
        List<String> catList2 = catList.stream() //
                .filter(c -> c.getAge() > 9)
                .sorted((c1, c2) -> c2.compareTo(c1))
                // return c1.getAge() > c2.getAge() ? 1 : -1;
                .map(c -> c.getName()).collect(Collectors.toList());
        System.out.println(catList2);

        boolean hasKaris = catList.stream() //
                .anyMatch(e -> "Karis".equals(e.getName()));
        System.out.println(hasKaris);

        Map<Boolean, List<Cat>> catMap = catList.stream() //
                .collect(Collectors.partitioningBy(cat -> cat.getAge() >= 10));
        System.out.println(catMap);

        // for-each
        int x = 100;
        for (Cat cat : cats) {
            System.out.println(x);
            x = 10;
        }

        cats.stream() //
                .forEach(e -> {
                    System.out.println(e.getAge());
                    // System.out.println(x); // error, No reed operation on the variable outside the stream.
                    // x = 10; // write operation one the variable outside the stream.
                });

        cats.stream().map(e -> e.getAge()).mapToInt(i -> i) // do not change value of i, but change it to Integer
                .sum(); // .stream() -> return an object of a class stream cat.
        System.out.println("Sum " + sum);

        Stream<Cat> sc = Stream.of(new Cat("ABC", 9), new Cat("IJK", 10));
        List<Cat> result11 =
                sc.filter(e -> e.getAge() >= 10).collect(Collectors.toList());


                Cat cat = null;
                Stream<Cat> sc2 = Stream.ofNullable(null); // new ArrayList<>().steam()
                sc2.forEach(e -> {
                    System.out.println("hello");
                });

                Stream.of(cat); // error, new a Stream cannot hold a null

                Stream<Cat> sc3 = Stream.empty(); // similar to Stream.ofNullable(null);
                sc3.forEach(e ->{
                    System.out.println("hi");
                });

                // Stream<Cat> sc4 = Stream.of(null);
                // error, you cannot pass null value into Stream.of() directly

                // Stream<Cat> scx;
                // sc3.forEach(e ->{            // java.lang.IllegalStateException
                //     System.out.println("hi");
                // });

                // generate, iternate
    }
}


