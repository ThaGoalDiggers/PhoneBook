package phonebookpack;
import java.util.*;
public class PhoneBook {
    //instance variable
    private Map<String, String> phonebook = new TreeMap<String, String>();
    private String displayfull;
    private Set keyset = phonebook.keySet();
    private List<Object> list = new ArrayList<Object>();
//    private String holdsall = phonebook.

    //  Constructor
    public PhoneBook() {
    }


    //Methods

    public void add(String name, String number) {
        phonebook.put(name, number);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Set listNames() {
        return keyset;
    }

    public String lookup(String name) {
        return phonebook.get(name);
    }

    public List reverselookup(String number) {
        //loop through to find the key that is equal to the number entered
        for (Object o : phonebook.keySet()) {
            if (phonebook.get(o).equals(number)) {
                list.add(o);
            }
        }
        return list;
    }

    public void display() {
//    {
//        for (Object s: phonebook.keySet() )
//        {
//           displayfull += s + ": " + phonebook.values() + "\n";
//        }
//        return displayfull;
//    }
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("%s : %s\n", key, value);
        }
    }
}
