package com.lib.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.lib.pojo.passenger_profile;
import com.lib.util.HibernateUtils;
@Component("Passenger_profile_dao")
public class Passenger_profile_dao implements IPassenger_profile_dao {

	@Override
	public void addPassenger(passenger_profile profile) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(profile);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public passenger_profile loadPassenger(int profile_id) {

		Session session = getSession();
		passenger_profile passenger = (passenger_profile) session.get(passenger_profile.class, profile_id);
		session.close();
		return passenger;
	}

	@Override
	public void updatePassenger(passenger_profile ppf) {

		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(ppf);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void deletePassenger(int profile_id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			passenger_profile passengerprofile = (passenger_profile) session.get(passenger_profile.class, profile_id);
			session.delete(passengerprofile);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	private Session getSession() {
		return HibernateUtils.getSessionFactory().openSession();
	}

}
