package com.lambda.program;

public class LambdaWithParameter {
	public static void main(String[] args) {
		LambdaDemo2 demo =name ->{
			return "hello," +name;
		};
		System.out.println(demo.show("world"));
	}

}
