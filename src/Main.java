import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Kelime,Kelime2;
		boolean durum=true;
		char tahmin;
		int sayac=0;
		int yanlis=0;
		int yanlis2=0;
		
		
		System.out.print("Kelimeyi Giriniz (Baþka biri girecek): ");
		Kelime=input.next();
		Kelime=Kelime.toLowerCase();
		char dizi[] =new char[Kelime.length()];
		char dizi2[] =new char[Kelime.length()];

		for(int i=0;i<Kelime.length();i++){
			dizi[i]=Kelime.charAt(i);
		}
		
		while(durum){
		System.out.print("Harf giriniz: ");
		Kelime2=input.next();
		Kelime2=Kelime2.toLowerCase();
		tahmin=Kelime2.charAt(0);
		yanlis=0;
		for(int i=0;i<Kelime.length();i++){
			if(tahmin==dizi[i]){
				dizi2[i]=tahmin;
			}
			else{
				yanlis++;
			}
		}
		if(yanlis==Kelime.length()){
			yanlis2++;
		}
		for(int i=0;i<Kelime.length();i++){
			if(dizi2[i] == 0){
				System.out.print("*-");
			}
			else{
			System.out.print(dizi2[i]+"-");
			}
		}
		System.out.println();
		sayac=0;
		for(int i=0;i<Kelime.length();i++){
			if(dizi2[i] == 0){
				sayac++;
			}
		}
		if(sayac==0){
			System.out.println((yanlis2+1)+" tane yanlis bildiniz.");
			System.out.println("tebrikler kelimeyi bildiniz.");
			durum=false;
		}
		}
	}

}
