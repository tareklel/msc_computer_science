import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Triangle3 extends Application{	
	@Override
	public void start (Stage stage)
	{
		
		Group root = new Group();
		Scene scene = new Scene(root,600,600);

		Line line1 = new Line(100, 70, 100, 250);
		Line line2 = new Line(100, 250, 400, 250);
		Line line3 = new Line(400, 250, 100, 70);		
		
		root.getChildren().add(line1);
		root.getChildren().add(line2);
		root.getChildren().add(line3);
		scene.setRoot(root);
		stage.setScene(scene);
		stage.show();
	}
	
	 public static void main(String[] args)    
	    {         
	    	launch(args);
	    }  

}
