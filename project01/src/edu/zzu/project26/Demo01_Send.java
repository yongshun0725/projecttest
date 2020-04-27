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
	 *  1.发送send
	 *       创建DatagramSocket，随机端口号
	 *       创建DatagramPactet，指定数据、长度、地址、端口号
	 *       使用DategramSocket发送DatagramPacket
	 *       关闭DategramSocket
	 * @throws SocketException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws Exception {
		String str = "What are you 弄啥嘞？";
		DatagramSocket socket= new DatagramSocket();   //创建socket相当于创建码头
		DatagramPacket packet =                        //创建packet相当于创建集装箱
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);
		socket.close();
		
	}

}

