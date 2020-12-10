package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MS949App {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\workspace\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			String str = br.readLine();// 한 줄씩 리드(줄바꿈기호 제외)
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
	}

}
