# Simple Search Engine

## Description

This is a **console-based search engine** built with **Java** that allows users
to search through a collection of text entries using various matching strategies.
It reads data from a text file and lets users find relevant information based on input keywords.

This project is designed to build understanding of:
- **Strategy design pattern**
- **String processing and search algorithms**
- **Data structures** like arrays, lists, and maps
- **Command-line interaction**
- Implementing different **search strategies** (ALL, ANY, NONE)

Completing this project strengthens ability to build **information retrieval systems** and manipulate data effectively in Java.

---

## Program Flow

1. **Data Loading**:
    - At startup, the program loads all lines from a given `.txt` file into memory.
2. **Main Menu Options**:
    - `0. Exit`: Terminate the program
    - `1. Find a person`: Search using a selected matching strategy
    - `2. Print all people`: Print the entire dataset
3. **Search Strategies**:
    - `ALL`: Finds entries containing **all** the search terms
    - `ANY`: Finds entries containing **any** of the search terms
    - `NONE`: Finds entries that contain **none** of the search terms
4. **User Interaction**:
    - Users choose a strategy, enter keywords, and the engine returns matching results from the dataset.
