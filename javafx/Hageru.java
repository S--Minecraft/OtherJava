import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Hageru extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox();

		HBox top = new HBox();
		Label hageAA = new Label("   彡⌒ミ\n (´･ω･`)\n   ―――");
		Label OK = new Label("\n　　　ハゲますが、よろしいですか?");
		top.getChildren().addAll(hageAA,OK);

		HBox bottom = new HBox();
		Label fpad = new Label("　");
		Button no1 = new Button("いいえ(N)");
		Label pad1 = new Label("　");
		Button no2 = new Button("いいえ(N)");
		Label pad2 = new Label("　");
		Button no3 = new Button("いいえ(N)");
		bottom.getChildren().addAll(fpad,no1,pad1,no2,pad2,no3);

		root.getChildren().addAll(top,bottom);

		no1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage newStage = new Stage();
				newStage.initModality(Modality.APPLICATION_MODAL);
				newStage.initOwner(primaryStage);

				VBox nStageRoot = new VBox();
				Label label = new Label("ダメです、ハゲてもらいます");
				nStageRoot.getChildren().add(label);

				newStage.setScene(new Scene(nStageRoot));
				newStage.show();
			}
		});
		no2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage newStage = new Stage();
				newStage.initModality(Modality.APPLICATION_MODAL);
				newStage.initOwner(primaryStage);

				VBox nStageRoot = new VBox();
				Label label = new Label("ダメです、ハゲてもらいます");
				nStageRoot.getChildren().add(label);

				newStage.setScene(new Scene(nStageRoot));
				newStage.show();
			}
		});
		no3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage newStage = new Stage();
				newStage.initModality(Modality.APPLICATION_MODAL);
				newStage.initOwner(primaryStage);

				VBox nStageRoot = new VBox();
				Label label = new Label("ダメです、ハゲてもらいます");
				nStageRoot.getChildren().add(label);

				newStage.setScene(new Scene(nStageRoot));
				newStage.show();
			}
		});
		root.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				Stage newStage = new Stage();
				newStage.initModality(Modality.APPLICATION_MODAL);
				newStage.initOwner(primaryStage);

				VBox nStageRoot = new VBox();
				Label label = new Label("そうですか。では、ハゲてもらいます");
				nStageRoot.getChildren().add(label);

				newStage.setScene(new Scene(nStageRoot));
				newStage.show();
			}
		});

		Scene scene = new Scene(root,230,80);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
