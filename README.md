# Password-Generator-Java
Functionalities:

1- Generating a Password:
* The user need to provide an answer by Yes or No the questions to know if he desires to use Uppercase/Lowercase letters, Numbers or Symbols 
* The user then enters the desired length of the password
* A password alphabet is generated according to the Yes/No answers it is a String that contains the choices of the user
* Depending on the length random characters from the password alphabet are selected and put back to back to form a totally random string according to the user's needs
* The randomly generated password is then displayed on the console

2- Checking a Password's Strength:

The Strength check is based on the following criteria:
* The password uses Uppercase Letters
* The password uses Lowercase Letters
* The password uses Numbers
* The password uses Symbols
* The length of the password is 8 or more (8 is often the minimum required length for a decent password)
* The length of the password is 16 or more (16 is considered to be the minimum length for good password)

These are used to calculate a score for the password used to know what message to display to the user weak/medium/good/great password

3- Displaying Useful Information:

This is a minor feature that displays on the console so information for the user about password security (Avoid using the same password twice/ Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences, etc.)
