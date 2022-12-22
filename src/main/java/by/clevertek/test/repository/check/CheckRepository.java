package by.clevertek.test.repository.check;

import by.clevertek.test.model.check.Check;

/**
 * @author Eugene Petrov
 */
public interface CheckRepository {
    void addCheck(Check check) throws CheckRepositoryException;
}
