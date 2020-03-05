public class OutOfBoundsException{
    private static final String EXCEPT_MSG = "Out of bounds: %s\n";
    //Exception message
    private String errorLocation;
    //instance variable for the pokeman name

    /**
     *Constructor for the exception class
     * @param takes name of the pokemon
     * @return constructor don't hava return type
     */
    public OutOfBoundsException(String loc){
        // constructor for this expection class
        super(String.format(String, EXCEPT_MSG, loc));
        // calls the parent constructor 
        this.errorLocation = loc;
    }
    /**
     *Override the toString method so that it can print the Error message and the pokemon's name
     * @param takes in no parameter
     * @return return the the Error message and the pokemon's name
     */
    @Override
    public String toString(){
        return String.format(String, EXCEPT_MSG, errorLocation);
    }
}
