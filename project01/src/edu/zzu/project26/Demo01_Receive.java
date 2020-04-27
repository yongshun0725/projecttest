package edu.zzu.project26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo01_Receive {

	/**
	 * 
	 * @param args   
	 *
	 *  2.����Receive
	   *        ����DatagramSocket��ָ���˿�
	   *        ����DatagramPacket��ָ�����飬����
	   *        ʹ��DatagramSocket����DatagramPacket
	   *        �ر�DatagramSocket
	   *        ��DatagramPackeet��ȡ����
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

