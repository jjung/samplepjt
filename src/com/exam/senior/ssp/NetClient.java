package com.lgcns.senior.ssp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class NetClient {

    private BufferedReader in;
    private PrintWriter out;

    public NetClient() {
    }

    public void connectToServer() throws IOException {

        Socket socket = new Socket("127.0.0.1", 9898);
        
        new BufferedReader(new InputStreamReader(socket.getInputStream()))
	    	.lines()
	    	.forEach(System.out::println)
	    	;
        
        out = new PrintWriter(socket.getOutputStream(), true);
        socket.close();
    }

    public static void main(String[] args) throws Exception {
        NetClient client = new NetClient();
        client.connectToServer();
    }

}
