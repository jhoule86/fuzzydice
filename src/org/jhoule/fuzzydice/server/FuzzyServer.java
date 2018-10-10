/*
 * File: FuzzyServer.java
 * Author: jhoule
 * Updated: 12 Jan 2010
 */

package fuzzydice.server;

import netgame.server.GameServer;

/**
 * The base class for servers for the Fuzzy Dice game.
 * @author jhoule
 */
public class FuzzyServer extends GameServer {

    /**
     * No-Arg constructor, for extension purposes.
     */
    public FuzzyServer()
    {
        super();
    }
    
    /**
     * Constructor. Sets the port for the server.
     * @param port - the port to listen on.
     */
    public FuzzyServer(int port)
    {
        super(port);
    }
    
    /**
     * Constructor. Sets the port and name.
     * @param port - the port to listen on.
     * @param name - the name for the Server to identify itself with.
     */
    public FuzzyServer(int port, String name)
    {
        super(port, name);
    }
    
    /**
     * The main function of the Server.
     * starts an instance according to the specified arguments.
     * @param args - the user's arguments.
     */
    public static void main (String[] args)
    {
        
        System.err.println("========================\n"
                + "++++ FUZZY DICE ++++\n"
                + "is still a work in progress."
                + "\n"
                + "Goodbye!");
       
        System.exit(0);
    }

}
