package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Client {

	public static void main(String[] args) {
		Test1<Integer> t1=new Test1<Integer>(88);
		Integer i=t1.getT();
		System.out.println(t1.getClass().getName());
		
		Test1<String> t3=new Test1<String>("string");
		String s = t3.getT();
		System.out.println(t3.getClass().getName());
		
		Test2 t2=new Test2(88);
		Integer i1 = (Integer) t2.getT();
		System.out.println(t2.getClass().getName());
	}

}
