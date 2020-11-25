package org;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClasss {
    @Test
    public void duplicates() {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Vishal");
        a.add("Sahil");
        a.add("Shalu");
        a.add("Simran");
        int count = 0;
        for (String b : a) {
            if (b.startsWith("S")) {
                count++;
            }
        }
        System.out.println(count);

    }

    @Test
    public void strm() {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Vishal");
        a.add("Sahil");
        a.add("Shalu");
        a.add("Simran");
        Long c = a.stream().filter(s -> s.startsWith("S")).count();
        System.out.println(c);
    }

    @Test
    public void dup() {
        Long c = Stream.of("Abi", "Aay", "Sahi").filter(s ->
                s.startsWith("A")
        ).count();
        System.out.println(c);
        Stream.of("Abi", "Aay", "Sahi").filter(s -> s.length() > 0).forEach(System.out::println);
    }

    @Test
    public void streamMap() {
        ArrayList<String> a = new ArrayList<>();
        a.add("Vishal");
        a.add("Sahil");
        a.add("Shalu");
        a.add("Simran");
        Stream.of("Vishal", "Sahil", "Alka", "Akhil").filter(s -> s.endsWith("l")).map(String::toUpperCase).forEach(System.out::println);
        List<String> l = Arrays.asList("Vishal", "Sahil", "Alka", "Akhil");
        l.stream().filter(s -> s.startsWith("A")).sorted().limit(1).map(String::toLowerCase).forEach(System.out::println);

        Stream<String> newStream = Stream.concat(a.stream(), l.stream());
        // newStream.sorted().forEach(System.out::println);
        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Alka"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Test
    public void streamCollect() {
        List<String> li = Stream.of("Ajeet", "Abhijeet", "Alekhya", "Adam").filter(s -> s.startsWith("A")).map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(li.get(3));
        Integer a[] = {2, 4, 5, 4, 3, 2, 2, 3, 45, 5, 5};
        List<Integer> la = Arrays.asList(a);
        la.stream().distinct().unordered().forEach(System.out::println);
    }

    @Test
    public void preac() {
        String[] a = {"a", "b", "q", "a", "a"};
        // char[] c=a.toCharArray();
        List<String> la = Arrays.asList(a);
        int count = 0;
        la.stream().distinct().map(String::toUpperCase).forEach(System.out::println);
        la.stream().distinct().filter(ss-> Collections.frequency(la,ss)>1).collect(Collectors.toSet()).forEach(System.out::println);


    }
}
