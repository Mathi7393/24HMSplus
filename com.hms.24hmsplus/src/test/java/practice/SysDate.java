package practice;

import java.util.Arrays;
import java.util.Date;

public class SysDate {

	public static void main(String[] args) {
		Date d=new Date();
		String s=d.toString();
		System.out.println(d);
		System.out.println(s);
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		System.out.println(Integer.parseInt(str[2]));

	}

}
