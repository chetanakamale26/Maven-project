package com.insta.service;

import com.insta.dao.InstaDAO;
import com.insta.dao.InstaDAOInterface;
import com.insta.entity.InstaUser;

public class InstaService implements InstaServiceInterface {

	@Override
	public int createProfileService(InstaUser iu) {
		InstaDAOInterface id=new InstaDAO();
		int i=id.creteProfileDAO(iu);
		return i;
	}

}
