package com.insta.controller;
import java.util.Scanner;

import com.insta.entity.InstaUser;
import com.insta.service.InstaService;
import com.insta.service.InstaServiceInterface;

public class InstaController implements InstaControllerInterface {

	@Override
	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter password: ");
		String password=sc.next();
		System.out.println("Enter email: ");
		String email=sc.next();
		System.out.println("Enter address: ");
		String address=sc.next();
		
		InstaUser iu=new InstaUser();
		iu.setName(name);
		iu.setPassword(password);
		iu.setEmail(email);
		iu.setAddress(address);
		
		InstaServiceInterface is=new InstaService();
		int i=is.createProfileService(iu);
		
		if(i>0)
		{
			System.out.println("Profile accepted");
		}
		else
		{
			System.out.println("Profile rejected");
		}
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewallProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

}
