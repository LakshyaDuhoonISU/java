// Q10 - WAP to demonstrate URL class.

public class URLEx {
    public static void main(String[] args) {
        try {
            java.net.URL url = new java.net.URL("https://www.google.com:80/index.html");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
        } catch (java.net.MalformedURLException e) {
            System.out.println("Malformed URL");
        }
    }
}
