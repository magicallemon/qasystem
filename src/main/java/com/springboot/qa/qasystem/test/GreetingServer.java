/**
 * L
 * Copyright (c) 1991-2021 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 *
 * @author L
 * @version : GreetingServer.java, v  2021年01月06日 16:10 L Exp $
 */
public class GreetingServer extends Thread{
    private ServerSocket serverSocket;
    private GreetingServer(){
        try {
            serverSocket = new ServerSocket(6066);
            serverSocket.setSoTimeout(10000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("等待远程连接：-----");
                Socket server = serverSocket.accept();
                System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            } catch (SocketTimeoutException e) {
                System.out.println("Socket timed out!");
                break;
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

    }
    public static void main(String[] args) {
        try {
            System.out.println("【启动服务端】");
            Thread thread = new GreetingServer();
            thread.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}