# Reading the Bard

- Fork this repository to your own github account. (Hit the *Fork* button above.)
- Clone it locally from your forked repository: ```git clone https://github.com/<your github name>/java-cbus-reading-the-bard```
- Usinig Git Bash or the Command Prompt (on a Windows machine) or a terminal (Linux/Mac):
	- navigate into the folder where you cloned the repository (its default name will be *java-cbus-reading-the-bard*)
	- run the command ```gradlew eclipse``` -- this will generate eclipse project files
- Launch Eclipse
	- From the *File* menu, choose *Import...*
		- expand *General*, then select *Existing Projects into Workspace* and hit the *Next* button
		- Hit the *Browse* button, and select the directory where you cloned the project
		- check the box for the project (which should be named *java-cbus-reading-the-bard*) and hit *Finish*
- Tell your instructor where these instructions were wrong :wink:

This exercise uses a folder structure that is a bit different than what we've used in the past. The de facto standard in the enterprise world, due to the influence of Gradle (and Maven before it) uses *src/main/java* for production source files and *src/test/java* for test files. Resources (files other than java files) are located in *src/main/resources* and *source/test/resources*.

You will find the files already created. (Do not create any additional java files.) Your job is to write the code to make the tests pass and make the apps function. The comments should guide you through the exercise. Look for TODO comments -- the Eclipse Tasks view will help you find these.


