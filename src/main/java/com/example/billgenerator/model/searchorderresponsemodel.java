package com.example.billgenerator.model;

public class searchorderresponsemodel {
		private String customer_name;
		private int order_id;
		private String status;
		private int total_price;
		private String purchased_date;
		public String getCustomer_name() {
			return customer_name;
		}
		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}
		public int getOrder_id() {
			return order_id;
		}
		public void setOrder_id(int order_id) {
			this.order_id = order_id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getTotal_price() {
			return total_price;
		}
		public void setTotal_price(int total_price) {
			this.total_price = total_price;
		}
		public String getPurchased_date() {
			return purchased_date;
		}
		public void setPurchased_date(String purchased_date) {
			this.purchased_date = purchased_date;
		}

}
