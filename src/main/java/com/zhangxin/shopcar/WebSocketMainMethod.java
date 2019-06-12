package com.zhangxin.shopcar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class WebSocketMainMethod {

    private static int PORT = 8080;

    public static void main(String[] args) throws Exception {
        MWebSocketService socketServer = new MWebSocketService(PORT);
        socketServer.start();
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            int port = socketServer.getPort();
            System.out.println(String.format("服务已启动: %s:%d", ip, port));
        } catch (Exception e) {
            e.printStackTrace();
        }
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        while (true) {
            try {
                String msg = reader.readLine();
                socketServer.sendToAll(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
