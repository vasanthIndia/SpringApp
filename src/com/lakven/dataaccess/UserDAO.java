package com.lakven.dataaccess;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lakven.dataaccess.bean.UserBean;

@Component
public class UserDAO implements UserDAOIntf{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean validateLogin(String userName, String password) {
		
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(UserBean.class);
		criteria.add(Restrictions.eq("userName", userName));
		criteria.add(Restrictions.eq("password", password));
		
		List list = criteria.list();
		return list.size() > 0;
	}

}
