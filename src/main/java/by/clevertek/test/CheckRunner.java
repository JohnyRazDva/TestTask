package by.clevertek.test;

import by.clevertek.test.model.check.Check;
import by.clevertek.test.repository.cardRepository.CardRepository;
import by.clevertek.test.repository.cardRepository.impl.CardRepositoryImpl;
import by.clevertek.test.repository.check.CheckRepository;
import by.clevertek.test.repository.check.impl.CheckFileRepositoryImpl;
import by.clevertek.test.repository.productRepository.ProductFactory;
import by.clevertek.test.repository.productRepository.ProductFactoryImpl;
import by.clevertek.test.repository.productRepository.ProductRepository;
import by.clevertek.test.repository.productRepository.impl.ProductRepositoryImpl;
import by.clevertek.test.service.card.CardService;
import by.clevertek.test.service.card.impl.CardServiceImpl;
import by.clevertek.test.service.check.CheckService;
import by.clevertek.test.service.check.impl.CheckServiceImpl;
import by.clevertek.test.service.product.ProductService;
import by.clevertek.test.service.product.impl.ProductServiceImpl;
import by.clevertek.test.view.View;
import by.clevertek.test.view.console.ConsoleView;
import by.clevertek.test.view.file.FileView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


/**
 * @author Eugene Petrov
 */
public class CheckRunner {
    public static void main(String[] args) throws IOException {
        ProductFactory productFactory = new ProductFactoryImpl();
        CardRepository cardRepository = new CardRepositoryImpl();
        ProductRepository productRepository = new ProductRepositoryImpl(productFactory);
        FileWriter fileWriter = new FileWriter("check.txt",false);
        CheckRepository checkRepository = new CheckFileRepositoryImpl(fileWriter);
        CardService cardService = new CardServiceImpl(cardRepository);
        ProductService productService = new ProductServiceImpl(productRepository);
        CheckService checkService = new CheckServiceImpl(productService, cardService,checkRepository);
       // View view = new ConsoleView(checkService); // print to console
        View view = new FileView(checkService); // print to file
        view.printCheck(args);

    }
}
