import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

        addGuiComponents();
    }
    public void addGuiComponents(){
        // search field
        JTextField searchTextField = new JTextField();

        // set the location and size of our component
        searchTextField.setBounds(15, 15, 351, 45);

        // change the font style and size
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(searchTextField);

        //Search button
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));

        //change the cursor on this button
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,14,47,45);
        add(searchButton);

        //weather images

        JLabel weatherConditionImage = new JLabel(loadImage("src/assets/cloudy.png"));
        weatherConditionImage.setBounds(0,125,450,217);
        add(weatherConditionImage);

        //temperature txt
        JLabel temperatureText = new JLabel("10 C");
        temperatureText.setBounds(0,350,450,54);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));

        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);


        //weather condition description
        JLabel weatherConditionDesc = new JLabel("Cloudy");
        weatherConditionDesc.setBounds(0,405,450, 36);
        weatherConditionDesc.setFont(new Font("Dialog", Font.BOLD, 32));
        weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDesc);

        //humidity image

        JLabel humidityImage = new JLabel(loadImage("src/assets/humidity.png"));
        humidityImage.setBounds(15,500,74,66);
        add(humidityImage);

        //humidity text

        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));
        humidityText.setBounds(90,500,85,55);
        add(humidityText);

        //windspeed image
        JLabel windSpeedImage = new JLabel(loadImage("src/assets/windspeed.png"));
        windSpeedImage.setBounds(220,500,74,66);
        add(windSpeedImage);

        //windspeed text
        JLabel windSpeedText = new JLabel("<html><b>Windspeed</b> 15km/h</html>");
        windSpeedText.setBounds(310,500,85,55);
        windSpeedText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(windSpeedText);
    }

    private ImageIcon loadImage(String path){
        try{
            BufferedImage image = ImageIO.read(new File(path));

            return new ImageIcon(image);

        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("could not find image");
        return null;
    }
}