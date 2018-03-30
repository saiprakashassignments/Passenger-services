package com.lib.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.lib.pojo.Credit_card_details;
import com.lib.util.HibernateUtils;
@Component
public class Credit_card_details_dao implements ICredit_card_details_dao {

	@Override
	public void addCreditcarddetials(Credit_card_details profile) {

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
	public Credit_card_details loadCreditcarddetails(int profile_id) {
		Session session = getSession();
		Credit_card_details credit_card_details = (Credit_card_details) session.get(Credit_card_details.class,
				profile_id);
		session.close();
		return credit_card_details;
	}

	@Override
	public void updateCreditcarddetails(Credit_card_details ccd) {

		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(ccd);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void deleteCreditcarddetails(int profile_id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			Credit_card_details credit_card_details = (Credit_card_details) session.get(Credit_card_details.class,
					profile_id);
			session.delete(credit_card_details);
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
