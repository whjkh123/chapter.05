package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\workspace\\song.txt");
		BufferedReader br = new BufferedReader(fr);

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
