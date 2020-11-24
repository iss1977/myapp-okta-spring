# Sping-boot + Okta

### Goals

To build an application with a simple Rest-API to authenticate with Okta

### Setting up the application

1. Create a Okta developer account and setup an application.
    
    Select auth method : Java. 

2. Generate your app at https://start.spring.io 

    As dependencies choose : `Spring Web` and `Okta SECURITY`
  
3. We must configure the Okta Maven Plugin. 
   
   You can find the documentation here: https://oktadeveloper.github.io/okta-maven-plugin/plugin-info.html and here : https://github.com/oktadeveloper/okta-maven-plugin

   run the command "okta:login" like this  : `mvn com.okta:okta-maven-plugin:login` in your project home directory. This will create a file in your home directory : `C:\Users\{your folder name}\.okta\okta.yaml`

   Okta Org URL: https://dev-1482776.okta.com/


   You must generate the token on okta's homepage. My is "00Iti1KDtT9flw3VYCuxRcLScvofYE4fqFT0HbNueO"

   This will change your `application.proprieties` file in your `src/resources` folder.
     
   Your file should look like this: 
```text
#Mon Nov 23 21:29:44 CET 2020
okta.oauth2.issuer=https\://dev-1482776.okta.com//oauth2/default
okta.oauth2.client-secret=QEAyUk3TmdCcA42I21Iyr6mhWQwNpzecos8N8ekS
okta.oauth2.client-id=0oa1byxpzHW6q7Yfs5d6

```

| Description | Link |
|---|---|
| How to video | https://www.youtube.com/watch?v=ptzPD-u7LFU |
|Okta Maven plugin|https://github.com/oktadeveloper/okta-maven-plugin|
|Get Started with Spring Boot, OAuth 2.0, and Okta|https://developer.okta.com/blog/2017/03/21/spring-boot-oauth|
|OpenID Connect & OAuth 2.0 API |https://developer.okta.com/docs/reference/api/oidc/|
|Use the Authorization Code flow|https://developer.okta.com/docs/guides/implement-auth-code/use-flow/|
|Get Started with Java + Okta|https://developer.okta.com/code/java/|
