package Classes;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Interfaces.iLog;
/**
 * Абстрактный класс логгера
 * Поля: logger (Logger), handler (FileHandler), path (String), formatter (SimpleFormatter)
 */
public abstract class Log implements iLog {
    protected Logger logger;
    protected FileHandler handler;
    protected String path;
    protected SimpleFormatter formatter;
}
