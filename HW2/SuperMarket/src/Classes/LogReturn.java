package Classes;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class LogReturn extends Log {

    /**
     * Конструктор класса LogReturn
     * Создает Logger с именем класса. FileHandler(path, true) - с указанием пути записи и переменной boolean для
     * дозаписи. SimpleFormatter. Логгер игнорирует вывод в консоль.
     *
     */
    public LogReturn(String path) {
        this.logger = Logger.getLogger(this.getClass().getSimpleName());
        Logger parentLog = this.logger.getParent();
        if (parentLog!=null&&parentLog.getHandlers().length>0){ parentLog.removeHandler(parentLog.getHandlers()[0]);}
        try {
            this.handler = new FileHandler(path, true);
            this.logger.addHandler(this.handler);
            SimpleFormatter returnFormat = new SimpleFormatter();
            this.handler.setFormatter(returnFormat);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Logger getReturnLogger() {
        return logger;
    }
    @Override
    public FileHandler getReturnHandler() {
        return handler;
    }
    @Override
    public String getPath() {
        return path;
    }
    @Override
    public void setReturnLogger(Logger logger) {
        this.logger = logger;
    }
    @Override
    public void setReturnHandler(FileHandler handler) {
        this.handler = handler;
    }
    @Override
    public void setPath(String path) {
        this.path = path;
    }
    @Override
    public void logInfo(String message) {
        this.logger.info(message); 
    }

}
