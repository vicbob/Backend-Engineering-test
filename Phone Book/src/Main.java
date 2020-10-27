public class Main {
    public static void main(String[] args) {
        try {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.addPhoneDetail("09033259572", "Ogunlusi Victor", "vicbob@gmail.com", "2020-10-12");
            phoneBook.addPhoneDetail("07033259572", "Ogunlusi John", "vice@gmail.com", "2020-09-12");

            PhoneDetail phoneDetail = phoneBook.getPhoneDetail("09033259572");
            System.out.println(phoneDetail);

            String[] phoneNumbers = phoneBook.getAllPhoneNumbers();
            for(String s:phoneNumbers){
                System.out.println(s);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}