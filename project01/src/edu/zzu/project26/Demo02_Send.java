package edu.zzu.project26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo02_Send {

	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        while(true) {
        	String str = sc.nextLine();
        	DatagramPacket packet = 
        			new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"),5555); 
        	socket.send(packet);
        	if("0000".equals(str)) {
        		break;
        	}
        }
        sc.close();
        socket.close();
	}

}

