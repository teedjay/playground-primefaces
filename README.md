# playground-primefaces
Playing around with PrimeFaces

## How to compile and run using Jetty :
Use the commands below to compile and run in Jetty, then open your browser at [http://localhost:8080/]

<pre>mvn clean package</pre>
<pre>mvn jetty:run</pre>

## Context Parameters (in web.xml)
Use these *<context-param/>* to tweak the settings of JSF and PrimeFaces.

| context-param | default | description |
| ------------- | ------- | ----------- |
| javax.faces.PROJECT_STAGE | Development | *Development*, *Production*, *SystemTest*, *UnitTest* |
| javax.faces.FACELETS_SKIP_COMMENTS | false | Comments are part of the XHTML DOM and would count as a column if used in PanelGrid etc |
| primefaces.THEME | artisto (built-in) | Theme of the application, remember to add maven dependency for the theme jar |
| primefaces.SUBMIT | full | Select *full* or *partial* ajax submit mode |
| primefaces.RESET_VALUES | false | When enabled, ajax updated inputs are reset first (*true* or *false*) |
| primefaces.CLIENT_SIDE_VALIDATION | false | Controls client side validatation (*true* or *false*) |
| primefaces.UPLOADER | auto | Defines uploader mode; *auto*, *native* or *commons* |
| primefaces.DIR | ltr | Rendering orientation left-to-right (*ltr*) og right-to-left (*rtl*) |
| primefaces.SECRET | primefaces | Secret key to encrypt-decrypt value expressions exposed in rendering StreamedContents |
| primefaces.PUSH_SERVER_URL | null | Custom server url for PrimeFaces Push (not sure if this is used in 5.x) |

