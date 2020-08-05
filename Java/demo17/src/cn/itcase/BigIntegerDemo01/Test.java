package cn.itcase.BigIntegerDemo01;

import java.math.BigInteger;

public class Test {
	public static void main(String[] args) {
		BigInteger i = new BigInteger("11122315415645645456");
		BigInteger j = new BigInteger("12513115664864898797");
		BigInteger bigAdd = i.add(j);
		BigInteger bigsub = j.subtract(i);
		System.out.println(bigAdd);
		System.out.println(bigsub);
	}

}
