package edu.zzu.project25;

import java.io.IOException;

public class Demo02_RunTime {

	public static void main(String[] args) throws IOException {
          Runtime rt = Runtime.getRuntime();
          //rt.exec("shutdown -s -t 300");
          rt.exec("shutdown -a");
	}

}

