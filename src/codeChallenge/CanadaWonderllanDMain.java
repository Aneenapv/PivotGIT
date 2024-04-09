package codeChallenge;

import java.util.Scanner;

public class CanadaWonderllanDMain {

	public static void main(String[] args) {
	 
		Levithan levithan = new Levithan();
		Behemoth behemoth = new Behemoth();
		YukonStriker yukonStriker = new YukonStriker();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter your weight =");
		double weight = sc.nextDouble();
		levithan.weight = weight;
		behemoth.weight = weight;
		yukonStriker.weight = weight;
		
		
		System.out.println(" enter your height =");
		double height = sc.nextDouble();
		levithan.height = height;
		behemoth.height = height;
		yukonStriker.height = height;
		
		levithan.levithanRequirements();
		behemoth.behemothRequirements();
		yukonStriker.yukonRequirements();
		
		

	}

}
