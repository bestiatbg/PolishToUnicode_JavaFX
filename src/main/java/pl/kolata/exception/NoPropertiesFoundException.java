package pl.kolata.exception;

/**
 * Exception thrown when properties file cannot be found
 * Created by Aleksander on 2017-06-29.
 */
public
    class NoPropertiesFoundException
    extends Exception{

    public NoPropertiesFoundException(String message,Throwable cause){
        super(message,cause);
    }
}
