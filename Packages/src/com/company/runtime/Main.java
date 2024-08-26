package com.company.runtime;

import com.company.basics.Person;
import java.time.LocalDateTime;
import static java.lang.Math.sqrt;

public class Main
{
    public static void main(String[] args)
    {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(sqrt(25));
        Person p1 = new Person("Jan", "Kowalski");
        System.out.println(p1);
    }
}