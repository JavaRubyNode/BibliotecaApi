package com.vinicius.pos.base;

import java.io.Serializable;



public  abstract class  EntityBase<ID extends Serializable> implements Serializable {

	public abstract ID getId();
	
	public abstract void setId(ID id);


}
