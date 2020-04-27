package edu.zzu.project14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo9_1_Test {
/* 
 * A:案例分析
 * 需求：算一下你来到这个世界多少天了
 * 分析：
 * 1.将生日字符串和今天字符串存在String类型对象中
 * 2.定义日期格式化对象
 * 3.将日期字符串转化为日期对象
 * 4.通过日期对象获取毫秒值
 * 5.将两个对象毫秒值相减
 */
	public static void main(String[] args) throws ParseException {
    //将生日保存
		String bir = "1996年07月25日";
		String today = "2020年02月16日";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d1 = sdf.parse(bir);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		System.out.println(time / 1000 / 60 /60 / 24 / 365);
	}

}
