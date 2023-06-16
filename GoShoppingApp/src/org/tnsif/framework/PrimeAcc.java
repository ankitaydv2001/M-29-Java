package org.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc{
	//private fields
		private boolean isPrime;
		static final private float deliveryCharges=0.0f;
		
		//constructor
		public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
			super(accNo, accNm, charges);
			this.isPrime=isPrime;
		}
		
		public void bookProduct(float charges)
		{
			System.out.println("Account No: "+this.getAccNo()+
					" \nAccount Name: "+this.getAccNm()+
					" \nCharges: "+(charges+deliveryCharges));
		}

		@Override
		public String toString() {
			return "PrimeAcc [isPrime=" + isPrime + "]";
		}
		
		

}
