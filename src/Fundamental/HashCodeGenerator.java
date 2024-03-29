package Fundamental;

public class HashCodeGenerator {

    public static void main(String args[]){

System.out.println(getHashValue("Rakibdaf","fdsafsdfsdgdfgsd","01201202112","122121212"));
    }

    public static int getHashValue(String name, String email, String phoneNo, String regNo) {

        boolean hashableState = checkDataValidity(name, email, phoneNo, regNo);

        if (hashableState) {

            String information = reverseAndCombinedData(name, email, phoneNo, regNo);

            int hashValue = calculateHashValue(information);

            return hashValue;

        } else {
            return -1;
        }

    }

    public static boolean checkDataValidity(String name, String email, String phoneNo, String regNo) {

        int nameLength = name.length();
        int emailLength = email.length();
        int phoneNoLength = phoneNo.length();
        int regNoLength = regNo.length();

        if ((nameLength > 5 && nameLength < 30) && (emailLength > 12 && emailLength < 35)
                && (phoneNoLength > 9 && phoneNoLength < 14) && (regNoLength > 6 && regNoLength < 9)) {
            return true;
        } else {
            return false;

        }

    }

    public static String reverseAndCombinedData(String name, String email, String phoneNo, String regNo) {

        name = reverseString(name);
        email = reverseString(email);
        phoneNo = reverseString(phoneNo);
        regNo = reverseString(regNo);

        return name + email + phoneNo + regNo;

    }

    public static String reverseString(String userData) {
        String reverseData = "";
        char ch;

        for (int i = 0; i < userData.length(); i++) {
            ch = userData.charAt(i);
            reverseData = ch + reverseData;
        }
        return reverseData;
    }

    public static int calculateHashValue(String information) {

        // System.out.println("Hashed value is "+information);

        return information.hashCode();

    }

}
