package JavaProgs97;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

import com.graphbuilder.struc.LinkedList;

public class Programs97 {
	
	@Test
	public void pg_01() {
		String s = "welcome to expo";
		//expo to welcome
		String[] sp = s.split(" ");
		
		for (int i = sp.length-1; i >= 0; i--) {
			System.out.print(sp[i]+" ");
		}
		System.out.println();
	}
	
	@Test
	public void pg_02() {
		String s = "aabcsscdedfef";
		//remove duplicates
		char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			hs.add(ch[i]);
		}
		for (Character c : hs) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	@Test
	public void pg_01Another() {
		
		String st="welcome to explore";
		String[] s = st.split(" ");
		s[0]=s[0]+" "+s[s.length-1]; 			//s[0] = "welcome explore"
		s[s.length-1]=s[s.length-1]+" "+s[0];   //s[2] = "explore welcome"
		s[0]=s[0].split(" ")[1];				//s[0] = "explore"
		s[s.length-1]=s[s.length-1].split(" ")[1];//s[2] = "welcome"
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
			}
	}
	
	@Test
	public void pg_03() {
		//remove duplicate words in string
		String s = "i am i am vikas";
		String[] st = s.split(" ");
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < st.length; i++) {
			hs.add(st[i]);
		}
		
		for (String str : hs) {
			System.out.print(str+" ");
		}
	}
	
	@Test
	public void pg_05() {
		//insert a string in to middle of string[]
		String[] s = {"i","am","good","boy"};
		String st = "a";
		String[] str = new String[s.length+1]; //5
		int j;
		try {
		for (int i = 0; i < str.length; i++) { //i = 0<5,1,2,3
			if(i==s.length/2) { //0==2 f 1==2 f 2==2 t 3==2 f
				j=i+1;
				str[i]=st; //str[2]=a
				str[j]=s[i]; //str[3]=good
				
				
			}
			else if(i>=s.length/2) { //3>2 t
				j=i+1; //4
				str[j]=s[i]; //str[4]="boy"
			}
			else {
				str[i]=s[i]; //str[0]= i,am,
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
	}
	
	@Test
	public void pg_05_1() {
		String[] s = {"i","am","good"};
		int middle = s.length/2;
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
		for (int i = 0; i < s.length; i++) {
			list.add(s[i]);
		}
		list.add(middle, "vikas");
		System.out.println(list);
	}
	
	@Test
	public void pg_07() {
		String s = "aaabbcdddf";
		//a3b2cd3f
		
		char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			hs.add(ch[i]);
		}
		for (Character cha : hs) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(cha==ch[j]) {
					count++;
				}
			}
			if(count>1)
			System.out.print(cha+""+count);
			else
				System.out.print(cha);
		}
		System.out.println();
	}
	
	@Test
	public void  pg_08() {
		int[] a = {7,-3,0,2,1,-9};
		TreeSet<Integer> hs = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		System.out.println(hs.last());
	}
	
	@Test
	public void pg_09() {
		//mul of 1st 3 max nos
		int[] a= {-5,3,0,-1,4};
		int sum = 1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<3;i++) {
			sum = sum*a[i];
		}
		System.out.println("mul of 1st 3 max nos is--> "+sum);
		System.out.println();
		
	}
	
	@Test
	public void pg_25_printRemainingnosinArray() {
		
		int a[] = {1,2,5};
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		int c[]=new int[b.length];
		int k=0;
		try {
		for (int i = 0; i < b.length; i++) { // i=0 t;1 t
			for (int j = i; j < a.length; j++) { //j=0 t;0 t
				if(a[i]==b[j]) { //1==1 t;2==1 f
					break; //tr,
				}
				else { 
					c[k]=b[j]; // c[0]=1
					k++; //1
					
				}
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}	
		}
	
	@Test
	public void pg_10() {
		String a = "i am selenium"; //m ui nelesmai
		char[] ch = a.toCharArray();
		char[] c = new  char[ch.length];
		
		for (int i = 0; i <ch.length; i++) {
			if(ch[i]==' ') {
				c[i]=' ';
			}
		}
		int j=c.length-1;
		for (int i = 0; i <ch.length; i++) {
			if(ch[i]!=' ') {
				if(c[j]==' ') {
					j--;
				}
				c[j]=ch[i];
				j--;
			}
		}
		System.out.println(String.valueOf(c));
		
	}
	
	@Test
	public void pg_14() {
		//print 1-20 which is divisable by 2
		for (int i = 1; i <= 20; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	@Test
	public void pg_15() {
		String s="My name is rishav it contains ri and shav"; 
		/* 
		My---1
		name---1
		is---1
		rishav---1
		it---1
		contains---1
		ri---1
		and---1
		shav---1
		*/
		
		String[] sp = s.split(" ");

		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) {
			hs.add(sp[i]);
		}
		System.out.println(hs);
		for (String str: hs) {
			int count=0;
		for (int i = 0; i < sp.length; i++) {
				if(str==sp[i]) {
					count++;
				}
		}
			System.out.println(str+"---"+count);
		}
		System.out.println();
	}
	
	@Test
	public void pg_17() {
		//occurence
		String s="aweexxxyyyyyy";
		char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			hs.add(ch[i]);
		}
			
			for (Character character : hs) {
				int count=0;
				for (int j = 0; j < ch.length; j++) {
					if (character==ch[j]) {
						count++;
					}
				}
			System.out.println(character+"---"+count);
		}
	}
	
	@Test
	public void pg_20() {
		//add 1st 3 min elements 
		int[] a = {7,-6,11,9,0,4}; 
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		int z=0;
		for (int i = 0; i < 3; i++) {
			z=z+a[i];
		}
		System.out.println(z);
	}
	
	@Test
	public void pg_21() {
		String s = "aabcdee"; //print not duplicates
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(ch[i]);
			}
		}
		System.out.println();
	}
	
	@Test
	public void pg_22_And_23() {
		String s = "aabcdee"; //print only duplicates
		char[] ch = s.toCharArray();
//		LinkedHashSet<Character> l = new LinkedHashSet<Character>();
		TreeSet<Character> l = new TreeSet<Character>(); //in sorting order
		for (int i = 0; i < ch.length; i++) {
			l.add(ch[i]);
		}
		for (Character cha : l) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if(cha==ch[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(cha);
			}
		}
		System.out.println();
	}
	
	@Test
	public void pg_24() {
		String a = "aabccdeef"; //aa ab bc cc cd de ee ef
		try {
		for (int i = 0; i <a.length(); i++) {
			System.out.print(a.charAt(i)+""+a.charAt(i+1)+" ");
		}	
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
	}
	
	@Test
	public void pg_26() {
		String a = "Selenium";
		// s se sel sele selen seleni seleniu selenium
		a=a.toLowerCase();
		char[] ch = a.toCharArray();
		String st = "";
		for (int i = 0; i < 1; i++) {
			for (int j = i; j < ch.length; j++) {
				st=st+ch[j];
				System.out.print(st+" ");
			}
			
		}
		System.out.println();
	}
	
	@Test
	public void pg_30() { //reverse a string
		String a = "vikas";
		char[] ch = a.toCharArray();
		StringBuffer s = new StringBuffer(a);
		System.out.println(s.reverse());
	}
	
	@Test
	public void pg_33() {
		String s="i am vikas"; //replace " " with ","
		//1
		System.out.println(s.replace(" ", ","));
		//2
		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++) {
			if(i<st.length-1) {
				System.out.print(st[i]+",");
			}else {
				System.out.print(st[i]);
			}
			
		}
		System.out.println();
		//3
		char[] ch = s.toCharArray();
		char[] cha = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ') {
				cha[i]=',';
			}
		}
		int j=0;
		for (int i = 0; i < ch.length; i++) {
			
				if(ch[i]!=' ') {
					if(cha[j]==',') {
						j++;
					}
					else {
						cha[j]=ch[i];
						j++;
				}
					
			}
				else {
					j++;
				}
		}
		for (int i = 0; i < cha.length; i++) {
			System.out.print(cha[i]);
		}
		System.out.println();
	}
	
	@Test
	public void pg_34() {
		//take input in arrayList and print in array
		ArrayList<String> al = new ArrayList<String>();
		al.add("i");
		al.add("am");
		al.add("vikas");
		
		for (String st : al) {
			System.out.print(st+" ");
		}
		System.out.println();
	}
	
	@Test
	public void pg_36() { 
		String s = "my name is ok"; //ko si eman ym
		for (int i = s.length()-1; i >=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	@Test
	public void pg_37() {
		//pg_37
//		String[] s = {"Vijay","Vivek","Jawahar"};
		//pg_38
//		String[] s = {"Rakshith","Chat","Zoom"};
		//pg_39_And_48
		String[] s = {"Mrudula","chandini","Education"};
		//vijay - 2
		//vivek - 2
		//javahar - 3
		for (int i = 0; i < s.length; i++) {
			s[i]=s[i].toLowerCase();
			char[] ch = s[i].toCharArray();
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				
				if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u') {
					count++;
				}
			}
			System.out.println(s[i]+" - "+count);
		}
		System.out.println();
	}
	
	@Test
	public void pg_41() { //prime
		int a = 17;
		Boolean flag = false;
		for (int i = 2; i < a/2; i++) {
			if(a%i==0) {
				flag=true;
				break;
			}
			
		}
		if(flag) {
			System.out.println("it is not a prime no");
		}
		else {
			System.out.println("is a prime no");
		}
		
	}
	
	@Test
	public void pg_43() { //palindrome
	int a=1218;
	int rev=0,dup=a;
	while (a>0) {
		int mod=a%10;
		rev=rev*10+mod;
		a=a/10;
	}
	if(dup==rev) {
		System.out.println("no is palendrome");
	}else {
		System.out.println("is not a palendrome");
	}
	
	}
		
		@Test
		public void pg_47() {
			String s = "IMMUNUTIES"; //count 'U'
			char[] ch = s.toCharArray();
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				
					if(ch[i]=='U') {
						count++;
					}
				
			}
			System.out.println("U --> "+count);
		}	
			
		@Test
		public void pg_49() {
			String s = "ABCDE";
			// A
			// A B
			// A B C
			// A B C D
			// A B C D E
//			String a="";
			for (int i = 0; i < s.length() ; i++) {
				for (int j = 0; j <= i; j++) {
//					a=a+s.charAt(i);
					System.out.print(s.charAt(j)+" ");
				}
				System.out.println();
//				a="";
			}
			System.out.println();
		}
		
		@Test
		public void pg_50() {
			int[] a = {1,3,5,2,8,9,10}; //combinational sum od numbers should be 11 like 10+1=11
//			if(a[])
			for (int i = 0; i < a.length; i++) {
				
				for (int j = 0; j < a.length; j++) {
					if(a[i]+a[j]==11) {
						System.out.println(a[i]+" + "+a[j]+" = 11");
					}
				}
			}
			
		}
		
		@Test
		public void pg_52() {
			String s = "AfgaDFkGdz";
			String small = "";
			char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if(ch[i]>=97 && ch[i]<=122) {
					small = small+ch[i];
				}
			}
			for (int i = 0; i < small.length(); i++) {
				System.out.print(small.charAt(i));
			}
			String st="";
			char[] chr = small.toCharArray();
			try {
			for (int i = 1; i < chr.length; i++) {
				if((int)chr[i]>(int)chr[i-1]) {
					st="";
					st = Character.toString(chr[i]);
					
				}
			}}
			catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("the gratest one is :"+st);
		}
		
		@Test
		public void pg_53()
		{
			//missing elements in array
			int[] arr = {1, 2, 4, 6, 7, 9};
			int a = 10; 
			Arrays.sort(arr);
			int count = 1; 
			System.out.print("Missing elements: ");
			for (int num : arr) {
				while (count < num) {
					System.out.print(count + " ");
					count++;
				}
				count++; 
			}
			//to print last value
			while (count <= a) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println(); 
		}

		@Test
		public void pg_54()
		{
			//getFrequencyOfOddEvenNumbersInGivenMatrix
			int[][] matrix = {
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9}
			};
			int oddCount = 0;
			int evenCount = 0;
			for (int[] row : matrix) {
				for (int num : row) {
					if (num % 2 == 0) {
						evenCount++;
					} else {
						oddCount++;
					}
				}
			}
//			System.out.println("Matrix:");
//			for (int[] row : matrix) {
//				for (int num : row) {
//					System.out.print(num + " ");
//				}
//				System.out.println();
//			}
			System.out.println("Frequency of even numbers: " + evenCount);
			System.out.println("Frequency of odd numbers: " + oddCount);
		}

		@Test
		public void pg_57()
		{
			//occurrenceOfString
			String inputString = "aabbcettrrraaee";
			StringBuilder result = new StringBuilder();
			char currentChar = inputString.charAt(0); //a,b
			int count = 1;
			try {
			for (int i = 1; i <= inputString.length(); i++) {
				char nextChar = inputString.charAt(i);

				if (nextChar == currentChar) {
					count++;
				} else {
					if(count>1) {
					result.append(currentChar).append(count);
					currentChar = nextChar;
					count = 1;
					}
					else {
						result.append(currentChar);
						currentChar = nextChar;
						count = 1;
					}
				}
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			result.append(currentChar);
			result.append(count);
			System.out.println("Input String: " + inputString);
			System.out.println("Output: " + result.toString());
		}

		@Test
		public void pg_58()
		{
			// 1*123*3215*234*1212*1212*1212*3245=?
			String inputString = "I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
			int product = 1;
			StringBuilder currentNumber = new StringBuilder();
			for (char ch : inputString.toCharArray()) {
				if (Character.isDigit(ch)) {
					currentNumber.append(ch);
				} else {
					if (currentNumber.length() > 0) {
						int number = Integer.parseInt(currentNumber.toString());
						product *= number;
						currentNumber.setLength(0); 
					}
				}
			}
			if (currentNumber.length() > 0) {
				int number = Integer.parseInt(currentNumber.toString());
				product *= number;
			}
			System.out.println("Input String: " + inputString);
			System.out.println("Output: " + product);
		}

		@Test
		public void pg_61()
		{
			//reverseAlteranativeWords
			String s = "this is Java programming questions";
			String[] s1 = s.split(" ");
			StringBuilder rev = new StringBuilder();
//			for (String word : s1) 
//			{
//				StringBuilder reversedWord = new StringBuilder();
//				for (int i = word.length() - 1; i >= 0; i--) 
//				{
//					reversedWord.append(word.charAt(i));
//				}
//				rev.append(reversedWord).append(" ");
//			}
//			String outputString = rev.toString().trim();
//			System.out.println("Input String: " + s);
//			System.out.println("Output String: " + outputString);
			for (int i = 0; i < s1.length; i++) {
				if(i%2==0) {
					rev.append(s1[i]);
					rev.reverse();
					System.out.print(rev+" ");
					rev.setLength(0);
				}else {
				System.out.print(s1[i]+" ");
				}
			}
			System.out.println();
		}

		@Test
		public void pg_65()
		{
			String[] dropdown = {"Rishabh", "Rohan", "Rishabh", "Neha", "Venketesh"};
			int count = 0;
			System.out.print("Duplicate Values: ");
			for (int i = 0; i < dropdown.length - 1; i++) {
				for (int j = i + 1; j < dropdown.length; j++) {
					if (dropdown[i].equalsIgnoreCase(dropdown[j])) {
						System.out.print(dropdown[i] + " ");
						count++;
						break; 
					}
				}
			}
			System.out.println("\nCount of Duplicate Values: " + count);
		}

		@Test
		public void pg_67()
		{
			int[] arr = {3, 4, 5, 6}; //add 7 and should get 0 or 4
			int target = 7;
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == target) {
						System.out.println("Indices: " + i + ", " + j);
						return; 
					}
				}
			}
			System.out.println("No such pair found.");
		}

		@Test
		public void pg_68()
		{
			int[] a = {7, 2, 12, 15};
			int target = 9;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < a.length; i++) {
				int complement = target - a[i];
				if (map.containsKey(complement)) {
					int j = map.get(complement);
					System.out.println("Index I: " + j + ", Index J: " + i);
					return;
				}
				map.put(a[i], i);
			}
			System.out.println("No such indices found.");
		}

		@Test
		public void pg_72()
		{
			System.out.println("Repeated Digit Numbers from 0 to 100:");
			for (int i = 11; i <= 99; i++) {
				int tensDigit = i / 10;
				int unitsDigit = i % 10;
				if (tensDigit == unitsDigit) {
					System.out.print(i + " ");
				}
			}
		}

		@Test
		public void pg_73()
		{
			int n = 20; 
			int[] fibonacci = new int[n];
			fibonacci[0] = 0;
			fibonacci[1] = 1;
			System.out.println("Fibonacci Series (First " + n + " numbers):");
			System.out.print(fibonacci[0] + " "); 
			System.out.print(fibonacci[1] + " ");
			for (int i = 2; i < n; i++) {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
				if (fibonacci[i] % 3 == 0 || fibonacci[i] % 5 == 0) {
					System.out.print(fibonacci[i] + " ");
				}
			}
		}

		@Test
		public void pg_74()
		{
			// table 6*1=6,.....6*10=60 for user entered number
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			System.out.println("Multiplication Table for " + number + ":");
			for (int i = 1; i <= 10; i++) {
				System.out.println(number + " x " + i + " = " + (number * i));
			}
			sc.close();
		}

		@Test
		public void pg_75()
		{
			//armStrongNumber
			int n = 145;
			int n1 = n;
			int numberOfDigits = 0;
			int sum = 0;
			while (n1 != 0) {
				n1 /= 10;
				numberOfDigits++;
			}
			n1 = n;
			while (n1 != 0) {
				int digit = n1 % 10;
				sum += Math.pow(digit, numberOfDigits);
				n1 /= 10;
			}
			if (sum == n) {
				System.out.println(n + " is an Armstrong number.");
			} else {
				System.out.println(n + " is not an Armstrong number.");
			}
		}

		@Test
		public void pg_77()
		{
			//pattern
			//     *
			//    * *
			//   * * *
			//  * * * *
			// * * * * *
			int n=5;
			for(int i=1; i<=n; i++)
			{
				for(int j=i; j<=n; j++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}

		@Test
		public void pg_78_79_82()
		{
			System.out.println('A'+'B');
			// Output is 131 

			System.out.println(15+35+"Chandan");
			// output is 50chandan

			String STR ="java234str789";
			String str = STR.replaceAll("[^0-9]", "");
			System.out.println(str);
			// Output is 234789
		}

		@Test
		public void pg_83()
		{
			//characterOccurrence
			String s="hello";
			String s1 = s.toLowerCase();
			LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
			for(int i=0; i<s1.length(); i++)
			{
				lhm.put(s1.charAt(i), i);
			}
			for (Map.Entry<Character, Integer> m : lhm.entrySet()) {
				int count=0;
				for(int i=0; i<s1.length(); i++) 
				{
					if(m.getKey()==s1.charAt(i))
					{
						count++;
						lhm.put(m.getKey(), count);
					}
				}
				System.out.println(m.getKey()+" is repeating  "+count+" times");
			}
		}

		@Test
		public void pg_84()
		{
			//removeDotWithSpace
			String inputString = "update.decline.accept.include";
			char[] charArray = inputString.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == '.') {
					charArray[i] = ' ';
				}
			}
			String stringWithoutDots = new String(charArray);
			System.out.println("String without dots: " + stringWithoutDots);
			int countOfC = 0;
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == 'c' || charArray[i] == 'C') {
					countOfC++;
				}
			}
			System.out.println("Count of 'c' in the string: " + countOfC);
			int[] charCount = new int[256]; 
			for (int i = 0; i < charArray.length; i++) {
				char currentChar = charArray[i];
				charCount[currentChar]++;
			}        
			System.out.println("Character Counts:");
			for (int i = 0; i < charCount.length; i++) {
				if (charCount[i] > 0) {
					System.out.println((char) i + ": " + charCount[i]);
				}
			}
		}

		@Test
		public void pg_86()
		{
			String s="aaabbbccceeegggfff";
			String s1 = s.toLowerCase();
			LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
			for(int i=0; i<s1.length(); i++)
			{
				lhm.put(s1.charAt(i), i);
			}
			for(Map.Entry<Character, Integer> m:lhm.entrySet())
			{
				int count=0;
				for(int i=0; i<s1.length(); i++) 
				{
					if(m.getKey()==s1.charAt(i))
					{
						count++;
						lhm.put(m.getKey(), count);
					}
				}
				System.out.println(m.getKey()+" is repeating  "+count+" times");
			}
		}

		@Test
		public void pg_87()
		{
			//stringStorage
			String s1="hello";
			String s2=new String("hello");
			System.out.println(s1==s2);

		//output is false since s1 string value is store in string fool area
		//and s2 string value stored in heap memory so which are in different storage 

		}
		
		@Test
		public void pg_89()
		{
			//factorial
			int n=5;
			int fact=1;
			for(int i=1; i<=n; i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of number 5 is: "+fact);
		}

		@Test
		public void pg_91()
		{
			//swapWithoutThirdVariable
			int a=10;
			int b=20;
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("value a is--->"+a+"  value b is -->"+b);
		}

		@Test
		public void pg_93()
		{
			ArrayList<Integer> inputList = new ArrayList<Integer>();
	        inputList.add(1);
	        inputList.add(2);
	        inputList.add(3);
	        ArrayList<Integer> outputList = new ArrayList<Integer>();
	        for (int i = 0; i < inputList.size(); i++) {
	            int current = inputList.get(i);
	            if (i > 0) {
	                current += inputList.get(i - 1);
	            }
	            if (i < inputList.size() - 1) {
	                current += inputList.get(i + 1);
	            }
	            outputList.add(current);
	        }
	        System.out.println("Input List: " + inputList);
	        System.out.println("Output List: " + outputList);	
		}

		@Test
		public void pg_94()
		{
			//anagram
			String str1 = "tab";
	        String str2 = "bat";
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        boolean isAnagram = true;
	        if (str1.length() != str2.length()) {
	            isAnagram = false;
	        } else {
	            int[] charCount = new int[256]; 
	            for (char c : str1.toCharArray()) {
	                charCount[c]++;
	            }
	            for (char c : str2.toCharArray()) {
	                charCount[c]--;
	            }
	            for (int count : charCount) {
	                if (count != 0) {
	                    isAnagram = false;
	                    break;
	                }
	            }
	        }
	        if (isAnagram) {
	            System.out.println("The two strings are anagrams.");
	        } else {
	            System.out.println("The two strings are not anagrams.");
	        }
		}

		@Test
		public void pg_95()
		{
			// *
			// * *
			// * * *
			// * * * *
			// * * * * *
			int n=5;
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println(" ");
			}
		}

		@Test
		public void pg_97()
		{
			//stringIsPalindromeOrNot
			String s="madam";
			String rev="";
			for(int i=s.length()-1; i>=0; i--)
			{
				rev=rev+s.charAt(i);
			}
			if(rev.equals(s))
			{
				System.out.println("The given string is palindrome");
			}
			else
			{
				System.out.println("The given string is not palindrom");
			}
		}
		
		@Test
		public void STR() {
			String str = "java213str789";
			str=str.replaceAll("[0-9]", "");
			System.out.println(str);
		}
		
		@Test
		public void eg() {
			String s = "aabcbbdeaa";
//			int i=0;
			String[] st = new String[s.length()];
			try {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.substring(i, i+2)+" ");
				
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
//			System.out.println(st[i]+" ");
		}
}
