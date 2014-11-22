package com.pb.entity;

/*
 * 购物类
 */

@SuppressWarnings("serial")
public class Shop extends Goods{
	private double cost;//金额

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
