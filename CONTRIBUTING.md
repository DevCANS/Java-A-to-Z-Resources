# Contribution Guidlines

Welcome to [Java A-Z Resources](https://github.com/prateekKrOraon/Java-A-to-Z-Resources)

## Contributing
* Fork this [repo](https://github.com/prateekKrOraon/Java-A-to-Z-Resources)
* Make changes and pull a request
* The changes should reflect in the [README](README.md) contents table according to the given legend below
* In case of a new topic it should pe present in the [Java Syllabus](Java-Syllabus.md) and [README](README.md) contents table
* Each topic must have one file which should be linked from the [Java Syllabus](Java-Syllabus.md)
* If change in syllabus is need [open an issue](https://github.com/prateekKrOraon/Java-A-to-Z-Resources/issues)

## File Name Guidelines
* All files must be a markdown file with extension `.md`
* File name must be same as topic name with `-` instead of spaces
* File name must be suffixed with a two digit number representing the order in which they appear in the particular section of [Java Syllabus](Java-Syllabus.md)

        03TopicName.md      INCORRECT NAME
        03 Topic Name.md    INCORRECT NAME
        03-Topic-Name.md    CORRECT NAME
* Each section should have a separate folder. Folder naming convention should be same as above.

## Content Guidelines

* The name of the topic should be H1 heading

    ```
    ># Topic Name
    ```
* Sub Topics should be H2 heading

    ```
    ## Sub Topic
    ```

* Example and Output headings should be H5

    ```
    ##### Example <Number>
    ##### Output
    ```

* Code should be written with syntax highlighting

    ```
        ```java
        //java Code
        ```
    ```
* Any Java keyword/class name/method name/variable name used in the content must be enclosed within __backtick__/__backquote__ ` `` `
* External resources must be added at the end as list
* There should be at least
  * 2 Reading Resource
  * 1 Video Resource
  * 1 Practice/Example/Questions Resource

## Commit Message Guidelines

* If content for new topic is added  
    ```
    New: message
    ```
* If existing files are changed
    ```
    Update: message
    ```

## Legend
|Emoji|Meaning|Mardown|
|---|---|---|
|:heavy_check_mark:|Done|`:heavy_check_mark:`|
|:heavy_minus_sign:|N/A|`:heavy_minus_sign:`|
|:x:|Not Done|`:x:`|
|:warning:|Review Needed|`:warning:`|