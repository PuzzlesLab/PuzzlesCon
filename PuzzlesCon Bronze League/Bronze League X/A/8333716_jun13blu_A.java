import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int x = 1;
        while(n > 0){
            String d = in.next();
            int mm = Integer.parseInt(d.substring(0, 2));
            int dd = Integer.parseInt(d.substring(2, 4));
            int yy = Integer.parseInt(d.substring(4));
            Calendar cal = Calendar.getInstance();
            cal.set(yy, mm - 1, dd);
            cal.add(Calendar.DATE, 280);
            mm = cal.get(cal.MONTH) + 1;
            dd = cal.get(cal.DATE);
            yy = cal.get(cal.YEAR);
            String zodiac ="";
            switch(mm){
                case 1:
                    if(dd >= 21){
                        zodiac = "aquarius";
                    }
                    else{
                        zodiac = "capricorn";
                    }
                    break;
                case 2:
                    if(dd >= 20){
                        zodiac = "pisces";
                    }
                    else{
                        zodiac = "aquarius";
                    }
                    break;
                case 3:
                    if(dd >= 21){
                        zodiac = "aries";
                    }
                    else{
                        zodiac = "pisces";
                    }
                    break;
                case 4:
                    if(dd >= 21){
                        zodiac = "taurus";
                    }
                    else{
                        zodiac = "aries";
                    }
                    break;
                case 5:
                    if(dd >= 22){
                        zodiac = "gemini";
                    }
                    else{
                        zodiac = "taurus";
                    }
                    break;
                case 6:
                    if(dd >= 22){
                        zodiac = "cancer";
                    }
                    else{
                        zodiac = "gemini";
                    }
                    break;
                case 7:
                    if(dd >= 23){
                        zodiac = "leo";
                    }
                    else{
                        zodiac = "cancer";
                    }
                    break;
                case 8:
                    if(dd >= 22){
                        zodiac = "virgo";
                    }
                    else{
                        zodiac = "leo";
                    }
                    break;
                case 9:
                    if(dd >= 24){
                        zodiac = "libra";
                    }
                    else{
                        zodiac = "virgo";
                    }
                    break;
                case 10:
                    if(dd >= 24){
                        zodiac = "scorpio";
                    }
                    else{
                        zodiac = "libra";
                    }
                    break;
                case 11:
                    if(dd >= 23){
                        zodiac = "sagittarius";
                    }
                    else{
                        zodiac = "scorpio";
                    }
                    break;
                case 12:
                    if(dd >= 23){
                        zodiac = "capricorn";
                    }
                    else{
                        zodiac = "sagittarius";
                    }
                    break;
            }
            mm += 100;
            dd += 100;
            System.out.println(x + " " + Integer.toString(mm).substring(1) + "/" + Integer.toString(dd).substring(1) + "/" + yy + " " + zodiac);
            n--;
            x++;
        }
    }
    
}