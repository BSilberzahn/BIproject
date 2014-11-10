package m2.siad.bi.project.dwh.model.dao;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class DAO<T> {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	protected EntityManager em;

	private Class< T > type;

	@SuppressWarnings("unchecked")
	public DAO() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];

		this.em = DAOSingleton.openConnection();
	}

	public DAO (EntityManager em){
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];

		this.em = em;
	}

	/**
	 * Permet de r�cup�rer un objet via son ID
	 * @param id
	 * @return
	 */
	public T find(final int id) {
		return (T) this.em.find(type, id);
	}

	/**
	 * Permet de cr�er une entr�e dans la base de donn�es
	 * par rapport � un objet
	 * @param obj
	 */
	public boolean create(final T obj){
		
		
		try {
			try{
				em.getTransaction().begin();
				em.persist(obj);
				em.getTransaction().commit();
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			} finally {
				if (em.getTransaction().isActive()) em.getTransaction().rollback();
			}
		}catch (Exception e) {
//			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Permet de mettre � jour les donn�es d'une entr�e dans la base 
	 * @param obj
	 */
	public boolean update(T obj){
		try{
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		}catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Permet la suppression d'une entr�e de la base
	 * @param obj
	 */
	public boolean delete(T obj){
		try{
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();

		}catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
