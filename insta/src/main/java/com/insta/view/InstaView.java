package com.insta.view;
import java.util.Scanner;

import com.insta.controller.InstaController;
import com.insta.controller.InstaControllerInterface;

public class InstaView {

	public static void main(String[] args) {
		System.out.println("***********************************************");
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to view profile");
		System.out.println("Press 3 to delete profile");
		System.out.println("Press 4 to edit profile");
		System.out.println("Press 5 to search profile");
		System.out.println("Press 6 to view all profile");
		System.out.println("Press 7 to login profile");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int a=sc.nextInt();
		
		
		InstaControllerInterface ic=new InstaController();
		
		switch(a)
		{
		case 1:
			ic.createProfileController();
			break;
		case 2:
			ic.viewProfileController();
			break;
		case 3:
			ic.deleteProfileController();
			break;
		case 4:
			ic.editProfileController();
			break;
		case 5:
			ic.searchProfileController();
			break;
		case 6:
			ic.viewallProfileController();
			break;
		case 7:
			ic.loginProfileController();
			break;
		
		}
		
	}

}
