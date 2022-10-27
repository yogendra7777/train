package com.zensar.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.zensar.service.FileInputReader;

public class FileInputReaderImpl implements FileInputReader{
    @Override
    public String[] inputReader(String relativePath) {
		String[] input_data = new String[2];
		int i = 0;
		try (Scanner sc = new Scanner(new File(relativePath));) {
			while (sc.hasNextLine()) {
				input_data[i] = sc.nextLine();
				i++;
			}
			return input_data;
		} 
        catch (FileNotFoundException e) {
			System.out.println("Error in reading the data from the file.");
			e.printStackTrace();
		}        
        return null;
    }
}
