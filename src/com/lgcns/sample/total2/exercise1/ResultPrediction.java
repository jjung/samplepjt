package com.lgcns.sample.total2.exercise1;

import java.io.IOException;

public class ResultPrediction {
	public static void main(String args[]) {
		try {
			makeException("IOException");
			makeException("RuntimeException");
		} catch(IOException e) {
			System.out.println("1. " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				makeException("RuntimeException");
				makeException("IOException");
			} catch(IOException e) {
				System.out.println(e.getMessage());
			} catch(RuntimeException e) {
				System.out.println("2. " + e.getMessage());
			} finally {
				try {
					makeException("ClassCastException");
				} catch(IOException e) {
					System.out.println(e.getMessage());
				} catch(ClassCastException e) {
					System.out.println(e.getMessage());
				} 
			}
		}
	}

	static void makeException(String name) throws IOException, RuntimeException {
		if (name.equals("IOException")) {
			makeIOException();
		} else if (name.equals("RuntimeException")) {
			makeRuntimeException();
		}
		
		try {
			throw new IOException("IOException 강제로 발생시킴");
		} catch(IOException e) {
			System.out.println("3. " + e.getMessage());
		} 
	}

	static void makeIOException() throws IOException {
		throw new IOException("IOException 강제로 발생시킴");
	}

	static void makeRuntimeException() throws RuntimeException {
		throw new RuntimeException("RuntimeException 강제로 발생시킴");
	}
}
