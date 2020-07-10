package com.biz.grade.exec;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;

public class PrintWriterEx_01 {
	
	public static void main(String[] args) {
		
		
		String fileName = "src/com/biz/grade/exec/data/test1.txt";
		FileWriter fileWriter = null;
		PrintWriter pWriter= null;
		
		try {
			/*
			 * printwriter 는 보통 단독으로 사용하지 않고
			 * filewriter 로 파일을 open 한후 프린라이터 연결하여 사용한다
			 * 
			 * FIlewriter 로 파일을 오픈할대 두번째 매개변수로 true을 주입하면
			 * 파일을 append mode 로 open한다
			 * append mode로 open이 되면 기존에 저장된 내용을 삭제하지 않고
			 * 계속에서 문자열을 추가하는 상태로 변경된다
			 */
			
			fileWriter = new FileWriter(fileName,true);
			// printStream() 으로 파일을 기록하기 위해  open
			// 기존파일이 삭제되고 새로 생성
			
			 pWriter = new PrintWriter(fileWriter);
			
			 
			 
			 
			 
			 Date date = new Date();
			 pWriter.println("대한민국만세" + date.toString());
			 
			 
			 pWriter.flush();
			 pWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
