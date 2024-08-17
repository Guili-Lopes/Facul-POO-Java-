package GuilhermeLopes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Class Room - a room in an adventure game.
 *
 * This class is the main class of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

public class Room 
{   
    Map<String, Room> exits = new HashMap<String, Room>();
    public String description;
    public ArrayList<Item> itens = new ArrayList<Item>();


    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     */
    public Room(String description, Item item) 
    {
        this.itens.add(item);
        this.description = description;
        this.exits = new HashMap<>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down) {
        if (north != null) exits.put("north", north);
        else exits.remove("north");

        if (east != null) exits.put("east", east);
        else exits.remove("east");

        if (south != null) exits.put("south", south);
        else exits.remove("south");

        if (west != null) exits.put("west", west);
        else exits.remove("west");

        if (up != null) exits.put("up", up);
        else exits.remove("up");

        if (down != null) exits.put("down", down);
        else exits.remove("down");
    }

    /**
     * Return the description of the room (the one that was defined
     * in the constructor).
     */
    public String getDescription()
    {
        return description;
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public Map<String, Room> getExits() {
        return exits;
    }
    
    public ArrayList<Item> getItens(){
        return this.itens;
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public void printItens(){
        for(Item i : itens)
            System.out.print(" " + i.getNome() + " ");
    }
}
