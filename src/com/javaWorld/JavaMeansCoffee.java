package com.javaWorld;

public class JavaMeansCoffee {

	public static void main(String[] args) {
		String str = "Hello please check the mail";
		String[] array = str.split(" ");

		for (int i = 0; i < array.length; i++) {

			if (i >= 0) {

				char[] charArray = array[i].toCharArray();
				char[] charArray1 = new char[charArray.length];
				int k = 0;
				for (int j = charArray.length - 1; j >= 0; j--) {
					charArray1[k] = charArray[j];
					k++;
				}
				String revstring = new String(charArray1);
				System.out.print("Enteredstring is..."+str);// mine
			   System.out.print(" "+revstring);
			} else {

			System.out.print("Please enter some string TO REVERSE..");//added in remote 

			}
		}
	}
}
