
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import java.util.Scanner;
public class HttpURLConnectionExample {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		HttpURLConnectionExample http = new HttpURLConnectionExample();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet1();
		http.sendGet2();
		http.sendGet3();
		http.sendGet4();
		http.sendGet5();

		//image dimensions
		int width=128;
		int height=128;

		//creates buffered image object
		BufferedImage img= new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		//File object
		File f=null;

		// Creates Scanner to read through random

		Scanner scan= new Scanner(System.in);

		for (int y=0; y<height; y++){
			for (int x=0; x<width; x++){
				int r= scan.nextInt();
				int g=scan.nextInt();
				int b= scan.nextInt();
				int p= (r<<16) | (g<<8) | b;
				img.setRGB(x,y,p);
			}
		}

		//Write image here
		try {
			f= new File("D:\\Image\\Output.png");
		ImageIO.write(img, "png", f);
		} catch (IOException e){
		System.out.println("Error "+ e);
		}
	}

	// HTTP GET request
	private void sendGet1() throws Exception {

		String url = "https://www.random.org/integers/?num=10000&min=0&max=255&col=1&base=10&format=plain&rnd=new";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response1 = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response1.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response1.toString());

	}

	// HTTP GET request
	private void sendGet2() throws Exception {

		String url = "https://www.random.org/integers/?num=10000&min=0&max=255&col=1&base=10&format=plain&rnd=new";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response2 = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response2.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response2.toString());
	}

	// HTTP GET request
	private void sendGet3() throws Exception {

		String url = "https://www.random.org/integers/?num=10000&min=0&max=255&col=1&base=10&format=plain&rnd=new";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response3 = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response3.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response3.toString());
	}

	// HTTP GET request
	private void sendGet4() throws Exception {

		String url = "https://www.random.org/integers/?num=10000&min=0&max=255&col=1&base=10&format=plain&rnd=new";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response4 = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response4.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response4.toString());
	}

	// HTTP GET request
	private void sendGet5() throws Exception {

		String url = "https://www.random.org/integers/?num=10000&min=0&max=255&col=1&base=10&format=plain&rnd=new";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response5 = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response5.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response5.toString());
	}
}


		
		
