package ex05;

import java.text.MessageFormat;
import java.util.Arrays;

public class StringMethod {

	
	public static void main(String[] args) {
		
		System.out.println("문자열갯수: " + "hello".length());
		System.out.println("문자열갯수: " + "안녕하세요".length());
		
		//			  01234 56789  공백도 갯수에 포함
		String str = "Java 프로그래밍";
		System.out.println("5위치의 글자:" + str.charAt(5));
		System.out.println("1위치의 글자:" + str.charAt(1));
		
		//			   012345 678910
		String str2 = "Hello World";
		System.out.println("부분문자열 substring" + str2.substring(0,4+1) );  // 0~4
		System.out.println("부분문자열 substring" + str2.substring(6) );  // 6~끝까지
		
		String str3 = "Banana";
		System.out.println("문자(a)의 위치" + str3.indexOf('a'));		//1
		System.out.println("문자(a)의 위치" + str3.indexOf('a',2));		//3
		System.out.println("문자(a)의 위치" + str3.lastIndexOf('a'));	//5
		
		//	~를 포함하는	: 시작, 중간, 끝
		String str4 = "apple pie ver2";
		System.out.println("pie 문자열을 포함하는가" + str4.contains("pie"));
		//  ~로 시작되는
		String str5 = "filename.java";
		System.out.println( "file이 포함:" + str5.startsWith( "file" ));
		System.out.println( "file의 위치:" + str5.indexOf( "file" ));
		// 	~로 끝나는
		System.out.println(".java로 끝나는:" + str5.endsWith(".java"));
		
		// 문자열 비교
		String str6 = "Java";
		String str7 = "java";
		System.out.println(str6.equals(str7));				// 
		System.out.println(str6.equalsIgnoreCase(str7));	// 대소문자 무시
		
		// 대소문자 변환
		System.out.println(str6.toUpperCase());
		System.out.println(str6.toLowerCase());
		
		// 앞뒤의 공백 제거
		String str8 = "     짱구    ";
		System.out.println(str8);
		System.out.println(str8.length());
	
		System.out.println( str8.trim());
		System.out.println( str8.trim().length());
		
		//문자열 교체
		String str9 = "I love Java";
		System.out.println(str9);
		System.out.println(str9.replace("Java", "Python"));
		str9 = str9.replace("Java", "Anaconda");
		System.out.println(str9);
		
		// 문자열 분리 -> 문자열 배열
		String str10 = "red,green,blue";
		System.out.println(str10);
		String [] colorArr = str10.split(",");
		System.out.println(colorArr);// [Ljava.lang.String;@8bcc55f
		
		System.out.println(Arrays.toString(colorArr));//[red, green, blue]
		System.out.println(colorArr[0]);
		System.out.println(colorArr[1]);
		System.out.println(colorArr[2]);
		
		String empty ="";	// 빈문자열   : length()   :0 공백도 없냐 true
		String blank =" 	";	// 공백문자열 : length()   :1 공백만있냐 true
		
		System.out.println(empty.isEmpty());
		System.out.println(blank.isBlank());
		
		// 포맷 문자열을 만든다.
		String name = "김태연";
		int age =38;
		String msg = String.format("이름:%s 나이:%d",name, age);
		System.out.println(msg);
		String msg2 = MessageFormat.format("이름:{0}, 나이:{1}",name, age);
		System.out.println(msg2);
		
		// 해당 부호로 문자열을 만듦니다. 스플릿 반대
		String result = String.join("-",colorArr);
		System.out.println(result);
		String result2 = String.join("-","2026","10","29");
		System.out.println(result2);
		
		// 몇번 반복합니다.
		String star		="*";
		System.out.println(star.repeat(5));
		
		
	}

}
