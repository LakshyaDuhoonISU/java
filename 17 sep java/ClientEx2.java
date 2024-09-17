import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ClientEx2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5555);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        String str = "", str2 = "";
        Scanner sc = new Scanner(System.in);
        while (!str.equals("stop")) {
            str = sc.nextLine();
            dout.writeUTF(str);
            dout.flush();

            str2 = din.readUTF();
            System.out.println("Server says: " + str2);
        }
        din.close();
        dout.close();
        sc.close();
        s.close();
    }
}
