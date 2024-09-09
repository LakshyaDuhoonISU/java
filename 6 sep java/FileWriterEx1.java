import java.io.*;

public class FileWriterEx1 {
    public static void main(String[] args) throws IOException {
        String str = "We are all born with a divine fire in us."
                + "Our efforts should be to give wings to this fire and "
                + "fill the world with the glow of its goodness.";
        int len = str.length();
        char[] buff = new char[len];
        str.getChars(0, len, buff, 0); // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin); used to convert string to char array
        try (FileWriter fout1 = new FileWriter("/Users/lakshyaduhoon/Desktop/FileOut1.txt");
                FileWriter fout2 = new FileWriter("/Users/lakshyaduhoon/Desktop/FileOut2.txt");
                FileWriter fout3 = new FileWriter("/Users/lakshyaduhoon/Desktop/FileOut3.txt");
                FileWriter fout4 = new FileWriter("/Users/lakshyaduhoon/Desktop/FileOut4.txt");
                FileWriter fout5 = new FileWriter("/Users/lakshyaduhoon/Desktop/FileOut4.txt", true);) {
            fout1.write(str); // write(charSequence);
            fout1.append(str.charAt(0)); // append(char c);
            for (int i = 0; i < len / 4; i++) {
                fout2.write(buff[i]); // write(char c);
            }
            fout2.append("\n"); // append(charSequence);
            StringBuilder sb =new StringBuilder("\nAppending to fout2");
            fout2.append(str,len/2,len); // append(charSequence, int start, int end);
            fout2.append(sb); // append(CharSequence csq);
            
            fout3.write(buff); // write(char[] cbuf);

            fout4.write(buff,len-len/4,len/4); // write(char[] cbuf, int off, int len);
            fout4.write("Quote by APJ Abdul Kalam"); // write(String str);
        }
    }
}
