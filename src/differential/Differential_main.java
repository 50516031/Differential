package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Input a > ");

		double a = Double.parseDouble(scan.next());

		System.out.print("Input h > ");

		double h = Double.parseDouble(scan.next());



		Differential_lib dlib[] = new Differential_lib[15];

		for(int i = 0; i < dlib.length; i++){

		//Differential_lib dlib = new Differential_lib(a,h);

			dlib[i] = new Differential_lib(a,h);

			double rx = dlib[i].getRx();

			double dx = dlib[i].getDx();

			System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+rx);

			System.out.println("f(x)=x^2��x="+a+",h="+h+"�ɂ����鐔�l������"+dx);

			System.out.println("f(x)=x^2��x="+a+",h="+h+"�ɂ����鑊�Ό덷��"+Math.abs(rx - dx)/rx*100);

			h /= 10;

		}

	}



}