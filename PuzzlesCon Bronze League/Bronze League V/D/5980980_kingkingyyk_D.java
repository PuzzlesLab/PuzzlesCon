import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static double distBetweenPoints (double [] p1, double [] p2) {
		double dx=p1[0]-p2[0];
		double dy=p1[1]-p2[1];
		return Math.sqrt(dx*dx+dy*dy);
	}
	public static void main(String[]args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(s);
			double [][] holes=new double [Integer.parseInt(st.nextToken())][2];
			double [] gopher=new double [] {Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken())};
			double [] dog=new double [] {Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken())};
			
			for (int i=0;i<holes.length;i++) {
				st=new StringTokenizer(br.readLine());
				holes[i]=new double [] {Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken())};
			}
			
			boolean found=false;
			for (int i=0;i<holes.length && !found;i++) {
				double distHG=distBetweenPoints(holes[i],gopher);
				double distDG=distBetweenPoints(holes[i],dog);
				if (distDG/2>=distHG) {
					found=true;
					System.out.printf("The gopher can escape through the hole at (%.3f,%.3f).\n",holes[i][0],holes[i][1]);
				}
			}
			
			if (!found) {
				System.out.println("The gopher cannot escape.");
			}
			
			if ((s=br.readLine())==null) {
				break;
			}
		}
	}
}