package edu.zzu.project26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Demo01_Send {

	/**
	 * 
	 * @param args   
	 *
	 *  1.����send
	 *       ����DatagramSocket������˿ں�
	 *       ����DatagramPactet��ָ�����ݡ����ȡ���ַ���˿ں�
	 *       ʹ��DategramSocket����DatagramPacket
	 *       �ر�DategramSocket
	 * @throws SocketException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws Exception {
		String str = "What are you Ūɶ�ϣ�";
		DatagramSocket socket= new DatagramSocket();   //����socket�൱�ڴ�����ͷ
		DatagramPacket packet =                        //����packet�൱�ڴ�����װ��
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);
		socket.close();
		
	}

}

