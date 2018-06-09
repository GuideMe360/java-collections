package com.guideme.core;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ReadFileAndCountWords {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> wordMap = ReadFileAndCountWords.getWordCount("C:/MyTestFile.txt");
		wordMap.entrySet().forEach(p -> System.out.println("Key :" + p.getKey() + " / Times :" + p.getValue()));
	}

	private static Map<String, Integer> getWordCount(String fileName) throws IOException {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		FileInputStream sis = new FileInputStream(fileName);
		DataInputStream dis = new DataInputStream(sis);
		BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		String line = br.readLine();
		try {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					String tmp = st.nextToken().toLowerCase();
					if (wordMap.containsKey(tmp)) {
						wordMap.put(tmp, wordMap.get(tmp) + 1);
					} else {
						wordMap.put(tmp, 1);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
		}
		return wordMap;
	}

}
