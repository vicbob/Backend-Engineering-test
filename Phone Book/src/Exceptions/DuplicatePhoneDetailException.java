package Exceptions;

public class DuplicatePhoneDetailException extends Exception {
    public  DuplicatePhoneDetailException(String phoneNumber){
        super("Phone Details with Phone Number "+phoneNumber+" already exists");
    }
}
