# GraphicalSquare

A minimal Java Swing application that opens a window and draws a blue square outline on it.

## Project Structure

```
GraphicalSquare/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── GraphicalSquare.java
```

* **`pom.xml`** — the Maven build file that defines project dependencies, the Java version to compile against, and how the project is packaged/run.
* **`src/main/java/GraphicalSquare.java`** — the single source file containing the `GraphicalSquare` class, which extends `JPanel` and draws the square. It also contains the `main` method that launches the application.

## Requirements

This project was built and tested using:

```
openjdk version "26.0.2" 2026-07-21
OpenJDK Runtime Environment Homebrew (build 26.0.2)
OpenJDK 64-Bit Server VM Homebrew (build 26.0.2, mixed mode, sharing)

Apache Maven 3.9.16
```

The Maven configuration targets Java 21, so the project requires:

* JDK 21 or newer,
* Apache Maven 3.x,
* a graphical desktop environment that can display a Swing window.

Swing and AWT are part of the JDK and do not need to be installed separately.

Check the active Java and Maven versions with:

```
java -version
mvn -version
```

`mvn -version` is particularly useful because it reports the JDK Maven is actually using.

## Code Walkthrough

Below is a line-by-line explanation of `GraphicalSquare.java`.

```java
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
```
These four imports bring in the classes needed for the GUI:
* `Color` — represents colors (used to color the square).
* `Graphics` — the drawing toolkit used to render shapes onto a component.
* `JFrame` — the top-level window that holds the application.
* `JPanel` — a lightweight container that can be customized to draw its own content; this is where the square is actually drawn.

```java
public class GraphicalSquare extends JPanel {
```
Declares the class `GraphicalSquare`, which extends `JPanel`. Extending `JPanel` lets this class override how the panel is drawn, rather than just using it as a plain container.

```java
    @Override
    protected void paintComponent(Graphics g) {
```
Overrides `paintComponent`, the method Swing calls whenever the panel needs to be (re)drawn — for example, when the window first appears, is resized, or is uncovered by another window. The `Graphics g` parameter is the drawing context supplied by Swing, used to issue drawing commands.

```java
        super.paintComponent(g);
```
Calls the parent class's (`JPanel`'s) implementation first. This clears/repaints the panel's background properly before any custom drawing happens. Skipping this can cause visual artifacts when the window is resized or redrawn.

```java
        // Set the color of the shape
        g.setColor(Color.BLUE);
```
Sets the current drawing color on the `Graphics` object to blue. Any shape drawn after this line will use this color, until it's changed again.

```java
        // drawRect(x, y, width, height) - drawn as an outline
        g.drawRect(50, 50, 150, 150); 
```
Draws a rectangle outline (not filled in) starting at coordinates `(50, 50)` — measured from the top-left corner of the panel — with a width of `150` pixels and a height of `150` pixels. Since width equals height, the rectangle is a square. `drawRect` only draws the border; `fillRect` would be used instead to draw a solid square.

```java
    }
```
Closes the `paintComponent` method.

```java
    public static void main(String[] args) {
```
The program's entry point. This is what runs when the application is launched.

```java
        JFrame frame = new JFrame("Draw a Square");
```
Creates a new top-level window (`JFrame`) with the title `"Draw a Square"`, which appears in the window's title bar.

```java
        GraphicalSquare panel = new GraphicalSquare();
```
Creates an instance of the `GraphicalSquare` panel defined above. This is the custom panel whose `paintComponent` method draws the blue square.

```java
        frame.setSize(500, 300);
```
Sets the window's size to 500 pixels wide by 300 pixels tall.

```java
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
Configures the window so that clicking the close ("X") button terminates the application. Without this, closing the window would hide it but leave the Java process running.

```java
        frame.add(panel);
```
Adds the custom `GraphicalSquare` panel to the frame, so its contents (the drawn square) become part of the window.

```java
        frame.setVisible(true);
```
Makes the window visible on screen. Before this call, the frame exists in memory but is not shown to the user.

```java
    }
}
```
Closes the `main` method and the `GraphicalSquare` class.

## Running the Project

```
mvn compile
mvn exec:java -Dexec.mainClass="GraphicalSquare"
```

A window titled **"Draw a Square"** should appear, containing a blue square outline.