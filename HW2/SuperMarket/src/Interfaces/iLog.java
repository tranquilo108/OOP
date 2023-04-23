package Interfaces;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 *  Интерфейс логгера
 *  Геттеры: getReturnLogger, getReturnHandler, getPath
 *  Сеттеры: setReturnLogger, setReturnHandler, setPath
 *  Метод logInfo(String message)
 */
public interface iLog {
    /**
     * Геттер
     * getReturnLogger return (Logger)
     */
    Logger getReturnLogger();
    /**
     * Сеттер
     * setReturnLogger(Logger logger)
     */
    void setReturnLogger(Logger logger);
    /**
     * Геттер
     * getReturnHandler return (FileHandler)
     */
    FileHandler getReturnHandler();
    /**Сеттер
     * setReturnHandler
     */
    void setReturnHandler(FileHandler handler);
    /**
     * Геттер
     * getPath() return (String)
     */
    String getPath();
    /**
     * Сеттер
     * setPath(String path)
     */
    void setPath(String path);
    /**
     * logInfo(String message)
     */
    void logInfo(String message);

}