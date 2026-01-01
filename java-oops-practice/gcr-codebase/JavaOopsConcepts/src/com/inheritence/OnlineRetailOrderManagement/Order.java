package com.inheritence.OnlineRetailOrderManagement;

//Base class
class Order {
 int orderId;
 String orderDate;

 Order(int orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 String getOrderStatus() {
     return "Order Placed";
 }
}

