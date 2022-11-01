# Annotations

- Don't have behaviour
- Programmer needs to check annotation present or not and process result
- It carries information
- Methods should not have parameters , can have default values
- Notes
    - Have only abstract methods
        - No static , default , private methods allowed
    - Cannot extend
        - super interface is annotation
    - Cannot be generic
    - Top level or member , local not permitted
    - Objects methods cannot be used
    - Permitted to declare constants
    - Permitted to declare nested classes and interfaces

- Inspection
    - Human reading source
    - by compiler
    - by tool loading class file
    - Running JVM using reflection
- Target
    - ANNOTATION_TYPE
    - METHOD
    - CONSTRUCTOR
    - FIELD
    - LOCAL_VARIABLE
    - MODULE
    - PACKAGE
    - PARAMETER
    - TYPE
    - TYPE_PARAMETER
    - TYPE_USE
- Retention
    - SOURCE
    - CLASS
    - RUNTIME In running JVM using reflection we can inspect

- Element Data Types
    - Primitive types
    - String
    - Class
    - Enum
    - Annotation interface
        - not itw own type
    - Elements can also be single dimensional array

- Repeatable annotations
    - @Repeatable

# Async Programming
- API
  - CompletionStage 
  - CompletableFuture
- Why async ?
    - Problems with async
        - testing
        - debugging
        - reading
        - writing is hard
    - It increases throughput eg: web application : amount of http requests processing per second messaging
      application : amount of messages processing per second

- Synchronous :
  -  You need to wait for a task to complete to continue to work on other task
  -  Blocking code

- ASynchronous :
  - Tasks to be executed some time in future
  - Non-Blocking code

- Concurrent:
- ASynchronous on top of Concurrent:
  - CompletionStage
  - CompletableFuture
  

  