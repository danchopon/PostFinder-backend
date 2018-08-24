## Prerequisites

* Java, Maven, Git, and the Spring framework
* An installed version of [Postgres](http://www.postgresql.org/) to test locally

### Option 1. Clone the Sample App

Just change ${username} to yours:

    :::term
    $ git clone git@10.111.12.249:${username}/geolocation-server.git

### Option 2. Setup database connection

In src/main/resources/hibernate.cfg.xml set your database details 

### Start Your App

<div class="callout" markdown="1">
Note: you can also start your app using your ide "run" button (shift+f10)
</div>

    :::term
    $ mvn package && java -jar target/postgres-demo-0.0.1-SNAPSHOT.jar

### Test it

Go to <http://localhost:8080/incidents> and test it out