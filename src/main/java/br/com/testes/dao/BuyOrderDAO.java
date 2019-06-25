package br.com.testes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.testes.model.BuyOrder;

public class BuyOrderDAO {

	private final String DEATHSTAR = "DeathStar";
	
	EntityManager entityManager;
	
	public List<BuyOrder> getByDeathStar() {
		StringBuilder jpql = new StringBuilder();
		jpql.append(" SELECT ");
		jpql.append(" a.OrderID, ");
		jpql.append(" a.TotalPrice, ");
		jpql.append(" FROM ");
		jpql.append(BuyOrder.class.getName()).append(" a");
		jpql.append(" WHERE ");
		jpql.append(" a.CustomerName = :").append(DEATHSTAR);
		
		TypedQuery<BuyOrder> query = entityManager.createQuery(jpql.toString(), BuyOrder.class);
		return query.getResultList();	
	}
	
}
