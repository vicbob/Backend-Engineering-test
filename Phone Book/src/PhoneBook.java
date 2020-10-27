import Exceptions.DuplicatePhoneDetailException;
import Exceptions.InvalidFormatException;
import Exceptions.PhoneDetailNotFoundException;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String,PhoneDetail> phoneBook;

    public PhoneBook(){
        phoneBook = new HashMap();
    }

    public void addPhoneDetail(String phoneNumber,String name, String email, String dateCreated) throws DuplicatePhoneDetailException, InvalidFormatException {
        if(phoneBook.containsKey(phoneNumber)){
            throw new DuplicatePhoneDetailException(phoneNumber);
        }
        else{
            PhoneDetail phoneDetail = new PhoneDetail(name,email,dateCreated,phoneNumber);
            phoneBook.put(phoneNumber,phoneDetail);
        }
    }

    public PhoneDetail getPhoneDetail(String phoneNumber) throws PhoneDetailNotFoundException {
        if (phoneBook.containsKey(phoneNumber)){
            return phoneBook.get(phoneNumber);
        }
        else{
            throw new PhoneDetailNotFoundException(phoneNumber);
        }
    }

    public String[] getAllPhoneNumbers(){
        return phoneBook.keySet().toArray(new String[0]);
    }


}
