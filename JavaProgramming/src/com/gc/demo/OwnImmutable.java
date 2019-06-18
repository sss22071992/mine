package com.gc.demo;

final class OwnImmutable {

	
		private int i;
		
		OwnImmutable(int i)
		{
			this.i = i;
		}
		
		public OwnImmutable Modify(int i)
		{
			if(this.i == i)
				return this;
				return(new OwnImmutable(i));
		}
		
		public static void main(String[] args) {
			
			OwnImmutable o1 = new OwnImmutable(10);
			OwnImmutable o2 = new OwnImmutable(100);
			OwnImmutable o3 = new OwnImmutable(10);
			
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o3);
			
			
			System.out.println(o1==o2);
			System.out.println(o1==o3);
			
		}
		
		
	
	
}
