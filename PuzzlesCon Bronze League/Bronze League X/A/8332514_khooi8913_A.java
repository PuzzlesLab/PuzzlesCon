import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader systemInput = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(systemInput.readLine());
        String zodiac="";
        int i=1;
        while(i<=caseNum){
            String date = systemInput.readLine();
            int month = Integer.parseInt(date.charAt(0)+""+date.charAt(1));
            int day = Integer.parseInt(date.charAt(2)+""+date.charAt(3));
            int year = Integer.parseInt(date.substring(4));
            
            Calendar c = new GregorianCalendar();
            switch(month){
                case(1):    c.set(year, Calendar.JANUARY, day);
                    break;
                case(2):    c.set(year, Calendar.FEBRUARY, day);
                    break;
                case(3):    c.set(year, Calendar.MARCH, day);
                    break;
                case(4):    c.set(year, Calendar.APRIL, day);
                    break;
                case(5):    c.set(year, Calendar.MAY, day);
                    break;
                case(6):    c.set(year, Calendar.JUNE, day);
                    break;
                case(7):    c.set(year, Calendar.JULY, day);
                    break;
                case(8):    c.set(year, Calendar.AUGUST, day);
                    break;
                case(9):    c.set(year, Calendar.SEPTEMBER, day);
                    break;
                case(10):    c.set(year, Calendar.OCTOBER, day);
                    break;
                case(11):    c.set(year, Calendar.NOVEMBER, day);
                    break;
                case(12):    c.set(year, Calendar.DECEMBER, day);
                    break;
            }
            
            
            
            for(int j=0;j<40;j++){
                c.add(Calendar.DATE, 7);
            }
            
            Date date1 = c.getTime();
            SimpleDateFormat a = new SimpleDateFormat("MM/dd/yyyy");
            String date2 = a.format(date1);
            
            int tDay = Integer.parseInt(date2.charAt(3)+""+date2.charAt(4));
            int tMonth = Integer.parseInt(date2.charAt(0)+""+date2.charAt(1));
            
            if((tMonth==12&&tDay>=23&&tDay<=31)||(tMonth==1&&tDay<=20))   
                zodiac="capricorn";
            else if((tMonth==1&&tDay>=21&&tDay<=31)||(tMonth==2&&tDay<=19))
                zodiac="aquarius";
            else if((tMonth==2&&tDay>=20&&tDay<=29)||(tMonth==3&&tDay<=20))
                zodiac="pisces";
            else if((tMonth==3&&tDay>=21&&tDay<=31)||(tMonth==4&&tDay<=20))
                zodiac="aries";
            else if((tMonth==4&&tDay>=21&&tDay<=30)||(tMonth==5&&tDay<=21))
                zodiac="taurus";
            else if((tMonth==5&&tDay>=22&&tDay<=31)||(tMonth==6&&tDay<=21))
                zodiac="gemini";
            else if((tMonth==6&&tDay>=22&&tDay<=30)||(tMonth==7&&tDay<=22))
                zodiac="cancer";
            else if((tMonth==7&&tDay>=23&&tDay<=31)||(tMonth==8&&tDay<=21))
                zodiac="leo";
            else if((tMonth==8&&tDay>=22&&tDay<=31)||(tMonth==9&&tDay<=23))   
                zodiac="virgo";
            else if((tMonth==9&&tDay>=24&&tDay<=30)||(tMonth==10&&tDay<=23))
                zodiac="libra";
            else if((tMonth==10&&tDay>=24&&tDay<=31)||(tMonth==11&&tDay<=22))
                zodiac="scorpio";
            else if((tMonth==11&&tDay>=23&&tDay<=30)||(tMonth==12&&tDay<=22))
                zodiac="sagittarius";

            System.out.println(i+" "+date2+" "+zodiac);
            i++;
        
        }
        
    }
    
}
