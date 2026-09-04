session-02-06/08/26

# Class Reflection

## List of topics discussed
- **SSH vs HTTPS** – comparing the two protocols and how they secure communication
- **Public/Private Keys** – how SSH authentication relies on key pairs
- **Computer Graphics vs Image Processing** – generating vs manipulating images
- **Vector vs Raster Graphics** – two ways of representing images
- **Geometric Primitives** – the basic building blocks used to draw shapes
- **Java Graphical Frameworks** – AWT and Swing
## Notes
 
### SSH vs HTTPS
SSH and HTTPS both provide encrypted communication but serve different purposes.
- **SSH** – used for secure remote access/login to a machine; executes commands over an encrypted channel
- **HTTPS** – secures web traffic between browser and server (page requests, form data)
- **Tool** – `ssh` command-line utility, along with `ssh-keygen` to generate key pairs
### Public and Private Keys
SSH authentication is based on public-private key pairs.
- **Private key** – kept secret on the local machine, never transmitted
- **Public key** – shared with the server; used to verify the client holds the matching private key
- SSH uses a simple public-private keypair model
- Keys generated via `ssh-keygen` are stored in the user's home directory (`~/.ssh/`)
### Computer Graphics vs Image Processing
- **Computer Graphics** – generates images from scratch using mathematical models, geometric data, and rendering (synthesis)
- **Image Processing** – starts with an existing image and analyzes/enhances/transforms it (e.g., filtering, edge detection, color correction)
- In short: graphics = creation, image processing = manipulation of existing data
### Vector Graphics vs Raster Graphics
- **Vector Graphics** – images defined by mathematical/geometric descriptions (points, lines, curves); scale infinitely without quality loss; ideal for logos, diagrams
- **Raster Graphics** – images made of a fixed grid of pixels; lose quality when scaled up; used for photographs and detailed images
- Key trade-off: vector = scalability, raster = photorealistic detail
### Geometric Primitives
Basic building blocks used to construct drawings:
- **Lines** – simplest connection between two points
- **Curves** – smooth, non-linear paths for complex/organic shapes
- **Areas** – enclosed regions bounded by lines or curves, e.g. filled shapes
### Java Graphical Frameworks
- **AWT (Abstract Window Toolkit)** – original Java GUI toolkit; relies on native OS rendering
- **Swing** – built on top of AWT; lightweight, platform-independent components; supports custom rendering (e.g., overriding `paintComponent`)
- Together, they form the foundation for building desktop GUIs and drawing graphics in Java.