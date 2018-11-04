package main;

import com.howtodoinjava.demo.lucene.file.LuceneReadIndexFromFileExample;
import com.howtodoinjava.demo.lucene.file.LuceneWriteIndexFromFileExample;

public class MainLauncher {

	public static void main(String[] args) throws Exception{
		System.out.println("This is the main launcher of this... app...");

		System.out.println("Writing index...");
		LuceneWriteIndexFromFileExample indexWriter = new LuceneWriteIndexFromFileExample();

		System.out.println("Reading index....");
		LuceneReadIndexFromFileExample indexReader = new LuceneReadIndexFromFileExample("Brand_Names");

	}

}
