package com.lgcns.junior.ssp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] b = new byte[100000];
		new Random().nextBytes(b);
		
		
		File a = new File("./aaa");
		File[] lists = a.listFiles();
		for(File list : lists) {
			if(list.isDirectory()) {
				
			}
			System.out.println(list.getAbsolutePath());
		}
		
		if(!a.exists()) {
			a.mkdirs();
		}
		
		
		File workingDirectory = new File(".");
		File bSaveFileName = new File("./aaa/binary.txt");
		File tSaveFileName = new File("./aaa/text.txt");
		File oSaveFileName = new File("./aaa/object.txt");
		
		// binary ���
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(bSaveFileName);
			ByteArrayInputStream bais = new ByteArrayInputStream(b);
			byte[] buffer = new byte[1024];
			int readLen = 0;
			while((readLen = bais.read(buffer)) > -1) {
				fos.write(buffer, 0, readLen);
			}
			fos.flush();
		} catch(Exception e) {
			throw e;
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {}
			}
		}
		
		
		// binary �Է�
		byte[] readByte = null;
		FileInputStream fis = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			fis = new FileInputStream(bSaveFileName);
			byte[] buffer = new byte[1024];
			int readLen = 0;
			while((readLen = fis.read(buffer)) > -1) {
				baos.write(buffer, 0, readLen);
			}
			baos.flush();
			readByte = baos.toByteArray();
		} catch(Exception e) {
			throw e;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch(Exception e) {}
			}
		}		 
		
		if(Arrays.equals(b, readByte)) {
			System.out.println("Binary is same");
		} else {
			System.out.println("Binary is not same");
		}
		
		String[] sentences = {"a","b", "c", "d", "�ѱ�", "�ߵǳ�"};
		
		BufferedWriter bw = null;
		try {
			// true : append, false: overwrite
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tSaveFileName, false), "UTF-8"));
			for (String s : sentences) {
				bw.write(s);
				bw.newLine();
			}
			bw.flush();
		} catch(Exception e) {
			throw e;
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch(Exception e) {}
			}
		}
		
		List<String> readSentences = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(tSaveFileName), "UTF-8"));
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				readSentences.add(readLine);
			}
		} catch(Exception e) {
			throw e;
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch(Exception e) {}
			}
		}	
		
		String[] readSetencesArray = readSentences.toArray(new String[readSentences.size()]);
		
		if(Arrays.equals(sentences, readSetencesArray)) {
			System.out.println("String is same");
		} else {
			System.out.println("String is not same");
		}
		
		
		User user1 = new User(1, "�Ѹ�ȣ", "1", "2");
		User user2 = new User(2, "ȫ�浿", "3", "4");
		
		
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
		List<String> aaa = new ArrayList<String>();
		
		aaa.add("A");
		aaa.add("C");
		aaa.add("B");
		
		//Collections.sort(aaa);
		Collections.sort(aaa);
		System.out.println("Sort : " + aaa);
		Collections.reverse(aaa);
		System.out.println("Reverse : " + aaa);
		
		Collections.sort(users, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		String[] aaaa = new String[]{"a", "Z", "A", "C", "B", "��", "1", "-"};
		Arrays.sort(aaaa);
		//Arrays.sort(aaaa, String.CASE_INSENSITIVE_ORDER);
		for(String a1 : aaaa) {
			System.out.println(a1);
		}
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(oSaveFileName));
			oos.writeObject(users);
			oos.flush();
		} catch(Exception e) {
			throw e;
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch(Exception e) {}
			}
		}	
		
		
		ObjectInputStream ois = null;
		List<User> readUsers = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(oSaveFileName));
			readUsers = (List<User>)ois.readObject();
		} catch(Exception e) {
			throw e;
		} finally {
			if(ois != null) {
				try {
					ois.close();
				} catch(Exception e) {}
			}
		}			
		
		Object[] tmpUser = users.toArray(new User[users.size()]);
		Object[] tmpReadUser = readUsers.toArray(new User[readUsers.size()]);
		if(Arrays.equals(tmpUser, tmpReadUser)) {
			System.out.println("Object is same");
		} else {
			System.out.println("Object is not same");
		}		
	}

}
