public class EmailValidation {
  public static boolean isValid(String email) {
    
    int atIndex = email.indexOf("@");
    if (atIndex == -1){
      return false;
    }
    String ending = email.substring(atIndex, email.length()-1);
    int dotIndex = ending.indexOf(".");
    if (atIndex != -1 && atIndex != email.length() - 1 && dotIndex != -1 && dotIndex != ending.length()-1) {
      return true;
    }
    else return false;
  }
  public static void main(String[] args) {
      String email1 = "lolec";
      System.out.println(isValid(email1)); 
  }
}
