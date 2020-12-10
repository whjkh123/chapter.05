package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BuffedStreamApp {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\workspace\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);

		OutputStream out = new FileOutputStream("C:\\javaStudy\\workspace\\buffedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		System.out.println("복사 시작");
		while (true) {
			int bData = bin.read();
			if (bData == -1) {
				System.out.println("복사 완료");
				break;
			}
			bout.write(bData);
		}
		bout.close();
		bin.close();
	}

}
