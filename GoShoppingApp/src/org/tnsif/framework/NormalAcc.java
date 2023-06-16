package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;

	//constructor
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges ) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account No: "+this.getAccNo()+
				" \nAccount Name: "+this.getAccNm()+
				" \nCharges:" +(charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	


}
