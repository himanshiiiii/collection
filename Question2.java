import java.util.*;
class UniqueChar{
    public static void uniqueCharacters(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++){
            char ch= str.charAt(i);
            if (temp.indexOf(ch) < 0){
                temp = temp + ch;
            } else {
                temp = temp.replace(String.valueOf(ch), "");
            }
        }

        System.out.println(temp + " ");

    }

}




public class Question2 {
    public static void main(String[] args) {
        UniqueChar u=new UniqueChar();
        u.uniqueCharacters("hellooabc");
    }
}

