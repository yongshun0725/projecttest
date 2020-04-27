package edu.zzu.project26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04_GuiChat extends Frame {

	/**
	 * @Fields serialVersionUID : TODO(描述)
	 * @author sys
	 * @date 2020-03-06 04:27:13
	 */
	private static final long serialVersionUID = 1L;
	private TextField tf;
	private TextArea viewtext;
	private TextArea sendText;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private DatagramSocket socket;
	private BufferedWriter bw;

	public Demo04_GuiChat() {
		init();
		southPannel();
		centerPanel();
		event();
	}

	// 关闭窗体
	private void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				try {
					socket.close();
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewtext.setText("");
			}
		});
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send(new byte[]{-1},tf.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		});
	}
	private void shake() {
		int x = this.getLocation().x;
		int y = this.getLocation().y;
			try {
				this.setLocation(x + 20,y + 20);
				Thread.sleep(300);
				this.setLocation(x + 20,y - 20);
				Thread.sleep(300);
				this.setLocation(x - 20,y + 20);
				Thread.sleep(300);
				this.setLocation(x - 20,y - 20);
				Thread.sleep(300);
				this.setLocation(x,y);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	}     
	private void logFile() throws IOException {
		bw.flush();
		FileInputStream fis = new FileInputStream("config.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int len;
		byte[] arr = new byte[8192];
		while((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		String str = baos.toString();
		viewtext.setText(str);
		fis.close();
	}
	
	private void send() throws Exception {
		String message = sendText.getText();
		String ip = tf.getText();
		socket = new DatagramSocket();
		send(message.getBytes(), ip);
		String time = getCurrentTime();
		String str = time + " 我对：" + ip + "说：\r\n" + message + "\r\n";
		viewtext.append(str);
		bw.write(str);
		sendText.setText("");
		socket.close();
	}

	private void send(byte[] arr, String ip) throws Exception {
		DatagramPacket packet = new 
				DatagramPacket(arr, arr.length, InetAddress.getByName(ip),9999);
		socket.send(packet);
	}
	
	private String getCurrentTime() {
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		return sdf.format(data);
	}

	// 中间
	private void centerPanel() {
		Panel center = new Panel();
		viewtext = new TextArea();
		sendText = new TextArea(5, 1);
		center.setLayout(new BorderLayout());
		center.add(viewtext, BorderLayout.CENTER);
		center.add(sendText, BorderLayout.SOUTH);
		viewtext.setBackground(Color.WHITE);
		viewtext.setEditable(false);
		sendText.setFont(new Font("xxx", Font.PLAIN, 20));
		viewtext.setFont(new Font("xxx", Font.PLAIN, 15));
		this.add(center, BorderLayout.CENTER);

	}

	// 南方(下方)
	private void southPannel() {
		Panel south = new Panel();
		tf = new TextField(15);
		tf.setText("127.0.0.1");
		send = new Button("发送");
		log = new Button("记录");
		clear = new Button("清屏");
		shake = new Button("震动");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south, BorderLayout.SOUTH);
	}

	private void init() {
		this.setLocation(500, 200);
		this.setSize(500, 700);
		new Receive().start();
		try {
			socket = new DatagramSocket();
			bw = new BufferedWriter(new FileWriter("config.txt",true));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setVisible(true);
	}


	private class Receive extends Thread {

		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(9999);
				DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

				while (true) {
					socket.receive(packet);
					byte[] arr = packet.getData();
					int len = packet.getLength();
					if(arr[0] == -1 && len == 1) {
						shake();
						continue;
					}
					String message = new String(arr, 0, len);
					String time = getCurrentTime();
					String ip = packet.getAddress().getHostAddress();
					String str = time + " " + ip + " 对我说：\r\n" + message + "\r\n";
					viewtext.append(str);
					bw.write(str);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		new Demo04_GuiChat();
		/*
		 * byte[] b = new byte[] {-1}; System.out.println(new String(b,0,1));
		 * System.out.println(b[0]);
		 */
	}
}
