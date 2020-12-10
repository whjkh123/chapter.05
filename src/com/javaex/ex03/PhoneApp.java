package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\workspace\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}
			String data[] = str.split(",");// ","를 기준으로 분할
			System.out.println("이름: " + data[0]);
			System.out.println("핸드폰: " + data[1]);
			System.out.println("회사: " + data[2]);
			System.out.println("=========================================");
		}
		br.close();
	}

}
