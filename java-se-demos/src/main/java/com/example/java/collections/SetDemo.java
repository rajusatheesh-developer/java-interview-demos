package com.example.java.collections;

import java.util.HashSet;
import java.util.Objects;

public class SetDemo
{

    public static void main(String[] args) {
        var set=new HashSet();
        var s1="india";
        var s2="india";

        Country country=new Country("USA");
        Country country1=new Country("USA");

        set.add(s1);
        set.add(s2);
        set.add(country);
        set.add(country1);


        System.out.println(set);
    }

    private static class Country {

        String name;

        public Country(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Country country = (Country) o;
            return name.equals(country.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
