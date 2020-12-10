package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\workspace\\img.jpg");

		OutputStream out = new FileOutputStream("C:\\javaStudy\\workspace\\buffimg.jpg");

		byte[] buff = new byte[1024];

		System.out.println("복사 시작");
		while (true) {
			int bData = in.read(buff);
			if (bData == -1) {
				System.out.println("복사 완료");
				break;
			}
			out.write(buff);
		}
		out.close();
		in.close();
		/*
		System.out.println("복사 시작");
		while (true) {
			int bData = in.read();

			if (bData == -1) {// 데이터의 마지막인지 체크
				System.out.println("복사 완료");
				break;
			}
			out.write(bData);
		}
		out.close();
		in.close();
		*/
	}

}
