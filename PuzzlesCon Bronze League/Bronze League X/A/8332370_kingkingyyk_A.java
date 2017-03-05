import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

class Main {
	
	public static class Sign {
		private String sign;
		private int monthStart, monthEnd, dayStart, dayEnd;
		
		public Sign(String s, int ms, int ds, int me, int de) {
			this.sign=s;
			this.monthStart=ms;
			this.monthEnd=me;
			this.dayStart=ds;
			this.dayEnd=de;
		}
		
		public boolean isInInterval (LocalDate dt) {
			LocalDate start=LocalDate.of(dt.getYear(), monthStart, dayStart);
			LocalDate end=LocalDate.of(dt.getYear(), monthEnd, dayEnd);
			
			return (start.compareTo(dt)<=0 && end.compareTo(dt)>=0 );
		}
		
		public String toString() {
			return this.sign;
		}
	}
	
	public static ArrayList<Sign> Signs=new ArrayList<>();
	
	public static void setup() {
		Signs.add(new Sign("capricorn",1,1,1,20));
		Signs.add(new Sign("aquarius",1,21,2,19));
		Signs.add(new Sign("pisces",2,20,3,20));
		Signs.add(new Sign("aries",3,21,4,20));
		Signs.add(new Sign("taurus",4,21,5,21));
		Signs.add(new Sign("gemini",5,22,6,21));
		Signs.add(new Sign("cancer",6,22,7,22));
		Signs.add(new Sign("leo",7,23,8,21));
		Signs.add(new Sign("virgo",8,22,9,23));
		Signs.add(new Sign("libra",9,24,10,23));
		Signs.add(new Sign("scorpio",10,24,11,22));
		Signs.add(new Sign("sagittarius",11,13,12,22));
		Signs.add(new Sign("capricorn",12,23,12,31));
	}
	
	public static void main (String [] args) throws IOException {
		setup();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=1;testCase<=testCaseCount;testCase++) {
			String s=br.readLine();
			int year=Integer.parseInt(s.substring(4, 8));
			int month=Integer.parseInt(s.substring(0, 2));
			int day=Integer.parseInt(s.substring(2, 4));
			
			LocalDate dt=LocalDate.of(year,month,day);
			dt=dt.plusWeeks(40);
			
			int month2=dt.getMonthValue();
			int day2=dt.getDayOfMonth();
			
			String sign="";
			for (int i=0;i<Signs.size();i++) if (Signs.get(i).isInInterval(dt)) {
				sign=Signs.get(i).toString();
				break;
			}
			
			String ms=String.valueOf(month2); if (ms.length()==1) ms="0"+ms;
			String ds=String.valueOf(day2); if (ds.length()==1) ds="0"+ds;
			String ys=String.valueOf(dt.getYear());
			while (ys.length()<4) ys="0"+ys;
			
			System.out.println(testCase+" "+ms+"/"+ds+"/"+ys+" "+sign);
		}
	}
	
}