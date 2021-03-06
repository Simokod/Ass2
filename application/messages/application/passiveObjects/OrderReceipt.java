package bgu.spl.mics.application.passiveObjects;

import java.io.Serializable;

/**
 * Passive data-object representing a receipt that should
 * be sent to a customer after the completion of a BookOrderEvent.
 * You must not alter any of the given public methods of this class.
 * <p>
 * You may add fields and methods to this class as you see fit (including public methods).
 */
public class OrderReceipt implements Serializable {

	private int orderId;
	private String bookTitle;
	private int price;
	private Customer customer;
	private String sellingService;
	private int issuedTick;
	private int orderTick;
	private int processTick;
	private static long serialVersionUID = 335114239;

	/**
	 * Public Constructor
	 */
	public OrderReceipt(int orderId, String sellingService, Customer customer, String bookTitle, int price,
						int issuedTick, int orderTick, int processTick){
		this.orderId = orderId;
		this.customer = customer;
		this.bookTitle = bookTitle;
		this.sellingService = sellingService;
		this.price = price;
		this.issuedTick = issuedTick;
		this.orderTick = orderTick;
		this.processTick = processTick;
	}
	/**
	 * Retrieves the orderId of this receipt.
	 */
	public int getOrderId() { return orderId; }

	/**
	 * Retrieves the name of the selling service which handled the order.
	 */
	public String getSeller() { return sellingService; }

	/**
	 * Retrieves the ID of the customer to which this receipt is issued to.
	 * <p>
	 * @return the ID of the customer
	 */
	public int getCustomerId() { return customer.getId(); }

	/**
	 * Retrieves the name of the book which was bought.
	 */
	public String getBookTitle() { return bookTitle; }

	/**
	 * Retrieves the price the customer paid for the book.
	 */
	public int getPrice() { return price; }

	/**
	 * Retrieves the tick in which this receipt was issued.
	 */
	public int getIssuedTick() {
		return issuedTick;
	}

	/**
	 * Retrieves the tick in which the customer sent the purchase request.
	 */
	public int getOrderTick() {
		return orderTick;
	}

	/**
	 * Retrieves the tick in which the treating selling service started
	 * processing the order.
	 */
	public int getProcessTick() {
		return processTick;
	}

	public String toString() {
		return "orderId: "+orderId+",customer's name: "+customer.getName()+", BookTitle: "+bookTitle+", price: "+price+
				", IssuedTick: "+issuedTick+", OrderTick: "+orderTick+", ProcessTick: "+processTick+"\n";
	}
}