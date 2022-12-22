package by.clevertek.test.view.console;

import by.clevertek.test.model.check.Check;
import by.clevertek.test.model.product.Product;
import by.clevertek.test.service.ServiceException;
import by.clevertek.test.service.check.CheckService;
import by.clevertek.test.service.check.impl.CheckServiceImpl;
import by.clevertek.test.view.View;


import java.util.Map;

/**
 * @author Eugene Petrov
 */

public class ConsoleView implements View {
    private  CheckService checkService;

    public ConsoleView (CheckService checkService){
        this.checkService = checkService;
    }

    @Override
    public void printCheck(String[] data) {
        try {
            System.out.println(checkService.getCheck(data));
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
    }
}