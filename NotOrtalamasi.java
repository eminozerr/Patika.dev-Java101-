import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mat, fizik, kimya, turkce, tarih, muzik;

		System.out.print("Matematik Notunuz : ");
		mat = input.nextInt();
		
		System.out.print("Fizik Notunuz : ");
		fizik = input.nextInt();
		
		System.out.print("Kimya Notunuz : ");
		kimya = input.nextInt();
		
		System.out.print("Türkçe Notunuz : ");
		turkce = input.nextInt();
		
		System.out.print("Tarih Notunuz : ");
		tarih = input.nextInt();
		
		System.out.print("Müzik Notunuz : ");
		muzik = input.nextInt();
		
		double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println("Ortalamanız : " +ortalama);
		
		if (ortalama>=60) {
			System.out.println("Dersten Geçtiniz!");
		}else {
			System.out.println("Dersten Kaldınız");
		}
	}

}