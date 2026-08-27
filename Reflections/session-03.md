session-03-13/08/26

# Class Reflection


## List of topics discussed
- **Maven Installation & First Java Project** – setting up Apache Maven on Windows and creating our first project
- **Java Swing App Setup** – using JFrame and JPanel, and the evolution of Java GUI frameworks
- **Drawing with paintComponent** – inspecting square code and understanding coordinate-based drawing

## Notes

### Topic 1 – Maven Installation and First Java Project
We installed Apache Maven in class and used it to create our first Java project.

**Maven Project Structure:**
- **`src`** – the source folder containing all the project's code
  - `src/main/java` – contains the actual Java source files (application code)
  - `src/main/resources` – contains non-code resources (config files, images, etc.)
  - `src/test/java` – contains test code
- **`target`** – auto-generated folder where Maven puts compiled output (`.class` files, packaged `.jar`, etc.); not manually edited
- **`pom.xml`** – the Project Object Model file; defines project dependencies, plugins, build settings, and the Java version used

### Topic 2 – Java Swing App Setup & Types of GUI Framework 
- Set up a basic Java Swing application:
  - **JFrame** – acts as the main window of the application
  - **JPanel** – acts as the drawable surface/container placed inside the JFrame
- **Java GUI Frameworks :**
  - **AWT (Abstract Window Toolkit)** – earliest Java GUI framework; relies on native OS components
  - **Swing** – built on top of AWT; lightweight, more flexible, platform-independent components
  - **JavaFX** – newer framework; modern UI capabilities, richer styling and layout options than Swing

### Topic 3 – Drawing a Square Using a Point and Lines
- Started with how to draw a simple square using only a point and lines
- Inspected the square-drawing code and broke down the logic:
  - First, ask for the **length** of the square
  - Define the **origin** as the center of the screen
  - Decide the **correct direction** to start drawing from (top-left, top-right, bottom-left, or bottom-right)
  - Calculate the **x and y coordinates** based on the center point and length
  - Use these coordinates to draw the square accurately on the panel