package GuilhermeLopes;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class is the main class of the "World of Zuul" application. "World of
 * Zuul" is a very simple, text based adventure game. Users can walk around some
 * scenery. That's all. It should really be extended to make it more
 * interesting!
 *
 * To play this game, create an instance of this class and call the "play"
 * method.
 *
 * This main class creates and initialises all the others: it creates all rooms,
 * creates the parser and starts the game. It also evaluates and executes the
 * commands that the parser returns.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */
public class Game {

    private Parser parser;
    private Room currentRoom;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() {

        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms() {
        Room outside, theatre, pub, lab, office, basement, attic;
        Item apple, banana, orange, pear, grape, plum, strawberry, watermelon;
        
        // create the itens
        apple = new Item("apple");
        banana = new Item("banana");
        orange = new Item("orange");
        pear = new Item("pear");
        grape = new Item("grape");
        plum = new Item("plum");
        strawberry = new Item("strawberry");
        watermelon = new Item("watermelon");
        
        // create the rooms
        outside = new Room("outside the main entrance of the university", apple);
        theatre = new Room("in a lecture theatre", banana);
        pub = new Room("in the campus pub", orange);
        lab = new Room("in a computing lab", pear);
        office = new Room("in the computing admin office", grape);
        basement = new Room("basement under the office", plum);
        attic = new Room("attic abkve the office, nothing here", strawberry);

        // initialise room exits
        outside.setExits(null, theatre, lab, pub, null, null);
        theatre.setExits(null, null, null, outside, null, null);
        pub.setExits(null, outside, null, null, null, null);
        lab.setExits(outside, office, null, null, null, null);
        office.setExits(null, null, null, lab, attic, basement);
        basement.setExits(null, null, null, null, office, null);
        attic.setExits(null, null, null, null, null, office);
        
        pub.addItem(watermelon);

        currentRoom = outside; // start game outside
    }

    /**
     * Main play routine. Loops until end of play.
     */
    public void play() {
        readFile();

        ManipulaArquivoTexto.abrirArquivoGravacao("Registro.txt");
        printWelcome();

        // Enter the main command loop. Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            if (command.getCommandWord() != null) {
                if (command.getCommandWord().equals("quit")) {
                    finished = processCommand(command);
                    break;
                }
                if (command.getSecondWord() != null) {
                    ManipulaArquivoTexto.gravarArquivo(command.getCommandWord() + " " + command.getSecondWord());
                } else {
                    ManipulaArquivoTexto.gravarArquivo(command.getCommandWord());
                }

            }

            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
        ManipulaArquivoTexto.fecharArquivo();
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to Adventure!");
        System.out.println("Adventure is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println("You are " + currentRoom.getDescription() + "\nEste lugar tem um(a)");
        currentRoom.printItens();
        System.out.print("Exits: ");

        Map<String, Room> exits = currentRoom.getExits();
        if (exits.containsKey("north")) {
            System.out.print("north ");
        }
        if (exits.containsKey("east")) {
            System.out.print("east ");
        }
        if (exits.containsKey("south")) {
            System.out.print("south ");
        }
        if (exits.containsKey("west")) {
            System.out.print("west ");
        }
        if (exits.containsKey("up")) {
            System.out.print("up ");
        }
        if (exits.containsKey("down")) {
            System.out.print("down ");
        }

        System.out.println();
    }

    /**
     * Given a command, process (that is: execute) the command. If this command
     * ends the game, true is returned, otherwise false is returned.
     */
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        if (command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        } else if (commandWord.equals("go")) {
            goRoom(command);
        } else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        } else if (commandWord.equals("seach")) {
            seach();
        } else if (commandWord.equals("eat")){
            eat();
        }
        return wantToQuit;
    }

    // implementations of user commands:
    /**
     * Print out some help information. Here we print some stupid, cryptic
     * message and a list of the command words.
     */
    private void printHelp() {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        CommandWords.printValidCommands();
    }

    /**
     * Try to go to one direction. If there is an exit, enter the new room,
     * otherwise print an error message.
     */
    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave the current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        } else {
            currentRoom = nextRoom;
            System.out.println(
                    "You are " + currentRoom.getDescription() + "\nThis place have a) ");
            currentRoom.printItens();
            System.out.print("Exits: ");

            Map<String, Room> exits = currentRoom.getExits();
            if (exits.containsKey("north")) {
                System.out.print("north ");
            }
            if (exits.containsKey("east")) {
                System.out.print("east ");
            }
            if (exits.containsKey("south")) {
                System.out.print("south ");
            }
            if (exits.containsKey("west")) {
                System.out.print("west ");
            }
            if (exits.containsKey("up")) {
                System.out.print("up ");
            }
            if (exits.containsKey("down")) {
                System.out.print("down ");
            }

            System.out.println();
        }
    }

    /**
     * "Quit" was entered. Check the rest of the command to see whether we
     * really quit the game. Return true, if this command quits the game, false
     * otherwise.
     */
    private boolean quit(Command command) {
        if (command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true; // signal that we want to quit
        }
    }

    private void seach() {
        System.out.println("You are " + currentRoom.getDescription());

        System.out.print("Exits: ");
        Map<String, Room> exits = currentRoom.getExits();
        if (exits.containsKey("north")) {
            System.out.print("north ");
        }
        if (exits.containsKey("east")) {
            System.out.print("east ");
        }
        if (exits.containsKey("south")) {
            System.out.print("south ");
        }
        if (exits.containsKey("west")) {
            System.out.print("west ");
        }
        if (exits.containsKey("up")) {
            System.out.print("up ");
        }
        if (exits.containsKey("down")) {
            System.out.print("down ");
        }
        System.out.println();

    }

    private void eat() {
        System.out.println("You eat a food");
    }
    
    private void readFile() {
        ManipulaArquivoTexto.abrirArquivoLeitura("Registro.txt");
        ArrayList<String> leitura = ManipulaArquivoTexto.lerArquivo();
        ManipulaArquivoTexto.fecharArquivoLeitura();
        
        for (String linha : leitura) {           
            String[] partes = linha.split(" ", 2);
            String palavra1 = partes.length > 0 ? partes[0] : "";
            String palavra2 = partes.length > 1 ? partes[1] : null;
            Command command = new Command(palavra1, palavra2);
            processCommand(command);

        }
    }
}
