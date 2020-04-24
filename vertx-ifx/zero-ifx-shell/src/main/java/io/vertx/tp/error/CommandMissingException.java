package io.vertx.tp.error;

import io.vertx.up.exception.UpException;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class CommandMissingException extends UpException {

    public CommandMissingException(final Class<?> clazz, final String input) {
        super(clazz, input);
    }

    @Override
    public int getCode() {
        return -40072;
    }
}
