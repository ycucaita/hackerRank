package com.example.collections.demoCollection;

import java.time.Month;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;


public class HelperMethods {


    public Set<Integer> createSetList(){

        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(20);
        return  numbers;
    }

    public Set<String> createMonths(){
        Set<String> months = new HashSet<>();

        months.add(Month.JANUARY.toString());
        months.add(Month.FEBRUARY.toString());
        months.add(Month.MARCH.toString());
        months.add(Month.APRIL.toString());
        months.add(Month.MAY.toString());
        months.add(Month.JUNE.toString());
        months.add(Month.JULY.toString());
        months.add(Month.AUGUST.toString());
        months.add(Month.SEPTEMBER.toString());
        months.add(Month.OCTOBER.toString());
        months.add(Month.NOVEMBER.toString());
        months.add(Month.DECEMBER.toString());
        return months;
    }


    public Set<String> createTreeMonths(){
        TreeSet<String> months = new TreeSet<>();

        months.add(Month.JANUARY.toString());
        months.add(Month.FEBRUARY.toString());
        months.add(Month.MARCH.toString());
        months.add(Month.APRIL.toString());
        months.add(Month.MAY.toString());
        months.add(Month.JUNE.toString());
        months.add(Month.JULY.toString());
        months.add(Month.AUGUST.toString());
        months.add(Month.SEPTEMBER.toString());
        months.add(Month.OCTOBER.toString());
        months.add(Month.NOVEMBER.toString());
        months.add(Month.DECEMBER.toString());
        return months;
    }

    public HashSet<String> createTreeNames(){
        HashSet<String> names = new HashSet<>();

        names.add("Tatiana");
        names.add("Luisa");
        names.add("Adriana");
        names.add("Anastasia");
        names.add("Cloe");
        names.add("Loraine");
        names.add("Gabriela");
        names.add("Karo");
        names.add("Marcela");
        names.add("Viviana");
        names.add("Valentina");
        names.add(null);
        return names;
    }







}
