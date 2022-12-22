package by.clevertek.test.repository.check.impl;

import by.clevertek.test.model.check.Check;
import by.clevertek.test.repository.check.CheckRepository;
import by.clevertek.test.repository.check.CheckRepositoryException;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Eugene Petrov
 */
public class CheckFileRepositoryImpl implements CheckRepository {
    FileWriter fileWriter;

    public CheckFileRepositoryImpl(FileWriter fileWriter){
        this.fileWriter = fileWriter;
    }

    @Override
    public void addCheck(Check check) throws CheckRepositoryException {
        try {
            fileWriter.write(check.toString());
            fileWriter.flush();
        } catch (IOException e) {
            throw new CheckRepositoryException("File not found", e);
        }
    }
}
