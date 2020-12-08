package ua.lviv.trainapp;

public class Application {
	public static void main(String[] args) {
		
//		������� 1: ��������� � �������� ������
		System.out.println("\n*[������� 1: ������� ��������� � �������� ������]");
		int d = 1;
		int e = 2;
		int res1 = d + e;
		int res2 = d - e; 
		int res3 = d * e;
		int res4 = d / e;
		
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
//		������� 2: ���� ���� ��������� ��������� �� �����? (���������, ���������)
		System.out.println("\n*[������� 2: ���� ���� ��������� ��������� �� �����?]");
		
		int a = 0;
		int b = a++;
		int c = a++;
		
		
		System.out.println("������� 2: " + a + " " + b + " " + c);
		
//		�������� � ����������
		
		
		int f = 1;
		int g = 2;
		int h = 3;
		
		f+=5; //f = f + 5 -> f = 1 + 5 = 6
		g*=4; //g = g * 4 -> g = 2 * 4 = 8
		h+=f*g; //h = h + f * g -> h = 3 + 6 * 8 = 51
		h%=6; //h = h % 6 -> h = 51 % 6 (51 - 6*8) = 3
		
		System.out.println("\n*[������� 3: �������� � ����������]");
		System.out.println("f =" + f);
		System.out.println("g =" + g);
		System.out.println("h =" + h);
		
//		������� 4: ����� ���������: ��������� ��������
		System.out.println("\n*[������� 4: ��������� ��������]");
		int a2 = -2;
	
		int r = a2 < 0? -3 : 2; //��������� ��������: ���� a2 < 0 = ture, �� r = -3; ���� a2 < 0 = false �� r = 2
		
		
		System.out.println("r = " + r);
	
		
//		������� 5: ����� ���������
		System.out.println("\n*[������� 5: ����� ���������:]");
		
		boolean j = true;
		boolean k = false;
		boolean l = j | k; // 1 + 0 => 1
		boolean m = j & k; // 1 * 0 => 0
		boolean n = (!j & k) | (j & !k); // (0 * 0) + (1 * 1) = 0 + 1 => 1 (true)
		boolean o = !j; //0 => false
		
		
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.println("o = " + o);
 
//		������� 6: �������� ��������� 
		System.out.println("\n*[������� 6: �������� ���������]");
		int t = 5;
		int u = 21;
		
		String result1 = (t < u) ? "Yes" : "No";
		String result2 = (t == u) ? "Yes" : "No";
		String result3 = (t >= u) ? "Yes" : "No";
		
		
		System.out.println("result = " + result1);
		System.out.println("result = " + result2);
		System.out.println("result = " + result3);
		
		
//		������� 7: ����������� if - else 
		System.out.println("\n*[������� 7:  ����������� if - else ]");
		int a1 = 5;
		int b1 = 12;
		
		if (a1 < b1) {
			System.out.println("b1 < b1");
		}
		else {
			System.out.println("b1 >= b1");
		}
		
//		������� 8: ����������� if - else 
		System.out.println("\n*[������� 8:  ����������� if - else - if]");
		int a3 = 3;
		int b3 = 5;
		
		if (a1 * a3 == b3) {
			System.out.println("a3 = b3");
		}
		else if (a3 * a3 < b3) {
			System.out.println("a3 < b3");
		} else {
			System.out.println("a3 > b3");
		}
		
//		������� 9: ����������� switch - case 
		System.out.println("\n*[������� 8:  ����������� iswitch - case]");	
		
//		String str1 = "Cancel";
		String str1 = "Yes";
		
		switch (str1) {
			case "No": 
				System.out.println("No");
				break;
			case "Yes":
				System.out.println("Yes");
//				break;
			case "Cancel": case "Ignore":
				System.out.println("Cancel or Ignore");
				break;
			default:
				System.out.println("Niether Yes or No or Cancel or Ignore");
		}	
		
		
		int k1 = 3;
		
		switch (k1) {
		case 1: case 3: case 4:
			System.out.println("1, 3, 4");
		case 2:
			System.out.println("2");
//			break;
		default: 
			System.out.println("default");
		}
		
		
//		������� 10: 
//		*����� for � ������ ������� �������� 	
//		*����� � ������ (while - � �����������, do - while - � ����������)	
//		while, do - while - ���� �� ���� ������� ��������, ��� ����� ����� ���������
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		int i = 1;
		
		while (i <= 10) {
			System.out.println("i2 = " + i);
			i++;
		}
		
		i = 1;
		do {
			System.out.println("\ni3 = " + i);
			i++;
		} while (i <= 10);
//		������ � for: do-while ���������� ���� � ���
		
		i = 1;
		do {
			System.out.println("\ni3= " + i);
			i++;
		} while (i == 10);
		
		
		int [] arr1 = {4, 5, 6, 2, 2, 1, 7};
		int [] arr2 = new int[4];
		int [] arr3;
		double arr4 [] = new double[7];
		double arr5 [] = {1.1, 1.2, 2.3, 1.4, 7.5, 1.6, 1.9};
		
		
		System.out.println(arr1[2]);
		System.out.println(arr2[3]); // ��������� �������� ������ ��� 0
//		System.out.println(arr3[2]);
		
		for (int ind = 0; ind < arr1.length; ind++) {
			System.out.println("arr1[" + ind + "]= " + arr1[ind]);
		}
		
		System.arraycopy(arr1, 0, arr2, 0, 4);
		
		
		System.out.println();
		for (int ind = 0; ind < arr2.length; ind++) {
			System.out.print("arr2[" + ind + "]= " + arr2[ind] + "; ");
		}
		
		System.out.println();
		
		for (int ind = 0; ind < arr5.length; ind++) {
			System.out.print("arr5[" + ind + "]= " + arr5[ind] + "; ");
		}
		
//		������� 11: Wrappers primitives ��� �������� ��������
		
		Byte aa1 = 2;
		Short aa2 = 2;
		Integer aa3 = 2;
		Long aa4 = 2l; 
		//��� ������ ���� Long ����� ��������� ����� l, �� � ���� � �������������� ����, ��-������� �� �������� ����������� �� int, � �� double;
		Double bb1 = 2.2;
		Float bb2 = 3.3F;
//		��� ���� � Float, ������� ����� F
		
		int aa5 = aa1; //�� ������������ - outboxing,- ���� �� � �������� ���������������� ��� � �������
		aa3 = aa5; //� ������� � �������� ���������������� � �������
	
		System.out.println("max val of byte = " + Byte.MAX_VALUE);
		System.out.println("min val of byte = " + Byte.MIN_VALUE);
		
		//first gommit to GitHub
		
	}
}
