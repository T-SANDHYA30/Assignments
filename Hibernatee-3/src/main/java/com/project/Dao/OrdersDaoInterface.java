package com.project.Dao;

import java.util.List;
import com.model.Orders;

public interface OrdersDaoInterface {
	
	public void addOrder();
	public Orders updateOrder(Orders orders,int oId);
	public void deleteOrder(int oId);
	public List<Orders> findByCost(double Cost);

}
