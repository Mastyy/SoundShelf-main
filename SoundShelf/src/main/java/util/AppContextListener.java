package util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String url = "jdbc:mysql://localhost:3306/SoundShelf";
        String username = "root";
        String password = "root";
        DataSource.init(url, username, password);
        System.out.println("DataSource initialized!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context destroyed!");
    }
}
