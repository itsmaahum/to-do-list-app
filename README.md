# To-do List App (Java CLI)

A simple command-line todo list application written in Java. It lets you add, view, and remove tasks, with basic category support. Tasks are saved to a file so they persist between runs.

---

## Features

- Add tasks with a description and category
- View all tasks
- Remove tasks by number
- Simple category labeling (e.g., School, Work, Personal)
- Saves tasks to a local file (`tasks.txt`)

---

## How to Run

From the project folder:

```bash
javac src/*.java
java -cp src Main
```

## How It Works

When you run the program, you’ll see a menu where you can choose actions like adding or listing tasks.

Example task:
```text
[1] Finish homework (School)
```

## Storage

Tasks are saved in tasks.txt like this:

```text
Finish homework,School
Buy groceries,Personal
```

The file updates automatically whenever you add or remove a task.

## Project Structure
```text
src/
  Main.java
  Task.java
  TodoManager.java

tasks.txt
```

