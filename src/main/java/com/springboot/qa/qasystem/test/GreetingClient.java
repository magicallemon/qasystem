/**
 * L
 * Copyright (c) 1991-2021 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author L
 * @version : GreetingClient.java, v  2021年01月06日 15:51 L Exp $
 */
public class GreetingClient {
    public static void main(String[] args) {
        try {
            System.out.println("连接到主机：------");
            //创建客户端
            Socket client = new Socket("localhost",6066);
            System.out.println("远程主机地址："+client.getRemoteSocketAddress());
            OutputStream out = client.getOutputStream();
            DataOutputStream dataOut = new DataOutputStream(out);

            dataOut.writeUTF("Hello from"+client.getLocalSocketAddress());
            InputStream input = client.getInputStream();
            DataInputStream in = new DataInputStream(input);
            System.out.println("服务器响应："+in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}