# Phone-Catalog App

### Explanation of the app:

The app Phone-Catalog is formed by a list of mobile phones that the user can see. The information of the mobile phones is contained in a API REST that is provided in the backend part of the project. The frontend part is implemented in React. In my app, I have done the API REST in Java and I tried to do the React part as best as I could. I haven´t been able to take the information from de API in the React part, but I have the code of this part in frontend_phonecatalogapi, so you can check it. There is also another file named frontend_phonecatalog, where I have implemented the visual part of the App, with a title and the list of mobile phones with a photo. If you press the mobile phone, a text appears.

### Backend:

The API REST is implemented in Java with Spring. 

- I created a **DatabaseInitializer** file that contains the information of five phones. This information is stored in a SQL Database, in particular, I have used the Database MySQL. 

- There is a model named **Phone**, that is particularly the class Phone, that contains the properties of a phone, the constructor, getters and setters, etc. 

- There is a **Repository** for the database, where the queries are done.

- I have created a **Service** that contains methods like find a mobile phone by its id or save a phone in the database. This service is usefull so you can use this methods in the Controller.

- Finally, there is a **RestController** where there are two endpoints: GET all phones, and GET a phone by its id. With this, you can use the information stored in the database in the React app. Here you can see that the information provided by the API is in the route /phones/

- If you want to check that the endpoints work correctly, you can use **Postman** for it. You have a Postman collection so you can use it in the Postman App.

To execute the API REST:

1. Download the Project
2. Open it in Spring Tool Suite 4
3. Go to src/main/java => com.phonecatalog
4. Right click on the file PhoneCatalogApplication.java => Run As => Spring Boot App
5. Open Chrome or Firefox and put http://localhost:8080/phones/
6. There you have the information of the API REST

### Frontend:

There are two files for this part. 

#### File frontend_phonecatalog:

Here, I have tried to do the structure of the App, with a title, a small description of the app and the list of phones. I have introduced a photo and if you press on the phone name, a text appears in the route /phoneInfo.

- There are three components: **PhoneList, PhoneItem and PhoneInfo**. PhoneList is an array that is formed by a list of PhoneItems. PhoneItem contains the properties of a phone and prints the name and the photo. PhoneInfo should contain the information that should be printed when the user presses a phone. 

- There are also the **App.jsx** file and the **index.js** file. In App.jsx there is the structure of the visual part of the app, and the routing. The file index.js is where all the information is renderized. 

To execute this React App:
1. Download the project if you haven't done jet.
2. Open it in Visual Studio Code
3. Open the terminal and go to the file frontend_phonecatalog doing cd.
4. Execute the command npm start.
5. The app should have opened in your usual browser, but if not, search http://localhost:3000
6. There you have the React App

#### File frontend_phonecatalogapi:

Here, I have tried to take the information of the API REST to print the list of the 5 phones in the React App. I have put Charging Phones... if the API REST information is not found, what seems that is happening. Even so, I invite you to check my code in frontend_phonecatalogapi to check what is going wrong. The part of taking the data from the API is in the file **App.jsx**, with componentWillMount() and render() methods. The other components, PhoneList and PhoneItem are the same as in frontend_phonecatalog, as well as the index.js file.

To execute this React App follow the same steps as in the frontend_phonecatalog file, but you should execute the API REST first. 
