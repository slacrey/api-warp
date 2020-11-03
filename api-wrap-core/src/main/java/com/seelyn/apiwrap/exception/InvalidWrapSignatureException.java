package com.seelyn.apiwrap.exception;

/**
 * 签名错误
 *
 * @author linfeng
 */
public class InvalidWrapSignatureException extends WrapException {

    public InvalidWrapSignatureException(String message) {
        super(message);
    }
}
