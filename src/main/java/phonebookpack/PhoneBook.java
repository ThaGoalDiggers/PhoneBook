package phonebookpack ;

public class PhoneBook
{
    /*
    here is where Zach and Zohdi will compile all of the methods
    from the other "phonebook classes" after Troy, Lamar, and Javon submit them
     */  //instance variable

    Map<String,String>phonebook = new TreeMap<String, String>();

    private String disp;


    //  Constructor

    public PhoneBook(){
    }



    //Methods

    public void add (String name,String number){
        phonebook.put(name,number);
    }



    public void remove (String name) {
        phonebook.remove(name);
    }


    public String lookup(String name ){
        return phonebook.get(name);
    }
}
