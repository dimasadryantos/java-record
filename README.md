#### To compile record class :
javac --enable-preview -source 17 Buyer.jav
javap -p Buyer

#### Questions
- Can record extend any other class ? No,the reason is because record by deisign is final and can't be enanced
(https://stackoverflow.com/questions/71139939/why-java-records-do-not-support-inheritance)

- Can we use Java record in the controller ?

#### Github repository : https://github.com/dimasadryantos/java-record
