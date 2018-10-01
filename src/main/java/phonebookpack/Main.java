package phonebookpack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        //here is where we will test the phonebook class and its methods



        PhoneBook yellowPages = new PhoneBook();


        yellowPages.add("Zach","302-320-2025");
        yellowPages.add("Troy","302-867-5309");
        yellowPages.add("Iron Chef","302-306-6052");



        // yellowPages.remove("Zach");

//        System.out.println(yellowPages.listNames());


//        System.out.println(yellowPages.lookup("Troy"));
//
//        System.out.println(yellowPages.reverselookup("302-867-5309"));


       yellowPages.display();
    }
}