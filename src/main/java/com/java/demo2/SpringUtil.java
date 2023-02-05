package com.java.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;
import org.springframework.stereotype.Component;

@Component("Util")

public class SpringUtil {
	
	// written at Property level
@Autowired // @Autowired is written so that the instance/object of SpringUtil class 
			//SpringUtil springUtil = (SpringUtil) context.getBean("Util");
            // doing springUtil.getProdRef (as prodRef is an instance variable of SpringUtil class
@Qualifier("p2")											//and getProdRef() is getter of that instance variable prodRef )
 private Product prodRef; // a reference of Product created.
// so that due to @Autowired the springUtil instance created in StartApp can inject a productbean from  the container SpringConfig class
 static {
	 System.out.println("loads SpringUtil ");
 }
public Product getProdref() {
	return prodRef;
}

public void setProdref(Product prodref) {
	this.prodRef = prodref;
}
 
 
 
}
