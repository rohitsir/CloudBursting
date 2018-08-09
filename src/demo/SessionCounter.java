package demo;

 

public class SessionCounter   {
	 
    public static int activeSessions = 0;
 
    public static void sessionCreated( ) {
        activeSessions++;
    }
 
    public static void sessionDestroyed( ) {
        if(activeSessions > 0)
            activeSessions--;
    }
 
    public static int getActiveSessions() {
        return activeSessions;
    }

	 
}
