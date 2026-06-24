package org.techworldwithjosh._1.programs.string;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
class Address {
    private String city;

//    public Address(String city) {
//        this.city = city;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) { // makes Address mutable
//        this.city = city;
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "city='" + city + '\'' +
//                '}';
//    }
}

final class Person {
    private final String name;
    private final Address address;

    public Person(String name, Address address) {
        this.name = name;
        // Defensive copy to prevent external modifications
        this.address = new Address(address.getCity());
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        // Return a copy instead of original
        return new Address(address.getCity());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

public class TestImmutable {
    public static void main(String[] args) {
        Address address = new Address("Bangalore");
        Person person = new Person("Alice", address);
        System.out.println(person);

        // Change external address
        address.setCity("Delhi");
        System.out.println(person);
    }
}
