package com.island.jprotobuf.rpc.demo.service.impl;

public class TestStringBuilder {

	public static void main(String[] args) {
		String result = "!!!!!!s";
		for (int i = 0; i < 50000; i++) {
			result = result + "Aloha!";
		}
		System.out.println(result);
	}

}
