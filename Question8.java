import java.text.SimpleDateFormat;
import java.util.Date;


public class Question8 {
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("DD-MMMM-YYYY");
        System.out.println(s.format(d));

    }
}
