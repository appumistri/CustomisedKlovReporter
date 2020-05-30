# CustomisedKlovReporter
Customised Klov reporter to have external logo, favicon, project name and report name.

<h3>Pre-requisites to build the jar:</h3>
<ol>
  <li>Java development kit</li>
  <li>Maven build tool</li>
</ol>

<h3>Steps to build & execute:</h3>
<ol>
  <li>Clone the project</li>
  <li>Run <code>mvn clean install</code></li>
  <li>Get the jar file (<code>klov-0.0.3.jar</code>) from target location</li>
  <li>Copy the application properties and logger properties (link given below) to same folder as of <code>klov-0.0.3.jar</code></li>
  <li>Change the report name and title in property file accordingly</li>
  <li>Create folder <code>resources/images</code> and have your logo and icon files here with name <code>logo.png</code> and <code>favicon.png</code></li>
  <li>Run <code>java -jar klov-0.0.3.jar</code></li>
</ol>

[application properties](appumistri/CustomisedKlovReporter/blob/master/src/main/resources/application.properties)
<br/>
[logger properties](appumistri/CustomisedKlovReporter/blob/master/src/main/resources/application.properties)

<b>Note:</b> You must have a mongo db instance running for the reports to work. For basic setun, going through the official documentation of Klov report is advised.
