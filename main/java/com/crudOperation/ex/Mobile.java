package com.crudOperation.ex;
	import org.springframework.context.annotation.Primary;
	import org.springframework.stereotype.Service;
	@Service
	@Primary
	public  class Mobile implements Gadgets {	
		

			@Override
		
			public String show() {
			System.out.println("Display Mobile Details");
			      return " display mobile details" ;
		}
		}

