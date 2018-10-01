package phonebookpack;
import java.util.*;
public class PhoneBook
{
    //instance variable
    private Map<String, String> phonebook = new TreeMap<String,String>();
    private String displayfull;
    private Set keyset = phonebook.keySet();
    private List <Object>list = new ArrayList<Object>();

    //  Constructor
    public PhoneBook(){}



    //Methods

    public void add (String name,String number){ phonebook.put(name,number); }

    public void remove (String name) { phonebook.remove(name); }

    public Set listNames(){ return keyset; }

    public String lookup(String name ){ return phonebook.get(name); }

    public List reverselookup (String number)
    {
        //loop through to find the key that is equal to the number entered
        for(Object o:phonebook.keySet())
        {
            if(phonebook.get(o).equals(number))
            {
                list.add(o);
            }
        }
        return list;
    }

    public String display()
    {
        for (Object s: keyset)
        {
           displayfull += s;
        }
        return displayfull;
    }
}