
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        s.nextLine();

        for (int i = 1; i <= loop; i++) {
            String date = s.nextLine();
            int year = Integer.parseInt(date.substring(4, 8));
            int day = Integer.parseInt(date.substring(2, 4));
            int month = Integer.parseInt(date.substring(0, 2)) - 1;
            Calendar a = new GregorianCalendar(year, month, day);
            a.add(Calendar.DATE, (40 * 7));

            SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
            String formatted = format1.format(a.getTime());
            System.out.println(i+" "+formatted+" "+getSign(a));
        }

    }
    
    public static String getSign(Calendar calendar){
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        switch(calendar.get(Calendar.MONTH)){
            case 0:
                if(day>=21){
                    return "aquarius";                    
                }else{
                    return "capricorn";
                }
            case 1:
                if(day>=20){
                    return "pisces";                    
                }else{
                    return "aquarius";
                }
            case 2:
                if(day>=21){
                    return "aries";                    
                }else{
                    return "pisces";
                }
            case 3:
                if(day>=21){
                    return "taurus";                    
                }else{
                    return "pisces";
                }
            case 4:
                if(day>=22){
                    return "gemini";                    
                }else{
                    return "taurus";
                }
            case 5:
                if(day>=22){
                    return "cancer";                    
                }else{
                    return "gemini";
                }
            case 6:
                if(day>=23){
                    return "leo";                    
                }else{
                    return "cancer";
                }
            case 7:
                if(day>=22){
                    return "virgo";                    
                }else{
                    return "leo";
                }
            case 8:
                if(day>=24){
                    return "libra";                    
                }else{
                    return "virgo";
                }
            case 9:
                if(day>=24){
                    return "scorpio";                    
                }else{
                    return "libra";
                }
            case 10:
                if(day>=23){
                    return "sagittarius";                    
                }else{
                    return "scorpio";
                }
            default:                
                if(day>=23){
                    return "capricorn";                    
                }else{
                    return "sagittarius";
                }
        }
    }

}
