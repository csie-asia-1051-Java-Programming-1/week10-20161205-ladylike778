﻿package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n<=120){
			System.out.println(n*2.1f+"\n"+n*2.1f);			
		}else if(n<=330){
			System.out.println(252+(n-120)*3.02);
			System.out.println(252+(n-120)*2.68);
		}else if(n<=500){
			System.out.println(886.2+(n-330)*4.39);
			System.out.println(814.8+(n-330)*3.61);
		}else if(n<=700){
			System.out.println(1632.5+(n-500)*4.97);
			System.out.println(1428.5+(n-500)*4.01);
		}else if(n>700){
			System.out.println(1756.75+(n-700)*5.63);
			System.out.println(1528.75+(n-700)*4.5);
		}
	}	
}
