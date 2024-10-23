[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/OMYeOzuQ)
![java fx logo](https://imgur.com/pyTZgzk.jpg)

# Lab 07: HelloWorld + GUIs Intro

GUIs, or Graphical User Interfaces, are the most common way we use computer applications. Whether the input is from the
keyboard, mouse, or touch, there are many ways users interact with GUIs to accomplish tasks or solve problems. As a
front-end developer, a programmer who focuses on the side that the user interacts with, we must constantly think of our
end-users and how to best support them in accomplishing their task. For that, we're going to have to practice some
fundamentals of GUI development through learning the JavaFX library.

## Tips

- Use OLI to understand how the given Hello World functions and other examples
- Search for generic things you want to accomplish, like "change title of javafx window" to give you some direction
- All parts below require very little code. Each ToDo can be as simple as changing a line of code or adding 2-3 lines
  max. You don't need to mess with the structure of the program, just editing little pieces

## To-Dos

0. Setup IntelliJ (BIG Step! follow instructions on Canvas)
1. Clone project
2. PT1: Create a start method: public void start(Stage primaryStage) throws Exception{}
3. Give our primary stage a title: primaryStage.setTitle(“Hello GUI: Your Name”);
4. Create a layout: https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
5. We're going to use StackPane: StackPane layout = new StackPane();
6. Create a scene: Scene scene = new Scene(layout, 300, 300);
7. Set our scene: primaryStage.setScene(scene);
8. Show our scene: primaryStage.show();
9. When it works, Commit and Push...
10. PT2: Add a label: Label label = new Label();
11. Modify our label: label.setText(“Hello GUI World”);
12. Add our label to the scene: layout.getChildren.add(label);
13. Create an AnchorPane: AnchorPane anchorPane = new AnchorPane();
14. Position our label 1: anchorPane.setBottomAnchor(label, 0.0);
15. Position our label 2: anchorPane.setRightAnchor(label, 0.0);
16. Add our label to the anchor: anchorPane.getChildren().add(label);
17. Replace our label with the anchor: layout.getChildren().add(anchorPane);
18. When it works, Commit and Push...
19. PT3: Add another label and two buttons, placing one in each corner
20. Follow good GUI wireframe design, placing text on the top, and buttons on the bottom
21. When it works, Commit and Push...
22. PT4: Adding functionality
23. Implement event handler: implements EventHandler<ActionEvent>
24. Add the method header: public void handle(ActionEvent actionEvent) {}
25. Add class reference variables to your buttons and labels
26. Check for button press: if(actionEvent.getSource() == button) {} // replace button with the name you gave it
27. On button press, change the text of a label: label.setText("New Text!"); // replace label with the name you gave it
28. When it works, Commit and Push...
29. Add support for your second button, have this one count button presses and display them on the second label
30. When it works, Commit and Push...
31. Add a text field in the center of your layout
32. Modify your first button so that when it is pressed, any entered text will be set as the text on your first label
33. When it works, Commit and Push...
34. If you have free time, experiment with your layout! But only Commit and Push if you really like it!
