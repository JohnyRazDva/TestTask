package by.clevertek.test.view.file;

import by.clevertek.test.service.check.CheckService;
import by.clevertek.test.service.check.CheckServiceException;
import by.clevertek.test.view.View;

/**
 * @author Eugene Petrov
 */
public class FileView implements View {
    CheckService service;

    public FileView(CheckService service) {
        this.service = service;
    }

    @Override
    public void printCheck(String[] data) {
        try {
            service.addCheck(data);
        } catch (CheckServiceException e) {
            System.err.println(e.getMessage());
        }
    }
}
