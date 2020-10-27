package Exceptions;

public class PhoneDetailNotFoundException extends Exception {
    public PhoneDetailNotFoundException(String phoneNumber){
        super("Phone Detail with Phone Number "+phoneNumber+" not found");
    }
}
