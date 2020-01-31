class PinValidator {
    private final String PIN = "0000";
    private int countOfTries=0;
    private boolean validation = false;
    void validate(String userInput) throws LockException, IncorrectPinException {
        if(PIN.equals(userInput)){
            validation = true;
            return;
        }
        if(countOfTries==2) {
            countOfTries=0;
            throw new LockException("Incorrect input for 3 times");
        }
        countOfTries++;
        throw new IncorrectPinException("Incorrect input");

    }

    boolean isInValid() {
        return !validation;
    }
    void endOfOperation(){
        validation=false;
    }
}
