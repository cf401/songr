# Challenge Summary
<!-- Short summary or background information -->
Demonstrate basic understanding of Spring M.V.C.
create album model
create album controller
create a song model

## Challenge Description
<!-- Description of the challenge -->
```
- Use models to pass data
- use a view of different pages
- write a controller

- write an album model
- write a album controller
- write a page to display and show data

- write a song model
- A user should be able to see information about all the songs on the site.
- A user should be able to view a page with data about one particular album.
- A user should be able to add songs to an album.
- A user should be able to see the songs that belong to an album when looking at that album.

```

## to run:
- clone repo
- download intellij
- run 'build project'
- navigate on a browser to : http://localhost:8080/albums
### if not on a mac
- in src/main/resources/application.properties 
- add your unique postgres login and password. 

## for basic functionality go to:
- navigate on a browser to : http://localhost:8080/
- You will see the root!
- navigate on a browser to : http://localhost:8080/sayHello
- It will say hello!
- navigate on a browser to : http://localhost:8080/capitalize/{message here}
- Any message you type will be capitalized.
- navigate on a browser to : http://localhost:8080/reverse/{mirror this}
- anything you type will be reversed, by word.
- navigate on a browser to : http://localhost:8080/songs
- show and create songs
- navigate on a browser to : http://localhost:8080//albums/{id}
- see any particular album by ID
- navigate on a browser to : http://localhost:8080//albums
- see all albums



## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Create unique routes
- Create a method to reverse a string

- create additional controller
- create class for model album
- autowire to PSQL

- create a song model
- link song model to album
- provide visible data from PSQL back to user

## Credits and Contributions
Nick Paro

