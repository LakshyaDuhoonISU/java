import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ServerEx2 {
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
