# Hello Spencer

Simple Hello World style app for demos

## To Modify

If you want to modify the functionality of the application, you can do so and rebuild the app with 

```
./mvnw clean package
```

## Change Docker Image/Locatin

If you want to change where the the Docker image is located, just run docker build and push, the Java `hello-spencer.jar` aritfact is already available in the repo.

## To Deploy Without Modification

Application should be ready to go with simple. Load balancer already part of deployment file as well.  

```
kubectl apply -f deployment.yml
```

## Usage

Application resides at `/hello`, which will respond with `Hello World!`. Optional request param `msg` can be added to modify response e.g. `/hello?msg=Spencer` returns `Hello Spencer`.