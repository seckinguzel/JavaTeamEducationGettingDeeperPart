package _4NetworkingSockets;

import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;

public class Client {
    public static void main(String[] args) {
        try {
            // Sunucuya bağlanmak için soket oluşturma
            Socket socket = new Socket("localhost", 8080);

            // Sunucuya veri gönderme
            OutputStream outputStream = socket.getOutputStream();
            String message = "Merhaba, sunucu!";
            outputStream.write(message.getBytes());

            // Soketi kapatma
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

