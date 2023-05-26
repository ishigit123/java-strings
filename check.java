import java.util.*;



public class check {
    
    public static void main(String[] args) {
        System.out.println(isUppercase("hello"));
        System.out.println(isUppercase("HeLLO"));
        System.out.println(isUppercase("HELLO MR"));
        
    }
    
    public static Boolean isUppercase(String s){
        return s.chars().allMatch(Character::isUpperCase);

    }
    

    
}
