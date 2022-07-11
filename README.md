
**Today's exercise**: Java Cats 🐈 + owners!💁🏻

**Repo**: hoxton-java-cats

**Description**:

Let's continue working on yesterday's exercise and add an owner to the equation. We will learn how we can make classes "talk to each other".

**Instructions**

- Create an Owner class. It should have these variables:
  - name (string)
  - age (integer)
  - address (string)
- An ArrayList of people called, well, `people`.
- Create a class method to create a person providing all the data
- Update the Cat class:
  - the cat can also have an owner as a variable
  - an override `toString` to print a cat's data to the console. Once run, the user should see something like:
"This is Oliver, who is 4 years old. Oliver doesn't like cuddles. This cat's favourite toy is an empty can of coke. The cat's owner's name is Theresa, who is 69 and lives on 420 Blaze street"
- When creating a cat the owner should now be an argument

**Challenge 1**
Can we have all 3 cats share the same owner?

**Challenge 2**
Create a method in the Owner class to print all the cats they have. Like:
"Theresa is in possession of 5 cats: Oliver, Holly, Yankee, Eric, Alex."