import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    private String name;
    private Pokemon pokemon;
    
    public String User(String name){
        return this.name;
    }
    public void setPokemon(Pokemon p){
        this.pokemon = p;
    }
    public Pokemon getPokemon(){
        return this.pokemon;
    }
    public void switchs(){
    }
    public void heal(){
    }
    public void attack(String name, User enemy){
    }
    public void isEndGame(){
    }
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
