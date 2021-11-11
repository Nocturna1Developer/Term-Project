package control;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

import application.Main;

/**
 * MainController 
 * 
 * This class will serve as the main controller class in which every "Controller" class will extend.
 * It will be responsible for changing all of the scenes.
 * 
 * @author Chinamay Kasareddy
 */
public abstract class MainController
{
	public Stage primaryStage = application.Main.window;
    private File musicFile = new File("/ProductivityApp_/src/control/background.mp3") ;
    private Media media;
    private MediaPlayer mediaPlayer;
	
	/**
	 * goToTimerPage() - This method will change the scene from the LoginPage to the TimerPage.
	 * 
	 */
	public void goToTimerPage() throws IOException
	{
		StackPane loginPage = (StackPane)FXMLLoader.load(getClass().getResource("../view/TimerPage.fxml"));
		Scene loginPageScene = new Scene(loginPage,1080,630);
		media = new Media(musicFile.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.play();
		primaryStage.setScene(loginPageScene);
		primaryStage.show();
	}
	
	/**
	 * goToMusicPage() - This method will change the scene from the LoginPage to the MusicPage.
	 * 
	 */
	public void goToMusicPage() throws IOException
	{
		StackPane loginPage = (StackPane)FXMLLoader.load(getClass().getResource("../view/MusicPage.fxml"));
		Scene loginPageScene = new Scene(loginPage,1080,630);
		
		primaryStage.setScene(loginPageScene);
		primaryStage.show();
	}
}
