public class NoStorageSpaceException{
    private static final String EXCEPT_MSG = "No storage left\n";
    //Exception message
    /**
     *Constructor for the exception class
     * @param takes name of the pokemon
     * @return constructor don't hava return type
     */
    public NoStorageSpaceException(){
        // constructor for this expection class
        super(EXCEPT_MSG);
        // calls the parent constructor 
    }
    /**
     *Override the toString method so that it can print the Error message
     * @param takes in no parameter
     * @return return the the Error message 
     */
    @Override
    public String toString(){
        return String.format(String, EXCEPT_MSG);
    }
}
