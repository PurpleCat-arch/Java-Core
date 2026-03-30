// first non repeating character in a string
public class Main{
    public static void main(String[] args){
        String name = "Alice";
        for (int i=0; i<name.length(); i++){
            char c= name.charAt(i);
            if (name.indexOf(c) == name.lastIndexOf(c)){
                System.out.println("First non repeating character is: " + c);
                break;
            }
            
        }
    }
}