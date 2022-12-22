package by.clevertek.test.service.check;

import by.clevertek.test.model.check.Check;

/**
 * @author Eugene Petrov
 */
public interface CheckService {
    Check getCheck(String[] data) throws CheckServiceException;
    void addCheck(String[] data) throws CheckServiceException;
}
