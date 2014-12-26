package m2.siad.bi.project.dwh.model.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	public TestPage() {
		super();
	}

	/**
	 *  permet de modifier la quantite des elements du panier (plus / moins / suppr)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		traitement(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		traitement(request, response);
	}

	public  void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//DO SOMETHING
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		logger.info("EVERYTHING IS AWESOME !");
	}
}
