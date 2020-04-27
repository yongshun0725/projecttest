package edu.zzu.project26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo03_MoreThread {

	public static void main(String[] args) {
        new Receive().start();
        new Send().start();
	}

}

class Receive extends Thread {
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(5555);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			while (true) {
				socket.receive(packet);
				byte[] arr = packet.getData();
				int len = packet.getLength();
				if ("0000".equals(new String(arr, 0, len))) {
					socket.close();
					break;
				}
				String ip = packet.getAddress().getHostAddress();
				int port = packet.getPort();
				System.out.println("IPÊÇ£º" + ip + "  ¶Ë¿Ú£º" + port + "   " + new String(arr, 0, len));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
class Send extends Thread{
	public void run() {
		try {
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
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}