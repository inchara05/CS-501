import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;

public class Edition12C14E1Images extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage Display) {

		GridPane pane = new GridPane();
		pane.setHgap(6);
		pane.setVgap(6);

		Image germany = new Image("germany.jpg");
		ImageView img1 = new ImageView(germany);
		img1.setFitHeight(240);
		img1.setFitWidth(320);
		pane.add(img1, 0, 0);

		Image china = new Image("china.jpg");
		ImageView img2 = new ImageView(china);
		img2.setFitHeight(240);
		img2.setFitWidth(320);
		pane.add(img2, 1, 0);

		Image netherlands = new Image("netherlands.jpg");
		ImageView img3 = new ImageView(netherlands);
		img3.setFitHeight(240);
		img3.setFitWidth(320);
		pane.add(img3, 0, 1);

		Image usa = new Image("usa.jpg");
		ImageView img4 = new ImageView(usa);
		img4.setFitHeight(240);
		img4.setFitWidth(320);
		pane.add(img4, 1, 1);

		Scene box = new Scene(pane, 640, 480);
		Display.setTitle("Four Images displaying in grid pane");
		Display.setScene(box);
		Display.setResizable(false);
		Display.show();

	}
}