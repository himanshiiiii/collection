
        import java.util.HashMap;
    import java.util.Scanner;
    public class Question3 {
        public static void main(String[] args) {
            String line;
            int value;
            Scanner sc = new Scanner(System.in);
            HashMap<Character,Integer> map = new HashMap<>();
            System.out.println("Enter a String :");
            line = sc.nextLine();
            for (int i=0; i<line.length(); i++){
                if(map.containsKey(line.charAt(i))){
                    value = map.get(line.charAt(i));
                    value ++;
                    map.put(line.charAt(i),value);
                }else{
                    map.put(line.charAt(i),1);
                }
            }
            for ( Character key : map.keySet()){
                System.out.println("Character : '"+key+"' Count :"+map.get(key));
            }
        }
    }
