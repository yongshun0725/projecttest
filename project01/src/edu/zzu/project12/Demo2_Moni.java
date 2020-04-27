package edu.zzu.project12;

import java.util.Scanner;

/**
 * 
 * @ClassName: Demo2_Moni
 * @Description: A:案例演示 需求：模拟登陆，三次机会，并提示还有几次机会 用户名都是admin 分析： 1.模拟登陆，需要键盘输入
 *               2.三次机会，需要循环 3.提示还有几次机会，需要判断
 * @author sys
 * @date 2020-02-13 03:13:26
 */
public class Demo2_Moni {

	public static void main(String[] args) {
		int num = 3; // 三次机会

		Scanner sc = new Scanner(System.in);
		while (true) {
			if (num > 0) {
				System.out.println("请输入用户名：");
				String name = sc.nextLine(); // 获取输入的账号
				System.out.println("请输入密码：");
				String pass = sc.nextLine(); // 获取输入的账号
				if (name.equals("admin") && pass.equals("admin")) {
					System.out.println("登陆成功！！");
					break;
				} else {
					num--;
					System.out.println("登录失败！您还有" + num + "次机会");
					if (num == 0) {
						System.out.println("您的登陆次数已经用完！！");
					}
				}
			}
		}

	}

}
