package com.ota.coding.challenge.exception;

public class InvalidNoteException extends CodedException {

    private static final String INVALID_NOTE_MESSAGE = "Could not find note";
    private static final String INVALID_NOTE_CODE = "N000";
    public InvalidNoteException() {
        super(INVALID_NOTE_MESSAGE, INVALID_NOTE_CODE);
    }
}
