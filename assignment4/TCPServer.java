// Q11 - WAP to create chat application using the concept of connection oriented approach using TCP protocol.

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5555);
        Socket s = ss.accept();
        String str = "", str2 = "";
        Scanner sc = new Scanner(System.in);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        while (!str.equals("stop")) {
            str2 = din.readUTF();
            System.out.println("Client says: " + str2);

            str = sc.nextLine();
            dout.writeUTF(str);
            dout.flush();
        }
        din.close();
        dout.close();
        sc.close();
        ss.close();
    }
}
