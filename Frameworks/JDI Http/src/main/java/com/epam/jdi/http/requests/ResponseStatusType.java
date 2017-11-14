package com.epam.jdi.http.requests;

import com.epam.jdi.http.ExceptionHandler;

/**
 * Created by Roman_Iovlev on 12/19/2016.
 */
public enum ResponseStatusType {
    OK, REDIRECT, ERROR, SERVER_ERROR;

    public static ResponseStatusType getStatusType(int statusCode) {
        switch (statusCode/100) {
            case 2: return OK;
            case 3: return REDIRECT;
            case 4: return ERROR;
            case 5: return SERVER_ERROR;
        }
        throw ExceptionHandler.exception("Unknown status code: '%s'", statusCode);
    }
}
