# CleanQA
Repository which demonstrates the easy use of Espresso Android Testing Framework Written in Java for applying automation testing. (Includes Hand Written Notes as well)

- Studied About Following Espresso Key Concepts
- All test are written in the (androidTest) package folder.
- For the Target Device the transition, animation scales should be disabled from developer options
or else Perform Exception is thrown from the Espresso Library.
- @Rule & ActivityScenarioRule tells espresso in which activity we need to perform the UI test.
- @Test annotation describes that the tests are starting from here.
- For Performing Operation on RecyclerView we need the following dependency in the gradle script
- It is better to create a SleepDelay Method inside everyclass of Unit Testing. (However I know it's against the principle of automating testing)