package de.entwicklergemeinde.calendartool.persistence.derby;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import de.entwicklergemeinde.calendartool.persistence.IDbHandler;
import de.entwicklergemeinde.calendartool.persistence.entity.Appointment;

public class DerbyDbHandler implements IDbHandler {

	public List<Appointment> getAllDates() {

		List<Appointment> result;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("derbydates");
		EntityManager em = emf.createEntityManager();

		result = em.createQuery("select a from Appointment a", Appointment.class).getResultList();

		em.close();
		emf.close();

		return result;
	}

	public void saveAppointment(Appointment appointment) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("derbydates");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(appointment);
		tx.commit();
		
		em.close();
		emf.close();
	}

}
