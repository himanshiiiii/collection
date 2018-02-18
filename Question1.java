import java.util.*;

public class Question1{
    public static void main(String[] args) {
        float sum=0f;
        List<Float> l=new ArrayList<Float>();
        l.add(0,1.5f);
        l.add(1,5.2f);
        l.add(2,10.7f);
        l.add(3,15.2f);
        l.add(4,18.5f);

        Iterator<Float> itr=l.iterator();
        while(itr.hasNext()){
            int counter=1;
            int MAX= 5;
            while (counter <= MAX && itr.hasNext()) {
                sum += itr.next();
                counter++;
            }

        }
        System.out.println(sum);
    }
}
