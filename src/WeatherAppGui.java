import javax.swing.*;

public class WeatherAppGui extends JFrame{
    public WeatherAppGui(){
        //setting up gui and title
        super("Weather App");

        //configure gui to end the program's process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set the size of the gui
        setSize(450,650);

        //load our gui at the center of the screen
        setLocationRelativeTo(null);

        //make our layout manager null to manually position our components within the gui
        setLayout(null);

        //prevent any resize of the gui
        setResizable(false);

    }
}