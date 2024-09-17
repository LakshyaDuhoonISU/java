import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5555);
        byte b1[] = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1, 0, b1.length);
        ds.receive(dp1);
        String s2 = new String(dp1.getData(), 0, dp1.getLength());
        System.out.println(s2);
        int num = Integer.parseInt(s2);
        int res = num * num;
        byte b2[] = String.valueOf(res).getBytes();
        InetAddress ia1 = InetAddress.getLocalHost();
        DatagramPacket dp2 = new DatagramPacket(b2, b2.length, ia1, dp1.getPort());
        ds.send(dp2);
        ds.close();
    }
}
