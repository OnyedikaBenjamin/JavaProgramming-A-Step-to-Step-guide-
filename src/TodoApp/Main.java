package TodoApp;

import TodoApp.App.TodoList;

public class Main {

        /**
         * To run the program, we will create a TodoList Object
         * then we will run start on it
         *
         *
         * Example of a file path to read from or save to
         * /XXXX/XXXX/XXXX/file.txt
         *
         *
         * After reading press 5 to display the tasks that were read from the file.
         *
         * Enjoy using the program!
         *
         */
        public static void main(String[] args) {


            TodoList toDoList = new TodoList();

            toDoList.start();
        }



}
