import java.util.Date;


public class DataTest {

    public static void main(String[] args) {

        Date lastDate = new Date(117, 0, 15);
        System.out.println("*********");
        System.out.println(lastDate);


        Date lastDateByShared = new Date(119, 0, 15);
        System.out.println("*********");
        System.out.println(lastDateByShared);

        if ( lastDate == null || (lastDateByShared != null && lastDateByShared.after(lastDate)) )  {
            lastDate = lastDateByShared;
        }
        System.out.println("--------");
        System.out.println(lastDate);
    }
}
