package edu.zzu.project26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo01_Receive {

	/**
	 * 
	 * @param args   
	 *
	 *  2.接受Receive
	   *        创建DatagramSocket，指定端口
	   *        创建DatagramPacket，指定数组，长度
	   *        使用DatagramSocket接收DatagramPacket
	   *        关闭DatagramSocket
	   *        从DatagramPackeet获取数据
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);
		
		byte[] arr = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(arr, 0,len));
		socket.close();
	}

}

