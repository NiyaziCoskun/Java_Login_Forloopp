public class loginPage {
    public static void main(String[] args) {

        //Create a method that checks whether there are numbers
        //and letters in the "password" sent as a parameter
        //Password : Asdf123
        //Result   : true
        //Password : 12345
        //Result   : false
        //Password : Asdfrf
        //Result   : false
        String password = "Asd12";
        System.out.println("sonuc:" + checkPasword(password));
    }

    public static boolean checkPasword(String password){
        boolean isThereLetter = false;
        boolean isThereNumber= false;


        for (int i = 0; i<password.length(); i++){
            if (password.charAt(i)>= '0' && password.charAt(i) <= '9') {
                isThereNumber = true;
            } else if (password.charAt(i)>= 'A' && password.charAt(i) <= 'Z') {
                isThereLetter = true;
            } else if (password.charAt(i)>= 'a' && password.charAt(i) <= 'z') {
                isThereLetter = true;
            }
        }
        boolean result = isThereLetter && isThereNumber;
        return result;

    }
}
