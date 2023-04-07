# Policy-Management_SpringBoot

## About the Project
The Spring Boot project is a web application designed to manage clients, insurance policies, and claims. The project has three model classes, namely Client, InsurancePolicy, and Claim.  
  
The Client model class is used to store information about the clients who have purchased insurance policies. This includes attributes such as the client's name, address, email, and phone number. Each client can have one or more insurance policies associated with them.  
  
The InsurancePolicy model class is used to store information about the insurance policies purchased by the clients. This includes attributes such as the policy number, start date, end date, coverage amount, and premium. Each policy is associated with one client.  
  
The Claim model class is used to store information about the claims made by the clients against their insurance policies. This includes attributes such as the claim number, claim date, claim amount, and claim status. Each claim is associated with one policy.  


## Running Examples  
  
1.Download the zip or clone the Git repository.    
2.Unzip the zip file (if you downloaded one)  
3.Open Command Prompt and Change directory (cd) to folder containing pom.xml  
4.Open Eclipse or IntelliJ  
5.File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip  
6.Select the right project  
7.Choose the Spring Boot Application file (search for @SpringBootApplication)  
8.Right Click on the file and Run as Java Application  


## API's  
  
Each model class has 5 API's like getAll,getById,add,delete and update.  
  
1.Client Model Class APIs:  
/api/clients (GET Method): This API retrieves a list of all clients stored in the database.  
/api/clients/{id} (GET Method): This API retrieves the details of a particular client based on their unique ID.  
/api/clients (POST Method): This API adds a new client to the database with the provided details.  
/api/clients/{id} (DELETE Method): This API removes an existing client from the database based on their unique ID.  
/api/clients/{id} (PUT Method): This API updates the details of an existing client in the database based on their unique ID.  
  
2.InsurancePolicy Model Class APIs:  
/api/policies (GET Method): This API retrieves a list of all insurance policies stored in the database.  
/api/policies/{id} (GET Method): This API retrieves the details of a particular insurance policy based on its unique ID.  
/api/policies (POST Method): This API adds a new insurance policy to the database with the provided details.  
/api/policies/{id} (DELETE Method): This API removes an existing insurance policy from the database based on its unique ID.  
/api/policies/{id} (PUT Method): This API updates the details of an existing insurance policy in the database based on its unique ID.  
  
3.Claim Model Class APIs:  
/api/claims (GET Method): This API retrieves a list of all claims stored in the database.  
/api/claims{id} (GET Method): This API retrieves the details of a particular claim based on its unique ID.  
/api/claims (POST Method): This API adds a new claim to the database with the provided details.  
/api/claims/{id} (DELETE Method): This API removes an existing claim from the database based on its unique ID.  
/api/claims/{id} (PUT Method): This API updates the details of an existing claim in the database based on its unique ID.  
