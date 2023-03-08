package _4NetworkingSockets;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;

public class Server {
    public static void main(String[] args) {
        try {
            // Sunucu soketi oluşturma
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Sunucu başlatıldı, 8080 portunu dinliyor...");

            // İstemci bağlantılarını kabul etme
            Socket socket = serverSocket.accept();
            System.out.println("İstemci bağlandı: " + socket.getInetAddress().getHostAddress());

            // İstemciden veri alma
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String message = new String(buffer, 0, bytesRead);
            System.out.println("İstemciden gelen mesaj: " + message);

            // Soketi kapatma
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

