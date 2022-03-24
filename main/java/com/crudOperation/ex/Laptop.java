package com.crudOperation.ex;
	import org.springframework.stereotype.Service;
	@Service	
	public  class Laptop implements Gadgets {
		@Override
		public String show() {
			return "display laptop details";
		}

	}

