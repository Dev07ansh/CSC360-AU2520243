session-07-27/08/26

# Class Reflection
- Maven simplifies dependency management through transitive dependencies and automated artifact fetching
- Release management involves CI/CD (Continuous Integration/Continuous Deployment) to automate building, testing, and deploying code
- Professional programming prioritizes cost-efficiency, memory management, and risk mitigation through robust testing
- Unit testing (e.g., JUnit) is essential for validating code, ensuring backward compatibility, and enabling rapid bug fixes
- Character sets and versioning (source vs. target) are critical for maintaining cross-platform compatibility and performance


## Keywords
Maven, Transitive Dependency, CI/CD, Release Management, Unit Testing, JUnit, Backward Compatibility, Character Sets


## List of topics discussed:
- **Maven and Dependency Management** – transitive dependencies and automated artifact fetching
- **CI/CD and Release Management** – automating build, test, and deployment pipelines
- **Versioning and Compatibility** – source vs. target versions and backward compatibility
- **Professional Software Testing** – unit testing with JUnit and its role in maintenance



## Notes

### Topic 1 - Maven and Dependency Management
- Maven automates fetching dependencies from repositories based on Group ID and Artifact ID
- Transitive dependencies allow Maven to automatically pull in secondary dependencies required by a primary library
- The POM file acts as the configuration hub defining project dependencies and metadata

### Topic 2 - CI/CD and Release Management
- **Continuous Integration (CI):** automates pulling code, compiling, and running tests to ensure integration success
- **Continuous Deployment (CD):** automates the process of building and deploying the application to a production environment
- Release management is a professional discipline requiring full-time focus on workflow, stability, and deployment pipelines

### Topic 3 - Versioning and Compatibility
- **Source version:** defines which language features are allowed during compilation
- **Target version:** defines the environment/runtime where the compiled code will execute
- Java maintains backward compatibility, allowing newer runtimes to execute older compiled code

### Topic 4 - Professional Software Testing
- Testing is the primary form of validation that distinguishes professional code from amateur code
- Unit testing (e.g., JUnit) allows developers to isolate and identify specific points of failure within a codebase
- Automated tests are crucial for long-term maintenance, allowing developers to quickly identify bugs in complex systems months after development

## Review Questions
- **What is a transitive dependency, and why is it important in build management?**
  - *Reference: Maven and Dependency Management* — it is the automatic resolution of secondary dependencies required by a primary library, preventing manual tracking of hundreds of files
- **What is the difference between 'Source' and 'Target' versions in Java compilation?**
  - *Reference: CI/CD and Release Management > Versioning and Compatibility* — Source version restricts language features used; Target version determines the runtime environment compatibility

## Advanced Questions
- How does the implementation of unit tests directly impact the 'cost' of software maintenance over time?
- Why might a professional developer choose a specific character set or data type (e.g., float vs. double) even when modern hardware has abundant memory?