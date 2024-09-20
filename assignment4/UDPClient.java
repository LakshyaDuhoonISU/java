// Q12 - WAP to create a UDP client application and UDP server application. Client will send a number to server. Server has to calculate the cube of a number sent back to the client.

import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        int n = 8;
        String s1 = n + "";
        byte b1[] = s1.getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length, ia, 5555);
        ds.send(dp1);

        byte b2[] = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(b2, b2.length);
        ds.receive(dp2);
        String s2 = new String(dp2.getData(), 0, dp2.getLength());
        System.out.println("Result: " + s2);
        ds.close();
    }
}
