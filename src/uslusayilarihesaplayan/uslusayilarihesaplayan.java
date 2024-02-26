package uslusayilarihesaplayan;

import java.util.Scanner;

public class uslusayilarihesaplayan {

	public static void main(String[] args) {
		
		int sayi,us,i,j;
		long sonuc=1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üssü hesaplanacak sayıyı giriniz : ");
		sayi = input.nextInt();
		
		System.out.print("Üs değerini giriniz : ");
		us = input.nextInt();
		
		for(i=0 ; i< us ; i++) {
			
			sonuc = sayi * sonuc;		
			
		}
		
		System.out.println(sayi+"^"+us+" sayısının değeri : "+sonuc);		
		
		

	}

}
