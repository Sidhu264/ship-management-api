🚢 Ship Management API
======================

A simple RESTful API built with Spring Boot and H2 Database to manage ships.

This project demonstrates clean code practices, validation, exception handling, and API documentation/testing with Postman.

Deployed live on Render.

🌍 Live Demo
------------

👉 Ship Management API on Render

Note: The app is hosted on Render free tier, so it may take 30–60 seconds to spin up on the first request.

📌 Features
-----------

*     - GET /ships → Fetch all ships  - GET /ships/{id} → Fetch ship by ID  - POST /ships → Create a new ship  - PUT /ships/{id} → Update an existing ship  - DELETE /ships/{id} → Delete a ship
    
*   Input validation (name required, valid email)
    
*   Global exception handling with clean JSON error responses
    
*   In-memory H2 database for simplicity
    

⚙️ Tech Stack
-------------

*   Java 17
    
*   Spring Boot 3.x
    
*   Spring Data JPA
    
*   H2 Database
    
*   Lombok
    
*   Maven
    
*   Docker (for deployment)
    

🚀 Running the Application
--------------------------

### 1️⃣ Local Setup

Make sure you have **Java 17+** and **Maven** installed.

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   git clone [https://github.com/](https://github.com/)/ship-management-api.git  cd ship-management-api  ./mvnw spring-boot:run   `

The API will be available at:

👉 http://localhost:8080

### 2️⃣ Using Docker

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   docker build -t ship-api .  docker run -p 8080:8080 ship-api   `

📖 API Endpoints
----------------

### GET all ships

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   GET /ships   `

Response: 200 OK

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   [    {      "id": 1,      "name": "Titanic",      "email": "titanic@ships.com"    }  ]   `

### GET ship by ID

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   GET /ships/{id}   `

Success → 200 OK

Not found → 404 Not Found

### Create ship

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   POST /ships   `

Body:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   {    "name": "Titanic",    "email": "titanic@ships.com"  }   `

Response: 201 Created

### Update ship

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   PUT /ships/{id}   `

Body:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   {    "name": "Updated Titanic",    "email": "updated@ships.com"  }   `

Response: 200 OK

### Delete ship

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   DELETE /ships/{id}   `

Response: 200 OK

🧪 Postman Collection
---------------------

A Postman collection with all endpoints and automated tests is included.

File: /postman/Ship Management API.postman\_collection.json

Import into Postman to test the API.

Tests cover:

✅ GET /ships returns 200 OK

✅ POST /ships returns 201 Created

✅ GET /ships/{id} returns 404 for missing ship

✅ PUT /ships/{id} returns 200 OK with updated values

✅ DELETE /ships/{id} returns 200 OK
