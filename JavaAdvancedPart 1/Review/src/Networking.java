import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class Networking {
	
	public static void main(String[] args) throws Exception {
		String url = "www.simlilearn.com";
		
		InetAddress inetAddress = Inet4Address.getByName(url);
		
		System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));
		
		System.out.println("Host Address : " + inetAddress.getHostAddress());
		
		
	}

}
