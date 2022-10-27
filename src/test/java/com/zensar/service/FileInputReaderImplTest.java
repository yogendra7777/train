package com.zensar.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.zensar.service.impl.FileInputReaderImpl;

public class FileInputReaderImplTest {
    FileInputReader inputReader = new FileInputReaderImpl();
    String[] input = new String[1];
    @Test
    public void testFileInputReader(){
        input[0] = "TRAIN_A ENGINE NDL NDL KRN GHY SLM NJP NGP BLR";
        Assertions.assertEquals(input[0], inputReader.inputReader("sample_input/input2.txt")[0]);
    }
}
