public class MinLevelException{
    private static final String EXCEPT_MSG = "%s can't be less than level 1!\n";
    //Exception message
    private String pokemonName;
    //instance variable for the pokeman name

    /**
     *Constructor for the exception class
     * @param takes name of the pokemon
     * @return constructor don't hava return type
     */
    public MinLevelException(String name){
        // constructor for this expection class
        super(String.format(String, EXCEPT_MSG, name));
        // calls the parent constructor 
        this.pokemonName = name;
    }
    /**
     *Override the toString method so that it can print the Error message and the pokemon's name
     * @param takes in no parameter
     * @return return the the Error message and the pokemon's name
     */
    @Override
    public String toString(){
        return String.format(String, EXCEPT_MSG, pokemonName);
    }
}
