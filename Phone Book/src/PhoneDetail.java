import Exceptions.InvalidFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneDetail {
    private String name;
    private String email;
    private Date dateCreated;
    private String phoneNumber;

    public PhoneDetail(String name,String email,String dateCreated,String phoneNumber) throws InvalidFormatException{
        try{
            if (!isValidEmail(email)){
                throw new InvalidFormatException("Email address "+email+ " is invalid");
            }
            if (!isvalidName(name)){
                throw new InvalidFormatException("Name "+name+ " is invalid");
            }
            if(!isValidPhoneNumber(phoneNumber)){
                throw new InvalidFormatException("Phone number "+phoneNumber+" is invalid");
            }
            this.name = name;
            this.email = email;
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            this.dateCreated = format.parse(dateCreated);

            this.phoneNumber = phoneNumber;
        }
        catch (ParseException e){
            throw new InvalidFormatException("Date string should be in the date ISO format yyyy-MM-dd");
        }
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nEmail: "+email+"\nDate Created: "+ dateCreated + "\nPhoneNumber: "+phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) throws InvalidFormatException {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            this.dateCreated = format.parse(dateCreated);
        }
        catch (ParseException e){
            throw new InvalidFormatException("Date string should be in the date ISO format yyyy-MM-dd");
        }
    }

    private static boolean isvalidName(String name){
//        some checks
        return true;
    }

    private static boolean isValidEmail(String email) {
//       some checks
        return true;
    }

    private static boolean isValidPhoneNumber(String phoneNumber){
//        some checks
        return true;
    }


}
