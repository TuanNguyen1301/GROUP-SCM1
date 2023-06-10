package project;
import java.util.Scanner;
public class Calculate {
	
		int a,b,c;
		float ketqua;
		Scanner sc=new Scanner(System.in);
		public void nhapGiaTri() {
			System.out.println("Nhap a : ");
			a=sc.nextInt();
			System.out.println("Nhap b : ");
			b=sc.nextInt();
			System.out.println("Ban muon nhap phep tinh nao ???? ");
			c=sc.next().charAt(0);
		}
		
		public void nhapPhepTinh() {
			
			if(c=='+') {
				System.out.println("Dap an ="+(a+b));
			}
			if(c=='-') {
				System.out.println("Dap an ="+(a-b));
			}
			if(c=='*') {
				System.out.println("Dap an ="+(a*b));
			}
			if(c=='/') {
				System.out.println("Dap an ="+(a/b));
			}
		}

		public static void main(String[] args) {
			Calculate  c = new  Calculate ();
			c.nhapGiaTri();
			c.nhapPhepTinh();
	}
}
