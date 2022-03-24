package com.crudOperation.ex;
	import org.springframework.stereotype.Service;

	@Service
	public  class Tablet  implements Gadgets{

	@Override
	public  String show() {
		return "display Tablet details";
	}

	}

