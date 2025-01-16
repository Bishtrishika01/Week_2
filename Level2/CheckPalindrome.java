import java.util.Scanner;
class PalindromeChecker{
    String text; 
    //constructer to store data
    PalindromeChecker(String text){
        this.text = text;
    } 
    //check for palindrome
    boolean checkPalindrome(){
        int length= text.length(); 
        for(int i=0;i< length/2;i++){
            if(text.charAt(i)!= text.charAt(length-1-i)){
                return false;
            }
        } 
        return true;
    } 
    //display result
    void displayResult(){
        if(checkPalindrome()){
            System.out.println("Given text is palindrome");
        }
        else{
            System.out.println("Given text is not palindrome");
        }
    }

} 
public  class CheckPalindrome{ 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        //user input to check palindrome
        System.out.print("Enter text to check palindrome: "); 
        String text=sc.next(); 
        
        PalindromeChecker pd =new PalindromeChecker(text);
        pd.displayResult();
    }
}