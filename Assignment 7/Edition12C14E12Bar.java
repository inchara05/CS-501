import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Edition12C14E12Bar extends Application {
	@Override 
	public void start(Stage BarChart) {
		HBox hB = new HBox(15);
		hB.setAlignment(Pos.BOTTOM_CENTER);
		String[] type = {"Project", "Quiz", "Midterm", "finals"};
		int[] grade = {20, 10, 30, 40};
		int max = getMax(grade);
		int height = 200;
		int width = 200;
		StackPane pane = new StackPane();
		pane.setPadding(new Insets(20, 15, 5, 15));

		Rectangle project = new Rectangle(0, 0, width, height * grade[0] / max);
		project.setFill(Color.RED);
		Rectangle quiz = new Rectangle(0, 0, width, height * grade[1] / max);
		quiz.setFill(Color.BLUE);
		Rectangle midterm = new Rectangle(0, 0, width, height * grade[2] / max);
		midterm.setFill(Color.GREEN);
		Rectangle finals = new Rectangle(0, 0, width, height * grade[3] / max);
		finals.setFill(Color.ORANGE);

		Text t1 = new Text(0, 0, type[0] + " -- " + grade[0] + "%");
		Text t2 = new Text(0, 0, type[1] + " -- " + grade[1] + "%");
		Text t3 = new Text(0, 0, type[2] + " -- " + grade[2] + "%");
		Text t4 = new Text(0, 0, type[3] + " -- " + grade[3] + "%");
		
		hB.getChildren().addAll(getVBox(t1, project), getVBox(t2, quiz), 
			getVBox(t3, midterm), getVBox(t4, finals));
		pane.getChildren().add(hB);

		Scene box = new Scene(pane);
		BarChart.setTitle("Bar Chart to display the percentages of the overall grade"); 
		BarChart.setScene(box); 
		BarChart.show();
	}

	public VBox getVBox(Text text, Rectangle rect) {
		VBox vBox = new VBox(5);
		vBox.setAlignment(Pos.BOTTOM_CENTER);
		vBox.getChildren().addAll(text, rect);
		return vBox;
	}

	public int getMax(int[] per) {
		int max = per[0];
		for (int i = 0; i < per.length; i++) {
			if (per[i] > max)
				max = per[i];
		}
		return max;
	}
}

