package com.ramit.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ramit.entities.PetEntity;
import com.ramit.models.PetVO;

@Repository
public class PetServiceImpl {

	@Autowired
	private SessionFactory sessionFactory;

	private static final List<PetVO> PET_LIST = new ArrayList<PetVO>();

	public boolean createPet (PetVO pet) {

		Session session = sessionFactory.openSession();

		PetEntity petEntity = new PetEntity(pet);

		session.beginTransaction();
		session.save(petEntity);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public List<PetVO> getAllPets () {
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		List<PetVO> pets = session.createQuery("FROM PetEntity").list();

		session.close();
		return pets;
	}


	public boolean deletePet (PetVO pet) {
		Session session = sessionFactory.openSession();

		PetEntity petEntity = new PetEntity(pet);

		session.beginTransaction();

		session.delete(petEntity);

		session.getTransaction().commit();
		session.close();
		return true;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
